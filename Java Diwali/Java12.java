import java.util.*;
class Rectangle
{
		private double length;
		private double breadth;
		private double area;
		
		public void setValues(double length,double breadth)
		{
			this.length=length;
			this.breadth=breadth;
		}
		public double getArea()
		{
			area=length*breadth;
			return area;
		}

}
class Java12
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length");
		double length=sc.nextDouble();
		
		System.out.println("Enter the breadth");
		double breadth=sc.nextDouble();
		
		Rectangle obj=new Rectangle();
		obj.setValues(length,breadth);
		double d=obj.getArea();
		System.out.println("Area of Rectangle="+d);
	}
}