import java.util.*;
class StrCharAt
{
	public static void main(String[] args)
		{
			String str = "aaabbbccc";
			int k = 3;
		int n = str.length();
		int t=0,ch=n/k;
		String[] str1 = new String[k];
		if(n % k != 0)
			{
				System.out.println("String cant be divided into " +k +" equal parts");
			}
			else
			{
			for(int i =0;i<n;i=i+ch)
			{
				String p = str.substring(i,i+ch);
				str1[t]=p;
				t++;
			}

			System.out.println(k +" equal parts are : ");
			for(int i =0;i<str1.length;i++)
				System.out.println(str1[i]);
			}
		}
}
				