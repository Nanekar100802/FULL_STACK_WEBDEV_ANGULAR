
public class Animal 
{
	public void makesound()
	{
		System.out.println("Animal Voices");
	}
	public static void main(String args[])
    {
     Animal obj2=new Animal();
     obj2.makesound();
     Cat obj =new Cat();
	 obj.makesound();
    }
}
 class Cat extends Animal
{
	public void makesound()
	{
		System.out.println("meoww");
	}
	
}
