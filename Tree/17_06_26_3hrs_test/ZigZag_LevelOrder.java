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
public class ZigZag_LevelOrder {
    
    public List<List<Integer>> zigzag(Node root, List<List<Integer>> res) {
        if (root == null)
            return res;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean rightToLeft = true;

        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                Node curr = q.poll();

                if (rightToLeft) {
                    list.add(curr.data);
                } else {
                    list.add(0, curr.data);
                }

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }

            res.add(list);
            rightToLeft = !rightToLeft;
        }

        return res;
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

        ZigZag_LevelOrder node = new ZigZag_LevelOrder();

        Node root = node.builtTree(sc);

        List<List<Integer>> res = new ArrayList<>();

        node.zigzag(root, res);

        System.out.println(res);

        sc.close();
    }

}
