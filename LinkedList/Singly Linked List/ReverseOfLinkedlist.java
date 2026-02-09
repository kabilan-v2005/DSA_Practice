

public class ReverseOfLinkedlist {
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
        public void reverse(){
            Node prev=null;
            Node current=head;
            
            
            while(current!=null){
                Node next=current.next;
                current.next=prev;
                prev=current;
                current=next;
            }
            head=prev;
        }
    
        // Main method
        public static void main(String[] args) {
            try{
            ReverseOfLinkedlist list = new ReverseOfLinkedlist();
            list.insert(10);
            list.insert(20);
            list.insert(30);
            list.display();
            list.reverse();
            list.display();
            }catch(Exception e){
                System.out.println("Error");
            }
        }
}
