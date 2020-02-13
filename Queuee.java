import java.util.Scanner;
class Queuee 
{
	int[] arr;
	int front,rear;
	Queuee()
	{
		arr= new int[100];
		front =rear = -1;
	}
	void enqueue(int x)
	{
		if(rear == arr.length-1)
		{
			System.out.print("Overflow");
			return;
		}
			rear++;
			arr[rear]=x;
			if(rear==0)
				front=0;
	}
	int dequeue()
		{
		if(front==-1)
			{
			System.out.print("Underflow");
			return -1;
		}
		int temp = arr[front];
		if(front==rear)
			front=rear=-1;
		else
			front++;
		return temp;
        }
		void display()
	{
			for(int i =front;i<=rear;i++)
		{
				System.out.print(arr[i] +" " );
		}
	}
public static void main(String a[])
		{
	
	     Queuee ob = new Queuee();
		 ob.enqueue(3);ob.enqueue(30);ob.enqueue(33);ob.enqueue(34);ob.enqueue(53);ob.enqueue(73);
		 System.out.println(ob.dequeue());System.out.println(ob.dequeue());
		 
         ob.display();
     
		}
}

