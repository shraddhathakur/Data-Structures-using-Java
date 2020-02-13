class Node
{

	int data;
	Node prev;
	Node next;

	Node(int x)
	{
		data=x;
		
	}
}

public class Node1
{
     Node head;

	void insert(int x)
		{
			Node temp=new Node(x);
			if(head==null)
				head=temp;
			else
			{
				temp.next=head;
				head.prev=temp;
				head = temp;
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
		
		Node1 ob= new Node1();
		ob.insert(10);
		ob.insert(20);
		ob.insert(30);
		ob.insert(40);
		ob.display();
	}

}



