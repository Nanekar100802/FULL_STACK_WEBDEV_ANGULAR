package demo;
import java.util.*;

public class ArrListReverse {
//clt+shift+o
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		Iterator itr= a.iterator();
		for(int i=0;i<4;i++)
		{
			System.out.println("Actual Array");
			System.out.println(a.get(i));
		}
		for(int i=3;i>-1;i--)
		{
			System.out.println("Reversed Array");
			System.out.println(a.get(i));
		}
		
		
	}

}
