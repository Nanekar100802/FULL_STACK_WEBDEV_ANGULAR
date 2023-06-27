package demo;
import java.util.*;

public class ArrListUpdate {
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
		System.out.println("Before updation"+a.get(0));
		a.add(0,"updated");
		System.out.println("After updation"+a.get(0));
		
		

	}

}
