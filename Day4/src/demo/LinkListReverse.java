package demo;
import java.util.LinkedList;
import java.util.*;

public class LinkListReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList a=new LinkedList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		Iterator itr = a.listIterator();
		for(int i=0;i<a.size();i++)
		{
			
			System.out.println(a.get(i));
		}
		System.out.println("linked list in reverse order:");
		for(int i=a.size()-1;i>-1;i--)
		{
		
			System.out.println(a.get(i));
		}
	
		
		
	}

}
