import java.util.*;
class  Index
{
	public static void main(String[] args) 
	{
		String s = "helloworld";
		System.out.print(indexOf1(s));
	}
	static int indexOf1(String s)
	{

		int[] alp = new int[26];
	

        for(int i = 0;i<s.length();i++){
            int k = s.charAt(i);
            alp[k-97]+=1;
        }
        for(int j = 0;j<s.length();j++)
			{
            int r = s.charAt(j);
            if(alp[r-97] == 1){
               return j;
            }
        }
		return -1;
      

	}
}
