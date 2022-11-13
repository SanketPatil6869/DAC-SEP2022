// 19. Java Program to Create an Object for Class and Assign Value in the Object using Constructor

// Class Declaration
public class Student
{
	// Instance Variables
	String name;
	String course;
	int age;

	// Constructor Declaration of Class
	public Student(String name, String course,int age)
	{
		this.name = name;
		this.course = course;
		this.age = age;
	}

	// method 1
	public String getName()
	{
		return name;
	}


	public static void main(String[] args)
	{
		// creating object using new operator
		Student s1 = new Student("Ravi","CSE",23);
		
		System.out.println(s1.getName());
	}
}
