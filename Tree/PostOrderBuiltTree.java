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

 class PostOrderBuiltTree {

    int index;

    public Node buildPostOrder(int[] arr) {

        if (index < 0)
            return null;

        int val = arr[index--];

        if (val == -1)
            return null;

        Node root = new Node(val);

        // Build right first, then left
        root.right = buildPostOrder(arr);
        root.left = buildPostOrder(arr);

        return root;
    }

    public void inOrder(Node root) {

        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // total number of elements

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        PostOrderBuiltTree tree = new PostOrderBuiltTree();

        tree.index = n - 1;

        Node root = tree.buildPostOrder(arr);

        tree.inOrder(root);
    }
}