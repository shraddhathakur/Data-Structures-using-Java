import java.util.*;
class  QuestionDS
{

	static void partition(int[] ar) {
    int temp=0;
    int pivot=ar[0];
    for(int i=ar.length-1;i>=1;i--){
		int j=0;
        if(ar[i]<pivot){
            temp=ar[i];
			for( j=i-1;j>=0;j--)
			{
				if(ar[j]>=pivot)
				{
					ar[j+1]=ar[j];
				}
				else
				{
					ar[j+1]=temp;
					break;
          
                 }
            }
  if(j<0)
			{
	  ar[0]=temp;
    printArray(ar); 
}}}}
		
  
 
   static void printArray(int arr[]) 
    { 
       // int n = arr.length; 
		for (int n: arr){ 
            System.out.print(n + " "); }
			
        System.out.println();
      
    } 
  
	public static void main(String[] args) 
	{   
	//	QuickSort bb = new QuickSort();
	 
		int arr[]={4,5,3,7,2};
	    int n = arr.length;
		//bb.partition(arr);
	   // bb.printArray(arr);



	}
}
	

