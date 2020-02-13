class Binary 
{
	public static void main(String[] args) 
	{
		int a[]={16,19,20,23,45,56,78,90,96,100};
		int end = 9;int  start=0; int pos;
		int mid = start+(end-start)/2; 
		int val=45;
		if(a[mid]==val)
		{
			System.out.print("element found:  " +val);
		}
		else if(a[mid]<val)
		{
			mid=mid+1;
			System.out.print("element found: " );
		}
		else if(a[mid]>val)
		{
			mid=mid-1;
			System.out.print("element found : " );
		}
		else 
		{
          System.out.print("element not found : " );
		}
        
		
	}
}
