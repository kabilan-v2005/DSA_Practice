
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
class isStrict_or_not{

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
    
    public boolean isStrict(Node root){
        if(root == null){
            return true;
        }
        if(root.left == null && root.right == null){
            return true;
        }
        if(root.left != null && root.right != null){
            return isStrict(root.left) && isStrict(root.right);
        }
        return false;
    }

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    isStrict_or_not node = new isStrict_or_not();

    Node root = node.builtTree(sc);

    System.out.print(node.isStrict(root));
}  
}