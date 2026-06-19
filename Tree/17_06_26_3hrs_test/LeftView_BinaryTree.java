
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class LeftView_BinaryTree {
     public void leftview(Node root) {
        

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        System.out.print(root.data + " ");
        while (!q.isEmpty()) {
            int n = q.size();
            // List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                Node curr = q.poll();
                // list.add(curr.data);
                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            Node first = q.peek();
            if (first != null) {
                System.out.print(first.data + " ");
            }
            // res.add(list);
        }
    }

    public Node builtTree(Scanner sc) {
        int val = sc.nextInt();

        if (val == -1) {
            return null;
        }

        Node root = new Node(val);
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();

            int leftVal = sc.nextInt();
            if (leftVal != -1) {
                curr.left = new Node(leftVal);
                queue.add(curr.left);
            }

            int rightVal = sc.nextInt();
            if (rightVal != -1) {
                curr.right = new Node(rightVal);
                queue.add(curr.right);
            }
        }

        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LeftView_BinaryTree node = new LeftView_BinaryTree();

        Node root = node.builtTree(sc);

       

        node.leftview(root);

        sc.close();
    }
}
