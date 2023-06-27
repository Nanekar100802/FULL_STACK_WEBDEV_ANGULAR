import java.util.Scanner;
public class RectArea
{
    public static void main (String[] args) 
    {
        int length,bredth,Area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Rectangle: ");
        length=sc.nextInt();
        System.out.println("Enter Bredth of Rectangle: ");
        bredth=sc.nextInt();
        Area=length*bredth;
        System.out.println("The Area of Rectangle is:"+Area);
        
    }
}