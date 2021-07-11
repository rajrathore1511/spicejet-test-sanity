package java_concept;

public class reverseanumberforloop {

	public static void main(String[] args) {
		int num=123, rev=0;
		
		for (;num!=0;num/=10)
				
				{
					int digit =num % 10;
					
					rev=rev*10+digit;
					
				}
		System.out.println(rev);

	}

}
