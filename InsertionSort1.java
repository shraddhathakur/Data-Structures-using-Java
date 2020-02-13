import java.util.*;
class InsertionSort1 
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
        int n = arr.length;
		for (int i=0; i<n; ++i) 
		{  
		
            System.out.print(arr[i] + " "); 
		}
        System.out.println();
        
    } 
  
	public static void main(String[] args) 
	{
		InsertionSort1 bb = new InsertionSort1();
       Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}   

		
		bb.insertionSort(arr);
		bb.printArray(arr);



	}
}
