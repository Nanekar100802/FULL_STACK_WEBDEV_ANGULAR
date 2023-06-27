import java.util.Scanner;
public class CheckNum
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        n=sc.nextInt();
        if(n>0)
        {
            System.out.print("Given number is positive");
        }
        else if(n<0)
        {
            System.out.print("Given number is negative");
        }
        else
        {
            System.out.print("Given number is zero");
        }
    }
}