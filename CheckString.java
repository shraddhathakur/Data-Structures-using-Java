import java.util.*;
class CheckString
{
	static boolean check(String str)
	{
		
		for(int i =0;i<str.length();i++)
		{
			for(int j =0;j<str.length();j++)
			{
				if(i!=j &&  str.charAt(i) == str.charAt(j))
				{
						return false;	
					}
			}
				
		}
return true;
	}
	public static void main(String[] args) 
	{
        CheckString o = new CheckString();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
         System.out.print(o.check(str));
	}
}

