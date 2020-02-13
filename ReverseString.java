import java.util.*;
public class ReverseString {
    public static void main(String[] ar)
    {


                String str, reverse = "";

                StringBuffer sb = new StringBuffer();
                str = sb.nextLine();

                int length = str.length();

                for (int i = length - 1 ; i >= 0 ; i--)
                    reverse = reverse + str.charAt(i);

                System.out.println( reverse);

    }
}
