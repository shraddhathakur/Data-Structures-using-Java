class Democontinue
{
	public static void main(String[] args) 
	{
		for(int j=1;j<=100;j++)
			{
			if(j%2!=0) //for printing even num
				{
				continue;
				}

			
			System.out.println(j);
			}
			//System.out.println("outside the loop");

	}
}
//if == 0 then prints odd num