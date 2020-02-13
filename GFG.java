import java.io.*;
import java.util.*;

class GFG {
    
    public static void segragate012(int a[], int n){
        int low = 0, high = n-1, mid = 0;
        while(mid <= high){
            if(a[mid]==0) {
                int temp=a[low];
                a[low]=a[mid];
                a[mid]=temp;
                low++;
                mid++;
            } else if(a[mid]==1) {
                mid++;
            } else {
                int temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
            }
        }
    }

    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    segragate012(arr, n);
		    StringBuffer str = new StringBuffer();
		    for(int i=0; i<n; i++){
		        str.append(arr[i]+" ");
		    }
		    System.out.println(str);
		}
	}
}