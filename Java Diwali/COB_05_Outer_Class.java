
// Java Program to Illustrates Use of Referencing the Object from Inner Class


public class COB_05_Outer_Class
{
    static COB_05_Outer_Class.InnerClass obj;
	
    void test1()
    {
        System.out.println("Success");
    }
	
    static public class InnerClass
    {
    	private String name = "Peakit";
        public void test2()
        {
            COB_05_Outer_Class outer = new COB_05_Outer_Class();
            outer.test1();
        }
    }
	
    public static void main(String[] args)
    {
        obj = new COB_05_Outer_Class.InnerClass();
        obj.test2();
    }
}

/*
Output:

Success
*/

/*
This is a Java Program to Illustrates Use of Referencing the Object from Inner Class.
It is possible to define a class within another class, such classes are known as nested classes. The most important type of nested class is the inner class. An inner class is a non-static nested class. It has access to all of the variables and methods of its outer class and may refer to them directly in the same way that other non-static members of the outer class do.
*/