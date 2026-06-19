
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
class PreOrderBuiltTree{

    public Node Preorder_builttree(Scanner sc){
        int val = sc.nextInt();
        if(val == -1){
            return null;
        }
        Node n = new Node(val);
        
        n.left = Preorder_builttree(sc);
        n.right = Preorder_builttree(sc);
        return n;
    }
    public void InOrder(Node root){
        if(root == null) return;

        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Node root = builtTree(sc);
        PreOrderBuiltTree node  = new PreOrderBuiltTree();
        Node root = node.Preorder_builttree(sc);
        node.InOrder(root);
    }   
}