class  Ropes
{
	
	{
		Arrays.sort(Ropes);
		int firstop=0;
		int cuttingLength = Ropes[0];
		for(int i =1;i<n;i++)
		{
			if(Ropes[i] - cuttingLength>0)
			{
		
		System.out.println(n-i + " " );
		firstop++;
			}
		}
			if(firstop==0)
				System.out.print("0");

			public static void main(String[] args) 
			{
				int[] Ropes = {5,1,1,2,3,5};
				int n =Ropes.length;
				cutstringRopes{Ropes,n};
	}
}
}