import java.util.*;

public class BinaryTree_Array_Imp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {

            int val = sc.nextInt();

            if (val == -1) {
                arr[i] = null;
            } else {
                arr[i] = val;
            }
        }

        for (int i = 0; i < n; i++) {

            if (arr[i] == null) {
                continue;
            }

            int left = 2 * i + 1;
            int right = 2 * i + 2;

            System.out.print("Node: " + arr[i]);

            System.out.print(" | Left: ");

            if (left < n && arr[left] != null) {
                System.out.print(arr[left]);
            } else {
                System.out.print("null");
            }

            System.out.print(" | Right: ");

            if (right < n && arr[right] != null) {
                System.out.print(arr[right]);
            } else {
                System.out.print("null");
            }

            System.out.println();
        }

        sc.close();
    }
}