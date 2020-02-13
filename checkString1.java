import java.util.*;
class checkString1 
{
	static boolean findDuplicate(String str)
	{
		int freq[] = new int[26]; 
		for(int i =0;i<str.length();i++)
		{
			freq[str.charAt(i)-'a']++;
		}
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]>1)
				return false;		
		}
		 return true;
	}
	public static void main(String[] args) 
	{
		checkString1 o= new checkString1();
	     Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(o.findDuplicate(str));
	}
}
