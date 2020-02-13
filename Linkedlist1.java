class Node
{

	int data;
	Node next;

	Node(int d)
	{
		data=d;
		
	}
}

public class Linkedlist1
{
     Node head;

	void insertinBg(int x)
		{
			Node temp=new Node(x);
			if(head==null)
				head=temp;
			else
			{
				temp.next=head;
				head=temp;
			}
		}
      
		 void display()
		{
			  Node temp=head;
			  while(temp!=null)
			{
				  System.out.println(temp.data+" ");
				  temp=temp.next;
			}

		}
		public static void main(String args[])
	{
		
		Linkedlist1 ob = new Linkedlist1();
		ob.insertinBg(10);
		ob.insertinBg(20);
		ob.insertinBg(40);
		ob.insertinBg(30);
		//ob.insertinBg(50);
		ob.display();
	}
}
