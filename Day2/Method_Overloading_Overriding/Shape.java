import java.util.*;
public class Shape 
{
	public void getarea()
	{
		System.out.println("Give area of selected shape");
	}
	public static void main(String args[])
    {   
     Shape obj2=new Shape();
     obj2.getarea();
     Rectangle obj =new Rectangle();
	 obj.getarea();
    }
}
 class Rectangle extends Shape
{
    
	public void getarea()
	{   
        Scanner sc=new Scanner(System.in); 
        int l,b;
        System.out.println("Length of Rectangle is: ");
        l=sc.nextInt();
        System.out.println("Bredth of Rectangle is: ");
        b=sc.nextInt();
        
		System.out.println("Area of rectangle is: "+l*b);
	}
	
}
