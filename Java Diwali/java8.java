class Object{
	static int count;
	Object()
	{
		count++;
	}
}
class java8{
	public static void main(String args[]){
		Object b=new Object();
		Object b1=new Object();
		Object b2=new Object();
		System.out.println("Count is="+Object.count);
	}
}
/*
Count is=3	
*/