import java.util.*;
class ReverseWords 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str="quick brown fox jumped";
		System.out.println(reverse(str));
		
	}
	static String reverse(String str )
	{
		StringBuilder sb = new StringBuilder(str);
		  String r = sb.reverse().toString();

		  String[] w = r.split(" ");
		  StringBuilder reverse = new StringBuilder();
		  for (String W: w) {
		   sb = new StringBuilder(W);
		   reverse.append(sb.reverse() + " ");
		  }
		  reverse.deleteCharAt(reverse.length() - 1);
		  return reverse.toString();
	}
}