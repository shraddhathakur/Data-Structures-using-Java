class Graph 
{
	int v;
	int [][] mat;
	 Graph(int a)
	{
		 v=a;
		 mat = new int[v][v];
	}
	void addEdge(int a,int b)
	{
		mat[a][b]=mat[b][a]=1;
	}
	void printMat()
	{
		for(int i =0;i<v;i++)
		{	System.out.print(i);
			for(int j=0;j<v;j++)
			{
				if(mat[i][j]==1)
				System.out.print("-> "+j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Graph g = new Graph(5);
		g.addEdge(0,1);g.addEdge(0,2);g.addEdge(0,3);g.addEdge(0,4);g.addEdge(4,2);g.addEdge(4,3);
		g.printMat();
	}
}
