import java.util.*;

class ReverseVowels 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(reverse(str));
	}
		static boolean ifVowel(char c)
	{
			return(c == 'a' || c == 'e' || c =='i' || c =='o'||c=='u');

	}



		static String reverse(String str0)
		{
			char[] str = str0.toCharArray();
			String v = ""; int j =0;

			for(int i =0;i<str.length;i++)
			{
				if(ifVowel(str[i]))
				{
					j=j+1;
					v = v+str[i];
				}
			}


			for(int i =0;i<str.length;i++)
			{
			if(ifVowel(str[i]))
			{
				str[i]=v.charAt(--j);
			}
			}
			return String.valueOf(str);

		

		} 


}
