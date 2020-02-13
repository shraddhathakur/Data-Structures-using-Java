import java.util.*;
class Dictionary
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	String[] ch = {"hello","soojk","poppy","zoo"};
	String temp="";

	int n = ch.length; 
	for(int i =0;i<n;i++)
	{
		for(int j = i+1;j<n;j++)
		{
			if(ch[i].compareTo(ch[j])>0)
			{
				temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
			}

		}
	}
	for (int i = 0; i < n; ++i)

			System.out.print(ch[i] + " "); 
			
}
}
																																