import java.util.*;
class ArrayCopy 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int t;

		int a[]= new int[n];
		for(int i = 0 ; i < n;i++)
		{
			a[i]=sc.nextInt();
		}
     
            
				for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {

                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                
            }
        }
      
		System.out.println(a[j]);
		
	}}


		 

