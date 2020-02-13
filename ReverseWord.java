import java.util.*;
class ReverseWord
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str="quick brown fox jumped";

		StringBuilder sb  = new StringBuilder();
		sb.append(str);
		sb=sb.reverse();
		
		
		System.out.println(sb);
		
	}
}