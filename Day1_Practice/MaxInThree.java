
import java.util.Scanner;
public class MaxInThree
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3;
		System.out.print("Enter first number: ");
		n1=sc.nextInt();
		System.out.print("Enter Second number: ");
		n2=sc.nextInt();
		System.out.print("Enter Third number: ");
		n3=sc.nextInt();
		if(n1>n2&&n1>n3)
		{
		 	System.out.print("Maximum between Three Numbers is "+n1);
		}
		else if(n2>n1&&n2>n3) 
		{
		    System.out.print("Maximum between Three Numbers is "+n2);
		}
		else
		{
		    System.out.print("Maximum between Three Numbers is "+n3);
		}
		
	}
}
