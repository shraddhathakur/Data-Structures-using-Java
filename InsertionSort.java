import java.util.*;
class InsertionSort 
{
	void insertionSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) {
			int temp=arr[i];
           int j=i-1;
               while(j>=0 && temp<=arr[j])
			{
		    arr[j+1]=arr[j];
			   j=j-1;
			}
			arr[j+1]=temp;
		
		
    }
	}
  void printArray(int arr[]) 
    { 
        int n = arr.length; int  s =0; int e =0;
		for (int i=0; i<n; ++i) 
		{  
			if(arr[i]%2==0)
			{
            System.out.print(arr[i] + " "); 
             e=e+arr[i]; 
			}



		}System.out.print(e + " ");
		
		
			
		
		for(int i = 0; i < n; i++)
		{  
			if(arr[i]%2!=0)
			{
            System.out.print(arr[i] + " "); 
           s=s+arr[i];
			}
	}System.out.print(s + " ");
		        
    } 
  
	public static void main(String[] args) 
	{
		InsertionSort bb = new InsertionSort();
       Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arr[]=new int[n]; int e =0;
		for (int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}   
		
		

		
		bb.insertionSort(arr);
		
		bb.printArray(arr);
        


	}
}
