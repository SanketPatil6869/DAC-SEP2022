/*
Que.25] Java Program to Check Whether Which One is Executed First, Static Block or the Static 
Method
*/

class Class25
{
	static void staticMethod1()
	{
		System.out.println("Calling Static Method1");
	}
	
	
	static
	{
		System.out.println("Calling Static Block");
	}
	
	public Class25()
	{
		System.out.println("Calling Constructor");
	}
	
	static void staticMethod2()
	{
		System.out.println("Calling Static Method2");
	}
	
	public static void main(String args[])
	{
		Class25 obj = new Class25();
		obj.staticMethod1();
		obj.staticMethod2();
	}
}

/*
Output:-
Calling Static Block
Calling Constructor
Calling Static Method1
Calling Static Method2

*/