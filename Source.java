import java.util.*;

public class Source {
   static int count = 0;

   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int[] arr = new int[n];
       for (int i = 0; i < n; i++)
           arr[i] = s.nextInt();
       int k = s.nextInt();
      System.out.print( numberOfIncresingSubSequences(arr, n, k));
   }

   static int numberOfIncresingSubSequences(int[] arr, int n, int k)
   {
       
        int pp[][]=new int[k][n],sum=0;
  
       
        for(int i=0;i<n;i++)
        {
            pp[0][i]=1;
        }
            for(int m=1;m<k;m++)
            {
                for(int i=m;i<n;i++)
                {
                    pp[m][i]=0;
                   
                    for(int j=m-1;j<i;j++)
                    {
                        if(arr[j]<arr[i])
                        {
                        pp[m][i]+=pp[m-1][j];
                        }
                      
                    }
                }
            }
    
        for(int i=k-1;i<n;i++)
        sum+=pp[k-1][i];
  
    return sum;
       
   }
}