import java.util.Scanner;  
public class EvenOddElements   
{  
public static void main(String[] args)   
{  
int n;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");  
n=sc.nextInt();  
int[] array = new int[10];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
array[i]=sc.nextInt();  
}  
System.out.println("Even Array elements are: ");  
for (int i=0; i<n; i++)   
{  
    if(array[i]%2==0)
    {
      System.out.println("Even elements in an array are "array[i]);    
    }
    else
    {
       System.out.println("Odd elements in an array are "array[i]);  
    }

}  
}  
} 