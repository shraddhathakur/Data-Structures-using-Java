import java.util.*;
class StrQuestion
{
	static String fun(String ques)
	{
		String ans=""; String ans1="";
		for(int i = 0 ; i< ques.length();i++)
		{
		
		char c = ques.charAt(i);
		if(c=='x')
			ans=ans+c;
		else
			ans1=ans1+c;
		
		}
		return ans1+ans;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String ques = sc.nextLine();
		System.out.println(fun(ques));
		
	}
} 