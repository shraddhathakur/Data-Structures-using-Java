import java.util.*;
class  RemoveDup
{
	void remove(int arr[],int n)
	{
	HashMap<Integer, Boolean> mp = new HashMap<>(); 
  
        for (int i = 0; i < n; ++i) 
        { 
  
            // Print the element if it is not 
            // there in the hash map 
            if (mp.get(arr[i]) == null) 
                System.out.print(arr[i] + " "); 
  
            // Insert the element in the hash map 
            mp.put(arr[i], true); 
        } 
    } 


	public static void main(String[] args) 
	{
		RemoveDup r=new RemoveDup();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 

		int a[]= new int[n];
		for(int i = 0 ; i < n;i++)
		{
			a[i]=sc.nextInt();
		}
r.remove(a,n);

	}
}
