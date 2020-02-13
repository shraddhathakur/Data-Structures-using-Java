-class Node
{

	int data;
	Node prev;
	Node next;

	Node(int x)
	{
		data=x;
		
	}
}

public class Linkedlist
{
     Node head;

	void insertend(int x)
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
				temp.prev = temp1;
		}
		}


		 void display()
		{
			  Node temp=head;
			  while(temp!=null)
			{
				  System.out.println(temp.data);
				  temp=temp.next;
			}

		}

		public static void main(String args[])
	{
		
		Linkedlist ob= new Linkedlist();
		ob.insertend(10);
		ob.insertend(20);
		ob.insertend(30);
		ob.insertend(40);
		ob.display();
	}

}



