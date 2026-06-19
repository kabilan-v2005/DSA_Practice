import java.util.*;

public class SparseMatrix {

    class Node {
        int row;
        int col;
        int data;
        Node next;

        Node(int r, int c, int data) {
            this.data = data;
            row = r;
            col = c;
            
            next = null;
        }
    }

    Node head;
    Node tail;

    // Insert non-zero elements
    public void insert(int r, int c, int d) {
        if (d== 0) return;   // ignore zero values

        Node newNode = new Node(r, c, d);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Display sparse matrix
    void printList() {
        if (head == null) {
            System.out.println("Sparse matrix is empty");
            return;
        }

        Node temp = head;
        System.out.println("Row  Col  Data  Next");

        while (temp != null) {
            System.out.println(
                temp.row + "    " +
                temp.col + "    " +
                temp.data + "    next"
            );
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SparseMatrix sm = new SparseMatrix();

        int row = sc.nextInt();
        int col = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int num = sc.nextInt();
                sm.insert(i, j, num);
            }
        }

        sm.printList();
        sc.close();
    }
}
