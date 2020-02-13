import java.util.*;

class Selection {
public static void main(String args[] ) throws Exception {

Scanner s=new Scanner(System.in);

int n=s.nextInt();
int[] arr=new int[n];
for (int i = 0; i < arr.length; i++) {
arr[i]=s.nextInt();
}

Arrays.sort(arr);

int k=s.nextInt();
int[] key=new int[k];
int temp=0;
for(int i=0; i<k; i++)
{
key[i]=s.nextInt();
temp+=key[i];
}

if(temp<n)
System.out.println("-1");

else
{
int l=key.length;
int[] res=new int[temp];
int j=0;

for(int i=0; i<l; i++)
{
int x=key[i];

while(j<temp && x>0)
{
res[j]=x;
j++;
x--;
}
}

Arrays.sort(res);
int sum=0;
int m=0;
for(int i=n-1; i>=0; i--)
{
sum+=arr[i]*res[m];
m++;
}

System.out.println(sum);
}

}
}