import java.util.Arrays;
import java.util.Scanner;

public class Sort {


public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int[] arr = new int[n];
int k=s.nextInt();
for(int i=0;i<n;i++)
{
arr[i] = s.nextInt();
}
int[] arr1 = new int[n];
for(int i=0;i<n;i++)
{
arr1[i] = arr[i]%k;
}
for(int i=0;i<n;i++)
{
for(int j=0;j<n-i-1;j++)
{
if(arr1[j]>arr1[j+1])
{
int temp = arr[j];
arr[j] = arr[j+1];
arr[j+1] = temp;
int pemp = arr1[j];
arr1[j] = arr1[j+1];
arr1[j+1] = pemp;
}

}
}
for(int i=0;i<n;i++)
{
System.out.print(arr[i]+" ");
}
System.out.println(" ");
}

}