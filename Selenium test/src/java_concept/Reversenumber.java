package java_concept;

public class Reversenumber {

	
	public static void main(String[] args) {
     
		int number=43 ;
		int reverse=0;
		
		while(number!=0)
		{
		  int digit = number % 10;
		
		  reverse= reverse*10+digit ;
		  number/=10;
		  	  
		}
		System.out.println(reverse);
		

	}

}
