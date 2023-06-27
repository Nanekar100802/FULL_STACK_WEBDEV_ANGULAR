package demo;
import java.util.*;

public class CollectionHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h= new HashSet();
		h.add("Saurabh");
		h.add("Suraj");
		h.add("Omi");
		h.add("Pathya");
		Iterator itr= h.iterator();
		while(itr.hasNext()){    
	           System.out.println(itr.next());    
	        }  

	}

}
