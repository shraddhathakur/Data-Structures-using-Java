import java.io.*;
import java.util.*;
import java.lang.*;
class FileOut 
{
	public static void main(String[] args) 
	{
		
		
			File file = new File("C:/Users/SHRADDHA THAKUR/Desktop/yy.txt");
			FileWriter fileWriter = new FileWriter(file);
			
			
		String reverse = "";
             String str="java programming example";

                int length = str.length();

                for (int i = length - 1 ; i >= 0 ; i--)
		{
                    reverse = reverse + str.charAt(i);

                System.out.println( reverse);
				
				FileWriter.write(reverse);

		}
	
	}
}
