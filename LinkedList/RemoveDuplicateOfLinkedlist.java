public class RemoveDuplicateOfLinkedlist {
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

    // Remove duplicates from sorted linked list
    public void removeDuplicates() {
        Node curr=head;
        while(curr.next != null){
            if(curr.data == curr.next.data){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        try {
            RemoveDuplicateOfLinkedlist list = new RemoveDuplicateOfLinkedlist();
            list.insert(10);
            list.insert(20);
            list.insert(20);
            list.insert(30);
            list.insert(30);
            list.insert(30);

            System.out.println("Original List:");
            list.display();

            list.removeDuplicates();

            System.out.println("List after removing duplicates:");
            list.display();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    
}
