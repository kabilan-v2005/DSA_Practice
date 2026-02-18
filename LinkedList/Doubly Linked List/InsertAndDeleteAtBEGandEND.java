
public class InsertAndDeleteAtBEGandEND {
    Node head;
    Node tail;
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    
    public void insertAtBeginning(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        }

        // Insert at the end
        public void insertAtEnd(int data) {
            Node n=new Node(data);
            Node temp=head;
            if(head==null){
                head=n;
                return;
            }
            else{
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=n;
                n.prev=temp;
                temp=n;
                
            }
        }

        // Delete from the beginning
        public void deleteFromBeginning() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        }

        // Delete from the end
        public void deleteFromEnd() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            if (head.next == null) {
                head = null;
                return;
            }
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }

        // Display the list
        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    

        public static void main(String[] args) {
            InsertAndDeleteAtBEGandEND dll = new InsertAndDeleteAtBEGandEND ();

            dll.insertAtBeginning(10);
            dll.insertAtBeginning(20);
            dll.insertAtEnd(30);
            dll.insertAtEnd(40);
            
            System.out.println("Doubly Linked List after insertions:");
            dll.display();

            dll.deleteFromBeginning();
            System.out.println("Doubly Linked List after deleting from beginning:");
            dll.display();
            dll.deleteFromEnd();
            System.out.println("Doubly Linked List after deleting from end:");
            dll.display();
        }
}
