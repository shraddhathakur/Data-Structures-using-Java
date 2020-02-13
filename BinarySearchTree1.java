import java.util.*;
class Node 
{
	int val;
	Node left;
	Node right;
	Node(int d)
	{
		val = d;
	}
	
}
public class BinarySearchTree1 
{

	static Node insertinBST(Node root,int d)
	{
		if(root==null)
		{
			root= new Node(d);
			return root;
		}
		if(root.val > d )
			root.left = insertinBST(root.left,d);

		if(root.val < d )
			root.right = insertinBST(root.right,d);

		return root;
	}
	static Node LCA(Node root, int n1, int n2) 
    {
        
        if(root == null)
        return null;
        
        else if(n1 < root.val && n2< root.val)
        return LCA(root.left,n1,n2);
        
        else if(n1 > root.val && n2 > root.val)
        return LCA(root.right,n1,n2);
        
        else
        return root;
    }
	static void inOrder(Node root)
	{
		if (root == null)
			return ;
		
		inOrder(root.left) ;
		System.out.print(root.val + " ");
		inOrder(root.right);
	}
		static void preOrder(Node root)
	{
		if (root == null)
			return ;
		
		
		System.out.print(root.val + " ");
		preOrder(root.left) ;
		preOrder(root.right);
	}
	public static void main(String[] args) 
	{
		Node root = null;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x;
		
		for(int i =0 ; i<n;i++)
		{
			 x = sc.nextInt();
			 root= insertinBST(root,x);
		}
		//inOrder(root);
		//preOrder(root);
		
			Node s = LCA(root,7,8);
			System.out.println(s.val);
	}
}
