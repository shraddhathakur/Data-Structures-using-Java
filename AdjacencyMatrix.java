import java.util.*;

public class AdjacencyMatrix
{
	public int v;
	public int [][]mat;
	AdjacencyMatrix(int a)
	{
		v=a;
		mat = new int[v][v];
	}

	void addEdge(int a, int b, int weight)
	{
		mat[a][b] = mat[b][a] = weight;
	}

	
	int[] findShortestPath( int s)
	{
		int[] cost = new int[v];
		boolean[] visited = new boolean[v];
		Arrays.fill(cost, Integer.MAX_VALUE);
		Arrays.fill(visited, false);
		
		
		cost[s]=0;
		for(int p=0; p<v; p++)
		{
			int X = findMin(cost, visited);
			for(int i=0; i<v; i++)
			{
				if(mat[X][i]!=0 && visited[i]==false)
					if(cost[X]+mat[X][i]<cost[i])
						cost[i] = cost[X] + mat[X][i];
			}
			visited[X]=true;;
		}
		return cost;
	}

	int findMin(int[] cost, boolean[] visited)
	{
		int min = Integer.MAX_VALUE;
		int minIndex = 0;
		for(int i=0; i<v; i++)
		{
			if(visited[i]==false && cost[i]<min)
			{
				min = cost[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

	void print()
	{
		for(int i=0; i<v; i++)
		{
			for(int j=0; j<v; j++)
			{
				System.out.print(mat[i][j] +" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		AdjacencyMatrix g = new AdjacencyMatrix(5);
		g.addEdge(0,1,3);
		g.addEdge(0,2,1);
		g.addEdge(1,2,7);
		g.addEdge(1,3,5);
		g.addEdge(2,3,2);
		g.addEdge(1,4,1);
		g.addEdge(3,4,7);
		g.print();
		int[] arr=g.findShortestPath(0);
		for(int i=0;i<g.v;i++)
			System.out.println(i+" "+arr[i]);
		System.out.println();
	}
}