import java.util.*;
class ArrayTran 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//input
		int a[][]= new int[3][3];
		for(int i = 0 ; i < 3 ;i++)
		{
			for(int j = 0 ; j<3;j++)
			{

			a[i][j]=sc.nextInt();
			}

		}
		//transpose
	  int t [] [] = new int[3][3];

       	for(int i = 0 ; i < 3 ;i++)
		{
			for(int j = 0 ; j<3;j++)
			{

			t[j][i]=sc.nextInt();
			}
		}

         //output
			for( int i = 0 ; i < 3 ;i++)
		{
			for(int j = 0 ; j<3;j++)
			{
            System.out.print(t[i][j] +"\t");
 
        
			} System.out.println();

		}

		}
	}



