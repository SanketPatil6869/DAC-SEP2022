class Demo{
	int a;
	int b;
	Demo()
	{
		a=0;
		b=0;
	}
	Demo(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void increment(Demo d)
	{
		d.a++;
		d.b++;
	}
	Demo returnObject(Demo d)
	{
		d.a++;
		d.b++;
		return d;//return the object
	}
	void print()
	{
		System.out.println("A="+a+" B="+b);
	}
}
class java9{
	public static void main(String args[]){
		Demo d1=new Demo(5,10);
		d1.print();
		Demo d2=new Demo(11,12);
		System.out.println("Passing the Object");
		d1.increment(d2);//Passing the object
		d2.print();
		System.out.println("Return the Object");
		d1.returnObject(d2);
		d2.print();
	}
}

/*
O/p==>	
A=5 B=10
Passing the Object
A=12 B=13
Return the Object
A=13 B=14
*/
