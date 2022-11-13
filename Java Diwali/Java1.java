// Java Program to Illustrate Use of All Features of Abstract Class
abstract class Employee
{
	private int id;
	private String name;
	double salary;
	int basicPay = 20000;
	
	abstract double getSalary(double d);
	
	void setDetails(int id, String name)
	{
		this.id = id;
		this.name = name;

	}
	
	void getDetails()
	{
		System.out.println("Id : "+this.id);
		System.out.println("Name : "+this.name);
	}
}


class RegularEmp extends Employee
{
	
	void setDetails(int id, String name)
	{
		super.setDetails(id,name);
		//getSalary(sal);
		//this.salary = salary;
	}
	
	double getSalary(double d)
	{
		salary = basicPay*d;
		return salary; 
	}	
	void printDetails()
	{
		getDetails();
		System.out.println("Salary : "+salary);
	}
}



abstract class ContractBaseEmp extends Employee
{
	int noOfYears = 5;
	int noOfYears(int noOfYears)
	{
		this.noOfYears = noOfYears;
		return noOfYears;
	}
	

}

class CDACEmp extends ContractBaseEmp
{
	double noOfYearsLeft;
	double getSalary(double d)
	{
		salary = basicPay*d;
		return salary; 
	}
	
	double setDetails(int id, String name,double no)
	{
		super.setDetails(id,name);				
		noOfYearsLeft = noOfYears-no;
		return noOfYearsLeft;
	}
	
	void printDetails()
	{
		getDetails();
		System.out.println("Salary : "+salary);
		System.out.println("NoOfYearsLeft : "+noOfYearsLeft);
	}
	
}
class Java1
{
	public static void main (String args[])
	{
		RegularEmp R1 = new RegularEmp();
		R1.setDetails(1,"Tushar");
		R1.getSalary(2.3);
		R1.printDetails();
		
		System.out.println("=========================");
		
		CDACEmp C1 = new CDACEmp();
		C1.setDetails(2,"Saurabh",2);
		C1.getSalary(1.8);
		C1.printDetails();
	}
}