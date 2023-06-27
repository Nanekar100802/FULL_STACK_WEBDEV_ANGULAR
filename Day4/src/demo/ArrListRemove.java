package demo;
import java.util.*;

public class ArrListRemove {
//clt+shift+o
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List a=new ArrayList();
		a.add("first");
		a.add("second");
		a.add(1,"mid");
		a.add(0,"start");
		Iterator itr= a.iterator();
		//String x=(String) itr.next();
		System.out.println(a.get(0));
		System.out.println(a.remove(0));
		System.out.println(a.get(0));
		
		

	}

}
