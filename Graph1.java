/*package whatever //do not write package name here */

import java.io.*;

class Graph1 
{
	int v;
	int [][] mat;
	 Graph1(int a)
	{
		 v=a;
		 mat = new int[v][v];
	}
	void addEdge(int a,int b,int w)
	{
		mat[a][b]=mat[b][a]=w;
	}
	void printMat()
	{
		for(int i =0;i<v;i++)
		{	
			for(int j=0;j<v;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Graph1 g = new Graph1(5);
		g.addEdge(0,1,3);g.addEdge(0,2,1);g.addEdge(1,2,7);g.addEdge(1,3,5);g.addEdge(1,4,1);g.addEdge(2,3,2);g.addEdge(3,4,7);
		
		g.printMat();
	}
}
