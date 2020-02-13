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

public  class BinaryTreeDemo
{
	static int NoOfNodes(Node root)
{
	if(root==null)
		return 0;

	return 1+NoOfNodes(root.left)+NoOfNodes(root.right);
}
static int NoOfLeafNode(Node root)
{
if(root==null)
	return 0;

if(root.left==null && root.right== null)
	return 1;
else
	return NoOfLeafNode(root.left)+NoOfLeafNode(root.right);

}
	public static void main(String[] args) 
	{
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(7);
		root.left.left = new Node(6);
		root.left.right = new Node(1);
		root.right.right = new Node(5);
		root.right.right.right = new Node(5);
        System.out.println(NoOfNodes(root));
		System.out.print(NoOfLeafNode(root));
	}
}




