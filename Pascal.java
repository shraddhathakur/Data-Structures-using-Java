class Pascal
{
	public static void main(String[] args) 
	{
		int n=1;
		for(int i =0;i<6;i++)
		{
			for(int k=1;k<6-i;++k)
			{

		System.out.print(" ");
			}
			for(int j = 0;j<=i;j++)
			{
				if(j==0 || i==0)
					n=1;
				else
					n=n * (i - j +1)/j;

		System.out.print(" " +n);
		
			}

		System.out.println();

	}
	
	}
		
}
