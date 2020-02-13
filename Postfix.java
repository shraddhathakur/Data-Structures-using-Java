
import java.util.Scanner; 
import java.util.Stack; 

public class Postfix 
{ 
	
	static int evaluatePostfix(String exp) 
	{ 
		
		Stack<Integer> stack=new Stack<>(); 
		
	 
		for(int i=0;i<exp.length();i++) 
		{ 
			char c=exp.charAt(i); 
			
			 
			if(Character.isDigit(c)) 
			stack.push(c - '0'); 
			
			
			else
			{ 
				int val1 = stack.pop(); 
				int val2 = stack.pop(); 
				
				switch(c) 
				{ 
					case '+': 
					stack.push(val2+val1); 
					break; 
					
					case '-': 
					stack.push(val2- val1); 
					break; 
					
					case '/': 
					stack.push(val2/val1); 
					break; 
					
					case '*': 
					stack.push(val2*val1); 
					break; 
			} 
			} 
		} 
		return stack.pop();	 
	} 
	
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
	    int t =sc.nextInt();
	    sc.nextLine();
	    while(t-->0){
	     String exp=sc.nextLine();
		System.out.println(evaluatePostfix(exp)); 
	} 
} 
}
