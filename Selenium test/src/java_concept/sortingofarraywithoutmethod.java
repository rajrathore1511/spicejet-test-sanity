package java_concept;

public class sortingofarraywithoutmethod {

	public static void main(String[] args) {
		
		int a[] = {	2,1,5,4,3};
		
		
		//sorting logic
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
				
			{
				int temp ;
				if(a[j]<a[i])
				{
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
									
				}
				
			}
		
			System.out.println(a[i]);
		
		
		}


	}

}
