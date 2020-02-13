class PatternMatching  
{
	public static void main(String[] args) 
	{
		String s = "abcdefabc";
		String pattern = "abc";
	
		int i =0,j;
		while(i<s.length())
		{
			j=0;
			int x = i;
				while(j<pattern.length() && s.charAt(x)==pattern.charAt(j) )
					{
						j++;
						x++;
					}
					if(j==pattern.length())
						System.out.print("i " +x--);
					i++;
					
		}
		
	}
}
