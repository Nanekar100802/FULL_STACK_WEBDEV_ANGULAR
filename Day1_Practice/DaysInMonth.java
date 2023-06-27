import java.util.Scanner;
public class DaysInMonth
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Month of which no. of days you want to find: ");
		n=sc.nextInt();
		switch(n)
		{
		    case 1:
		    {
		       System.out.print("31 Days"); 
		       break;
		    }
		    case 3:
		    {
		       System.out.print("31 Days"); 
		       break;
		    }
		    case 5:
		    {
		       System.out.print("31 Days"); 
		       break;
		    }
		    case 7:
		    {
		       System.out.print("31 Days"); 
		       break;
		    }
		    case 8:
		    {
		       System.out.print("31 Days"); 
		       break;
		    }
		    case 10:
		    {
		       System.out.print("31 Days"); 
		       break;
		    }
		     case 12:
		    {
		       System.out.print("31 Days"); 
		       break;
		    }
		    case 4:
		    {
		       System.out.print("30 Days"); 
		       break;
		    }
		    case 6:
		    {
		       System.out.print("30 Days"); 
		       break;
		    }
		    case 9:
		    {
		       System.out.print("30 Days"); 
		       break;
		    }
		    case 11:
		    {
		       System.out.print("30 Days"); 
		       break;
		    }
		    case 2:
		    {
		       System.out.print("28 or 29 days");
		       break;
		    }
		    default:
		    {
		       System.out.print("Enter correct month name"); 
		    }
		}
	}
}
