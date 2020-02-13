import java.util.*;
public class QuesDS {
   public static void main(String args[]) {

int n,i,m,a,max=0;
int sum=0;
Scanner sc = new Scanner(System.in);
n=sc.nextInt();
int arr[]=new int [n];
for(i=0;i<=n-1;i++)
{
arr[i]=sc.nextInt();
}
Arrays.sort(arr);
m=sc.nextInt();
for(i=0;i<=m-1;i++)
{
a=sc.nextInt();
if(a>max)
{
max=a;
}
}
for(i=0;i<=n-1;i++)
{
if(arr[i]<=max)
sum=sum+max-arr[i]+1;
}
System.out.print(sum);

}
    }
