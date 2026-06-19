class LinkedListImplementation {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    // Constructor
    public LinkedListImplementation() {
        top = null;
    }

    // Push operation
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed");
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // Check empty
    public boolean isEmpty() {
        return top == null;
    }

    // Display stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        Node current = top;
        System.out.print("Stack: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {

        LinkedListImplementation stack = new LinkedListImplementation();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());

        stack.display();
    }
}
