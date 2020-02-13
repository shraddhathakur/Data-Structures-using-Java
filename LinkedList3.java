class LinkedList3 
{ 
    Node head; 
  
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  

    void midd() 
    { 
        Node slow = head; 
        Node fast = head; 
        if (head != null) 
        { 
            while (fast != null && fast.next.next != null) 
            { 
                fast = fast.next.next; 
                slow = slow.next; 
            } 
            System.out.println( slow.data); 
        } 
    } 
  
    public void push(int nd) 
    { 
        Node node = new Node(nd); 
  
       
        node.next = head; 
  
      
        head = node; 
    } 
  
    public void print() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+"- - >"); 
            tnode = tnode.next; 
        } 
        System.out.println("NULL"); 
    } 
  
    public static void main(String [] args) 
    { 
        LinkedList3 ob = new LinkedList3(); 
      
            for (int i=6;i>0 ; i--)
            {
            ob.push(i); 
            }
			ob.print(); 
            ob.midd(); 
        
    } 
} 