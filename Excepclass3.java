
import java.lang.*;
import java.util.*;
public class Excepclass3 {
    public static void main(String args[]){
		try{
       
		int a = 30/5;
		
		}
		catch(NullPointerException e)
		{
        System.out.println("Can't divide by zero");
		}
		finally{

		System.out.println("finally of the code");
		}

System.out.println("rest of the code");
	}
}

