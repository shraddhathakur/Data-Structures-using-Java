import java.util.*;
 class Switch1
 
  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		int a = sc.nextInt();
		int b = sc.nextInt();



		switch(c)
		{
			case '+':
		System.out.println( "a +b = " + (a+b));break;
			case '-':
		System.out.println("a - b = " + (a-b));break;
			case '*':
		System.out.println("a * b = " + (a*b)); break;
			case '/':
		System.out.println("a / b = " + (a/b)); break;
			case '%':
		System.out.println( "a %  b = " + (a%b)); break;
			
			default: System.out.println("None");
		}


	}
}