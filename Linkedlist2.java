class Node
{

	int data;
	Node next;
	Node(int d)
	{
		data=d;
		
	}
}

public class Linkedlist2
{
     Node head;

	void insertinend(int x)
		{
			Node temp=new Node(x);
			if(head==null)
				head=temp;
			else
			{
				Node temp1 = head;
				while(temp1.next!=null)
				{
				temp1=temp1.next;
				
			}
			temp1.next=temp;
				
			}
		}
      
		 void display()
		{
			  Node temp=head;
			  while(temp!=null)
			{
				  System.out.print(temp.data+" ");
				  temp=temp.next;
			}

		}
		public static void main(String args[])
	{
		
		Linkedlist2 ob = new Linkedlist2();
		ob.insertinend(10);
		ob.insertinend(20);
		ob.insertinend(30);
		ob.insertinend(40);
		ob.insertinend(50);
		ob.display();
	}
}
