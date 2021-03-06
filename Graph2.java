import java.util.*;
public class Graph2 
{
	public static  int v;
	public static LinkedList<Integer> mat[];
	 Graph2(int a)
	{
		 v=a;
		 mat = new LinkedList[v];
		 for(int i =0;i<v;i++)
		 mat[i]=new LinkedList<>();
	}
	void addEdge(int a,int b)
	{
		mat[a].add(b);
		mat[b].add(a);
	}
	void printMat()
	{
		for(int i =0;i<Graph2.v;i++)
		{	
			System.out.print(i);
			for(int j: Graph2.mat[i])
			{
			
				System.out.print("-> "+j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Graph2 g = new Graph2(5);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(0,3);
		g.addEdge(0,4);
		g.addEdge(4,2);
		g.addEdge(2,3);
		g.printMat();
	}
}
