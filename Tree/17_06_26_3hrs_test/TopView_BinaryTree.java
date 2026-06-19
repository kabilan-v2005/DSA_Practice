import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

class Pair {
    Node node;
    int hd;

    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

public class TopView_BinaryTree {

    public void topview(Node root) {

        if (root == null)
            return;

        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {

            Pair p = q.poll();

            Node curr = p.node;
            int hd = p.hd;

            if (!map.containsKey(hd)) {
                map.put(hd, curr.data);
            }

            if (curr.left != null) {
                q.add(new Pair(curr.left, hd - 1));
            }

            if (curr.right != null) {
                q.add(new Pair(curr.right, hd + 1));
            }
        }

        for (int val : map.values()) {
            System.out.print(val + " ");
        }
    }

    public Node builtTree(Scanner sc) {
        int val = sc.nextInt();

        if (val == -1)
            return null;

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

        TopView_BinaryTree obj = new TopView_BinaryTree();

        Node root = obj.builtTree(sc);

        obj.topview(root);

        sc.close();
    }
}