class TraversalOfLinkedlist {
    Node head;  // head of the list

    boolean length() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

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

    // Main method
    public static void main(String[] args) {
        TraversalOfLinkedlist list = new TraversalOfLinkedlist();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();  // Output: 10 20 30
    }
}
