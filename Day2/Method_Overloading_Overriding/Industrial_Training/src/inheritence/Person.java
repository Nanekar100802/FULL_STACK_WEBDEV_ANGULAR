package inheritence;

public class Person 
{
	Person()
	{
		System.out.println("Hello");
	}
	Person(String s)
	{
		System.out.println("Hello"+s);
	}
	public static void main(String args[])
	{
		Person obj=new Person();
		Person obj1=new Person("Saurabh");
	}
}
