package java_concept;

public class reversenumberwitharray {
	
	static void reverse(int a[] , int n)
	{
		
		int b[] = new int[5];
		int j=n;
		
		for(int i=0;i<n;i++)
		{
			b[j-1]=a[i];
			
			j=j-1;
		}
		System.out.println("Reverse array is ");
		
		for (int k=0;k<n;k++)
		{
			System.out.print(b[k]);
		}
	}

	public static void main(String[] args) {
		
	int[] arr= {10,20,30,40,50};
	
	reverse(arr,arr.length);
		
	}

}
