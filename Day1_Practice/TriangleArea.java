import java.util.Scanner;

public class TriangleArea
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner (System.in);
        int base,height,area;
        System.out.println("Enter base of Triangle: ");
        base=sc.nextInt();
        System.out.println("Enter height of Triangle: ");
        height=sc.nextInt();
        area=((base*height)/2);
        System.out.println("Area of Triangle is: "+area);
        
        
        
    }
}