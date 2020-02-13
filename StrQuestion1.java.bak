import java.util.*;
class StrQuestion1
{
	static void fun(String ques,int count,String ans)
	{ count=0;
		
		

		if(ques.charAt(0)=='p' && ques.charAt(1)=='i')
			fun(ques.substring(2),count+1,ans);
		else
			fun(ques.substring(1),count,ans+ques.charAt(0));
		
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String ques = "12@+n*pi*pi";
		int count = 0; String ans="";
		fun(ques,count,ans);
		
	}
} 