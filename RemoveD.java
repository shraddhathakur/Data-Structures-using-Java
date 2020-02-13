import java.util.*;
public class RemoveD
{
    static int remove(int arr[],int n)
	{
   if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  

	public static void main(String[] args) 
	{
		RemoveD r=new RemoveD();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 

		int a[]= new int[n];
		for(int i = 0 ; i < n;i++)
		{
			a[i]=sc.nextInt();
		}
      
		int length=a.length;
		length	=remove(a,a.length);
		for (int i=0; i<length; i++)  
           System.out.print(a[i]+" ");  

	}

}