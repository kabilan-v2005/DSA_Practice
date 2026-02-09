public class SplittingEvenhalfandOddHalf {

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

    // Split odd position nodes first, then even position nodes
    public void split() {
        if (head == null || head.next == null) return;

        Node oddHead = null, oddTail = null;
        Node evenHead = null, evenTail = null;

        Node current = head;
        int count = 1;

        while (current != null) {
            Node nextNode = current.next;
            current.next = null;

            if (count % 2 == 1) { // odd position
                if (oddHead == null) {
                    oddHead = oddTail = current;
                } else {
                    oddTail.next = current;
                    oddTail = current;
                }
            } else { // even position
                if (evenHead == null) {
                    evenHead = evenTail = current;
                } else {
                    evenTail.next = current;
                    evenTail = current;
                }
            }

            current = nextNode;
            count++;
        }

        oddTail.next = evenHead;
        head = oddHead;
    }

    
    public Node insertSorted(Node head, int val) {
        Node newNode = new Node(val);

        

        Node curr = head;
        while (curr.next != null && curr.next.data < val) {
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }

    // MAIN METHOD
    public static void main(String[] args) {
        try {
            SplittingEvenhalfandOddHalf list = new SplittingEvenhalfandOddHalf();

            list.insert(10);
            list.insert(20);
            list.insert(30);
            list.insert(40);
            list.insert(50);

            System.out.print("Original List: ");
            list.display();

            list.split();
            System.out.print("After Split:   ");
            list.display();

            list.head = list.insertSorted(list.head, 25);
            System.out.print("After Insert:  ");
            list.display();

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
