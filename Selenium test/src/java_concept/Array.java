package java_concept;

import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = new int[5] ;
		
		array[0]=33;
		array[1]=45;
		array[2]=46;
		array[3]=53;
		array[4]=65;

		//single element print
		System.out.println(array[3]);
		
		//for loop
		for(int i = 0;i<array.length;i++)
			
		{
			System.out.println("values of the array are"+array[i]);
			
		}
		
		//enhanced for loop 
		for (int j : array)
		{
			System.out.println("enhanced for loop array value are "+j);
		}
		
		//iterator can not be user in array 
		/*
		Iterator itr = array.iterator();
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		*/
			
				
	}

}
