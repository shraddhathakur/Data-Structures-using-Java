
import java.lang.*;
import java.util.*;
public class Excepclass2{
    public static void main(String args[]){
		int i =50;
		int j=0;
		int data;
		try{
        Scanner sc = new Scanner(System.in);
		data=i/j;
		}
		catch(Exception e)
		{
System.out.println(i/(j+2));
		}
		//System.out.println("out of the block");
	}

}
