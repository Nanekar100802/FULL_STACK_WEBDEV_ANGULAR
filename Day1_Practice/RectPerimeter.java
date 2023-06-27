import java.util.Scanner;
public class RectPerimeter
{
    public static void main (String[] args) 
    {
        int length,bredth,Perimeter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Rectangle: ");
        length=sc.nextInt();
        System.out.println("Enter Bredth of Rectangle: ");
        bredth=sc.nextInt();
        Perimeter=2*(length+bredth);
        System.out.println("The Perimeter of Rectangle is:"+Perimeter);
        
    }
}