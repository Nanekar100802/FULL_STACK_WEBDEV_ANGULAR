import java.util.Scanner;
public class ArithmeticOperation
{
    public static void main (String[] args) 
    {
        int a,b,sum,sub,mult,div;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        a=sc.nextInt();
        System.out.println("Enter Second Number: ");
        b=sc.nextInt();
        sum=a+b;
        sub=a-b;
        mult=a*b;
        div=a/b;
        System.out.println("The Addition of two Numbers is:"+sum);
        System.out.println("The Substraction of two Numbers is:"+sub);
        System.out.println("The Multiplication of two Numbers is:"+mult);
        System.out.println("The Division of two Numbers is:"+div);
    }
}