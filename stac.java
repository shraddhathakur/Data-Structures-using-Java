public class Solution {
    public int evalRPN(String[] A) {
            Stack<Integer> stack=new Stack<>(); 
        
     
        for(int i=0;i<A.length;i++) 
        { 
            String c=A[i]; 
            
             
            if(c.equals("+")|| c.equals("-")|| c.equals("*") ||c.equals("/"))
            { 
                int val1 = stack.pop(); 
                int val2 = stack.pop(); 
                
                switch(c) 
                { 
                    case "+": 
                    stack.push(val2+val1); 
                    break; 
                    
                    case "-": 
                    stack.push(val2- val1); 
                    break; 
                    
                    case "/": 
                    stack.push(val2/val1); 
                    break; 
                    
                    case "*": 
                    stack.push(val2*val1); 
                    break; 
                } 
            } 
               else
               stack.push(Integer.valueOf(c));
        } 
        return stack.pop();
    }
}
