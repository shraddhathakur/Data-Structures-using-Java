import java.util.*;
class SelectionSort 
{
	void selectionSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) {
			int small=i;
			for(int j=i+1;j<n;j++)
			
				if(arr[small]>arr[j])
				
                  small=j;

				  int temp=arr[small];
				  arr[small]=arr[i];
				  arr[i]=temp;
				
			
                       
		
		
    }
	}
  
 
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
		for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println();
        
    } 
  
	public static void main(String[] args) 
	{
		SelectionSort bb = new SelectionSort();
		int arr[]={5,1,6,4,2,3};
		bb.selectionSort(arr);
		bb.printArray(arr);



	}
}