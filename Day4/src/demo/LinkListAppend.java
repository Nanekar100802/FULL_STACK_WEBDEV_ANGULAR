package demo;
import java.util.LinkedList;
import java.util.*;

public class LinkListAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList a=new LinkedList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		Iterator itr = a.listIterator();
		for(int i=0;i<4;i++)
		{
			
			System.out.println(a.get(i));
		}
		System.out.println("Append an element at last in linked list");
		a.addLast("5");
		for(int i=0;i<a.size();i++)
		{
		
			System.out.println(a.get(i));
		}
	
		
		
	}

}
