
public class Vehicle 
{
	public void Drive()
	{
		System.out.println("Driving a vehicle");
	}
	public static void main(String args[])
    {
	 Car obj =new Car();
	 obj.Drive();
    }
}
 class Car extends Vehicle
{
	public void Drive()
	{
		System.out.println("Driving a car");
	}
	
}
