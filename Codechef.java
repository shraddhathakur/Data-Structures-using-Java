/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		int c = 0;
		for(int i = 0 ;i< n; i++)
		    {
		        String s = sc.next();
		        
		        for(int j = 0 ;j < s.length();j++)
		            
		                for(int k =0;k<str.length();k++)
		                
		                    if(str.charAt(j)==s.charAt(k))
		                    c++;
			          
		               
		            if(c==s.length())
		                System.out.println("Yes");
		               else
		                System.out.println("No");
			}
		    
	}
	
		
		
	}

