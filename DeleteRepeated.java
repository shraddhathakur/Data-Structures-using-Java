import java.util.*;
class DeleteRepeated
{
	public static void main(String[] args)
		{
			String str = "aaabccdd";
			System.out.println(delrep(str));
		}
	static String delrep(String str)
		{
		char[] ch = str.toCharArray();
        String tmp = "";
 
       
        for (char c : ch) {
           
            if (tmp.indexOf(c) == -1)
				{
                tmp = tmp+ c; 
				 }
		}
				 return tmp;
		}
}
				