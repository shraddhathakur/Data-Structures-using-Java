import java.io.*;
import java.util.*;

public class QuickSortQues {

static boolean possible(int[] boys, int[] girls, int m , int n)
	{
	if(n<m)
		return false;

	Arrays.sort(boys);
	Arrays.sort(girls);

	for(int i=0;i<m;i++){
		if(boys[i] <= girls[i])
		return false;
	}
	return true;
	}

	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		while(T-- > 0)
		{
			int M = sc.nextInt();
			int N = sc.nextInt();

			int boys[] = new int [M];

           for(int i =0;i<M;i++)
			{
			   boys[i]=sc.nextInt();
			}


			int girls[] = new int[N];

             for(int i =0;i<N;i++)
			{
			   girls[i]=sc.nextInt();
			}
     System.out.println(possible(boys,girls,M,N) ? "Yes" :"No");
		}
	}
}