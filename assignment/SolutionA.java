import java.util.Scanner;

public class SolutionA {

    public static int BS(int[] id) {
        int s = 1;
        int e = id.length;
        while (s <= e) {
            int m = (s + e) / 2;

            if (m == id[m]) {
                return m;
            }
            if (m < id[m]) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }        return -1;
    }


    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size + 1];

        for (int i = 1; i <= size; i++) {
            array[i] = sc.nextInt();
        }

        int i = BS(array);

        if (i != -1) {
            System.out.println(i);
        } else {
            System.out.println("NOT_FOUND");
        }
    }
}
