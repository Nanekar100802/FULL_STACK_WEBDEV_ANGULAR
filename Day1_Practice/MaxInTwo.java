/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class MaxInTwo
{
	public static void main(String[] args) 
	{
	    Scanner sc= new Scanner(System.in);
		int n1,n2,max;
		System.out.print("Enter first number: ");
		n1=sc.nextInt();
		System.out.print("Enter Second number: ");
		n2=sc.nextInt();
		max=n1>n2?n1:n2;
		System.out.println("Maximum in two entered number is"+ max );
	}
}
