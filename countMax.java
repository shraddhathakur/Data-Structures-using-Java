class countMax 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int arr[]=new int[n];
			for(int i = 0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.print(printCount(arr));
		}
	}
	static int maxx(int arr[])
	{
		Arrays.sort(arr);int res=0;
		int m = arr[0];
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]>m)
			{
				m=arr[i];
				res=i;
			}
		}
		return res;
		}
		
}
