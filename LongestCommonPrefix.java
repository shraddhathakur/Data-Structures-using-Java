import java.util.*;
class LongestCommonPrefix 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String arr[]={ "hello","hell","helan","hlelli"};
		System.out.println(lcp(arr));
		
	}
	static String lcp(String[] str )
	{
		String substr="";
		int n = str.length;
		Arrays.sort(str);
		int i=0;
		while( i< Math.min(str[0].length(),str[n-1].length())&& str[0].charAt(i)==str[n-1].charAt(i))
		{
			i++;
		}
			
					substr+=str[0].substring(0,i);
				
		 return substr;
		}
	
	}
	


		
