public class ReverseLinkedListUsing_Recursion {
        Node head; 
        class Node {
            int data;
            Node next;
    
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        public void insert(int data) {
            Node newnode = new Node(data);
            if (head == null) {
                head = newnode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        public static Node reverse(Node head) {
            if(head == null || head.next == null){
                return head;
            }
            Node newHead = reverse(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }
        public static void main(String[] args) {
            try{
            ReverseLinkedListUsing_Recursion list = new ReverseLinkedListUsing_Recursion();
            list.insert(1);            
            list.insert(2);
            list.insert(3);
            list.insert(4);
            list.insert(5);
            list.display();
            list.head=list.reverse(list.head);
            list.display();
            }catch(Exception e){
                System.out.println("Error");
            }
        }

    
}
