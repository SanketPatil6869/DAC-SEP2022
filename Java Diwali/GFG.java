// 21. Java Program to Allocate and Initialize Super Class Members using Constructor

import java.util.*;
class y {
	int b;
	int c;

	// parameterized constructor of class y
	y(int b, int c)
	{
		this.b = b;
		this.c = c;
		System.out.println("Hi I am parent constructor");
		System.out.println("multiplication of two number "
						+ b + " and " + c + " is "
						+ b * c);
	}
}
class x extends y {
	int a;

	// parameterized constructor of class x
	x(int b, int c, int a)
	{
		
		// calls constructor of y
		super(b, c);
		System.out.println(
			"Hi I am child class constructor");
		System.out.println("class field of x class is "
						+ a);
	}
}

class GFG {

	public static void main(String[] args)
	{
		// creating an object of class x
		// this will invoke the constructor of x
		// but before invoking the constructor of class x
		// it will invoke the constructor of it's parent
		// class which is y
		x obj = new x(3, 4, 5);
	}
}
