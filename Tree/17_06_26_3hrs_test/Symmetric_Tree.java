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
public class Symmetric_Tree {

    private boolean isMirror(Node nodeleft, Node noderight){

    if(nodeleft == null && noderight == null)
        return true;

    if(nodeleft == null || noderight == null)
        return false;

    if(nodeleft.data != noderight.data)
        return false;

    return isMirror(nodeleft.left, noderight.right)
        && isMirror(nodeleft.right, noderight.left);
}
    private boolean symmetric(Node root){
        if(root == null) return true;

        return isMirror( root.left , root.right);
    } 

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
        Symmetric_Tree node  = new Symmetric_Tree();
        Node root = node.builtTree(sc);
        System.out.print(node.symmetric(root));

    }   
}
