
import java.lang.*;
import java.util.*;
public class Excepclass4 {
    public static void main(String args[]){
		try{
       
		String s = null;
		System.out.println(s.length());
		
		}
		catch(ArithmeticException e)
		{
        System.out.println("Can't divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e )
		{
         System.out.println("doesnt occur");
		}
		catch(Exception e){

		System.out.println("parent exception occurs");
		}

System.out.println("rest of the code");
	}
}

