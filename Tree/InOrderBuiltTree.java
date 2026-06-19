
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
class InOrderBuiltTree{

    public Node Inorder_builttree(Scanner sc){
        int val = sc.nextInt();
        if(val == -1){
            return null;
        }
        Node left = Inorder_builttree(sc);
        Node n = new Node(val);
        
        n.left = left;
        n.right = Inorder_builttree(sc);
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
        InOrderBuiltTree node  = new InOrderBuiltTree();
        Node root = node.Inorder_builttree(sc);
        node.InOrder(root);
    }   
}