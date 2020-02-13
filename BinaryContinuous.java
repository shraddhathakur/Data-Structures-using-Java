

import java.util.*;
import java.lang.*;
import java.io.*;

class BinaryContinuous {
	public static void main (String[] args) {
		
			    String b ="10101110";

			System.out.println(bin(b));
		}

		
		
	 static  int bin(String str)
	{
		int n =str.length();
		int grp[]=new int[n];
		int t=0;
		grp[0]=1;
		for(int i =1;i<n;i++)
		{
			if(str.charAt(i-1)!=str.charAt(i))
				grp[++t]=1;
			else
				grp[t]++;
		}
		int ans = 0;
		for(int i =1;i<=t;i++)
		{
			ans+=Math.min(grp[i-1],grp[i]);
		}
		return ans;


	}


}