import java.util.*;

public class Subsequence1 {
   
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
	  // int[] arr = {1,3,2,4,5};
	   int[] arr = {2,3,4,5,6};
       int n = 5;
      System.out.print( sub(arr, n));
   }

   static int sub(int[] arr, int n)
   {
		int s[] = new int [n];
       for(int i =0;i<n;i++)
       	{
		   s[i]=1;
		}

		for(int i =1;i<n;i++)
       	{
		for(int j =0;j<i;j++)
			{
			if(arr[i]>arr[j])
				s[i] += s[j];
			}
		
		}
	for(int i=0;i<n;i++){
	System.out.print(s[i]+" ");
	}
	int res = 0;
	for(int i =0;i<n;i++)
	   {
			res+=s[i];
	   }
		return res;
       
   }
}