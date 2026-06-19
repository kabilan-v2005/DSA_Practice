
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class Binary_Tree{

    public Node builtTree(Scanner sc){
        int val = sc.nextInt();
        if(val == -1){
            return null;
        }
        Node root = new Node(val);
        Queue<Node> queue = new LinkedList<>(); // wrapperclass

        queue.add(root);
        while(!queue.isEmpty()){
            Node curr = queue.poll();
            int leftVal = sc.nextInt();
            if(leftVal != -1){
                curr.left = new Node(leftVal);
                queue.add(curr.left);
            }
            int rightVal = sc.nextInt();
            if(rightVal != -1){
                curr.right = new Node(rightVal);
                queue.add(curr.right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Node root = builtTree(sc);
        Binary_Tree node  = new Binary_Tree();
        node.builtTree(sc);

    }   
}