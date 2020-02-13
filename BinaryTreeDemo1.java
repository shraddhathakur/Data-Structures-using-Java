import java.util.*;
class Node 
{
	int data;
	Node left;
	Node right;
	Node(int d)
	{
		data = d;
	}
	
}

public  class BinaryTreeDemo1
{


	public Node levelOrderInsertion(Node root, int arr[],int i)
		{
			if(i < arr.length)
			{
				root= new Node(arr[i]);
				root.left = levelOrderInsertion(root.left,arr,2*i+1);
				root.right = levelOrderInsertion(root.right,arr,2*i+2);
			}
			return root;
		}

		public int NoOfNodes(Node root)
	   {
			if(root==null)
				return 0;
			
			return 1+NoOfNodes(root.left)+NoOfNodes(root.right);
    	}

		 void LOD(Node root)
	 {
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			while(q.isEmpty() == false)
		    {
				Node tmp = q.poll();
				System.out.print(" " +tmp.data);
				if(tmp.left != null)
					q.add(tmp.left);
				if(tmp.right != null)
					q.add(tmp.right);
	    	}
	}

	public static void main(String[] args) 
	{
		BinaryTreeDemo1 ob=new BinaryTreeDemo1();
		
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		 Node root=ob.levelOrderInsertion(null,arr,0);
		 
		 System.out.println(ob.NoOfNodes(root));
		 ob.LOD(root);

	}
}
		