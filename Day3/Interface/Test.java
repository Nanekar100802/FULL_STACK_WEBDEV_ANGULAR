import java.util.*;
import java.io.*;
interface Shape
{
    void getarea();
}
class Circle implements Shape
{
    public void getarea()
    {    
        int r;
        Scanner sc=new Scanner(System.in);
        System.out.print("Give radius of circle");
        r=sc.nextInt();
        sc.close();
        System.out.print("Area of Circle is"+(3.14*r*r));
    }
}
class Square implements Shape
{
    public void getarea()
    {    
        int side;
        Scanner sc=new Scanner(System.in);
        System.out.print("Give side of Square");
        side=sc.nextInt();
        sc.close();
        System.out.print("Area of Circle is"+(side*side));
    }
}
class Triangle implements Shape
{
    public void getarea()
    {    
        int base,height;
        Scanner sc=new Scanner(System.in);
        System.out.print("Give Base of Triangle");
        base=sc.nextInt();
        System.out.print("Give Height of Triangle");
        height=sc.nextInt();
        sc.close();
        System.out.print("Area of Triangle is"+((base*height)/2));
    }
}
class Test
{
    public static void main(String args[])
    {
        Circle ob1=new Circle();
        Square ob2=new Square();
        Triangle ob3=new Triangle();
        ob1.getarea();
        ob2.getarea();
        ob3.getarea();
    }
}