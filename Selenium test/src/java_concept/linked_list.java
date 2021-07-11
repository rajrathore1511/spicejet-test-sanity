package java_concept;

import java.util.Iterator;
import java.util.LinkedList;

public class linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("test1");
		ll.add("test2");
		ll.add("test3");
		ll.add("test4");
		ll.add("test5");
		
		System.out.println("values of the link list are" + ll.get(3));
		
		//by using for loop
		System.out.println("by using for loop");
		
		for(int i=0; i<ll.size(); i++)
			
		{
		 System.out.println( ll.get(i));
		 
			
		}
		
		//using enhanced for loop 
		
		for(String j:ll)
		{
			System.out.println(j);		
			
		
		}
		
 
		//use of iterator 
		System.out.println("By using iterator");
		Iterator itr =ll.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
	}

}
