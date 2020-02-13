import java.util.Scanner;

public class SolutionB {

    private static int bs(int[] id, int s, int e, int search) {
        int m = (s + e) / 2;

        try {
            if (e <= s) {
              
                return -1;
            } else if (id[m] == search) {
                
                return m;
            } else if (id[m] > search) {
               
                return bs(id, s, m - 1, search);
            } else {
                
                return bs(id, m + 1, e * e, search);
            }

        } catch (ArrayIndexOutOfBoundsException d) {
            
            return bs(id, s, m, search);
        }

    }


    public static int search(int[] id, int search) {
        return bs(id, 1, 2, search);
    }

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int M = sc.nextInt();

       
        if (n == 0) {
            System.out.print("NOT_FOUND");
            return;
        }


        int id[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            id[i] = sc.nextInt();
        }

        int index = search(id, M);

       
        System.out.println(index == -1 ? "NOT FOUND" : index);

    }
}
