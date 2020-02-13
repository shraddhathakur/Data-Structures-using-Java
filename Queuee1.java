class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
	}
}
class Queuee1 
{
	Node head;

	int deleteFromBeg()
	{
		int temp=-1;
		if(head == null)
		{
			System.out.println("Underflow");
		}
		else
		{
			temp = head.data;
			head = head.next;
		}
		return temp;
	}
	
	void insertInEnd(int x)
	{
		Node temp = new Node(x);
		if(head == null)
		{
			head = temp;
		}
		else
		{
			Node temp1 = head;
			while(temp1.next != null)
			{
				temp1 = temp1.next;
			}
			temp1.next = temp;
		}
	}
	void display()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public static void main(String[] args) 
	{
		Queuee1 q = new Queuee1();
		q.insertInEnd(1);
		q.insertInEnd(2);
		q.insertInEnd(3);
		q.insertInEnd(4);
		q.insertInEnd(5);
		q.insertInEnd(6);
		System.out.println("Array: ");
		q.display();
		q.deleteFromBeg();
		q.deleteFromBeg();
		q.deleteFromBeg();
		q.deleteFromBeg();
		q.deleteFromBeg();
		//q.deleteFromBeg();
		//q.deleteFromBeg();
		System.out.println("Array after Deleting: ");
		q.display();
	}
}
