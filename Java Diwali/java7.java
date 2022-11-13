abstract class Shape{
	abstract void area();
}
class Circle extends Shape{
	int r;
	Circle()
	{
	}
	Circle(int r)
	{
		this.r=r;
	}
	
	public void area()
	{
		double Area=3.14*r*r;
		System.out.println("Area Of Circle="+Area);
	}
}
class Rectangle extends Shape{
	int len;
	int bre;
	Rectangle()
	{
	}
	Rectangle(int len, int bre)
	{
		this.len=len;
		this.bre=bre;
	}
	public void area()
	{
		double Area=len*bre;
		System.out.println("Area Of Rectangle="+Area);
	}
}
class java7{
	public static void main(String args[]){
		Circle c=new Circle(3);
		c.area();
		Rectangle r=new Rectangle(3,4);
		r.area();
	}
}
	
	
