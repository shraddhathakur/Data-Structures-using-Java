import java.util.*;

public class Subsequence {
   
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int[] arr = new int[n];
       for (int i = 0; i < n; i++)
           arr[i] = s.nextInt();
       int k = s.nextInt();
      System.out.print( sub(arr, n, k));
   }

   static int sub(int[] arr, int n, int k)
   {
       
        int p[][]=new int[k][n];
	int s=0;
  
       
        for(int i=0;i<n;i++)
        {
            p[0][i]=1;
        }
            for(int m=1;m<k;m++)
            {
                for(int i=m;i<n;i++)`
                {
                    p[m][i]=0;
                   
                    for(int j=m-1;j<i;j++)
                    {
                        if(arr[j]<arr[i])
                        {
                        p[m][i]+=p[m-1][j];
                        }
                      
                    }
                }
            }
    
        for(int i=k-1;i<n;i++)
        s+=p[k-1][i];
  
    return s;
       
   }
}