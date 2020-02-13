
import java.util.*;
public class Excepclass {
    public static void main(String args[]){
        try{
            int a[] = new int[2];
            System.out.println("Access element there:" +a[10]);
        }
	/*	catch(ArithmeticException a)
		{

System.out.println("Arithmetic" +a );
		} */
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("exception throw" );


        }
        System.out.println("out of the block");
    }
}
