
import java.lang.*;
import java.util.*;
public class Excepclass1 {
    public static void main(String args[]){
		try{
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
System.out.println("Can't divide by zero");
		}
		//System.out.println("out of the block");
		finally{
			System.out.println("always execute finally block");
		}

	}

}
