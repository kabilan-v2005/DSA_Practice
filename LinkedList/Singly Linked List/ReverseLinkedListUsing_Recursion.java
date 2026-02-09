

public class ReverseLinkedListUsing_Recursion {
    


        Node head;  // head of the list
    
        // Node class
        class Node {
            int data;
            Node next;
    
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
    
        // Insert at end
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
    
        // Display linked list
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
    
        // Main method
        public static void main(String[] args) {
            try{
            ReverseLinkedListUsing_Recursion list = new ReverseLinkedListUsing_Recursion();
            list.insert(10);
            list.insert(20);
            list.insert(30);
            list.display();
            list.head=list.reverse(list.head);
            list.display();
            }catch(Exception e){
                System.out.println("Error");
            }
        }

    
}
