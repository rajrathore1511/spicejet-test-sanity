package java_concept;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>() ;
		
		al.add("selenium");
		al.add("test");
		al.add("Raj");
		al.add("kunar");
		
		System.out.println(al.get(3));
		
		//print all element by for loop
		System.out.println("list 1");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
			
		}
		
		System.out.println("list 2");
ArrayList<String> al2 = new ArrayList<String>() ;
		
		al2.add("sel");
		al2.add("testting");
		al2.add("baby");
		for(int j=0;j<al.size();j++)
		{
			System.out.println(al2.get(j));
			
		}
		
		//by using iterator
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
