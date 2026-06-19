import java.util.Scanner;

class ArrayQueue {
    int[] queue;
    int front, rear, size;

    // Constructor
    ArrayQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // Enqueue operation
    void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow! Cannot insert " + data);
            return;
        }

        if (front == -1) {
            front = 0;
        }

        queue[++rear] = data;
        System.out.println(data + " inserted into queue");
    }

    // Dequeue operation
    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow! No element to remove");
            return;
        }

        System.out.println(queue[front] + " removed from queue");
        front++;

        // Reset queue when empty
        if (front > rear) {
            front = rear = -1;
        }
    }

    // Peek operation
    void peek() {
        if (front == -1) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element is: " + queue[front]);
        }
    }

    // Display operation
    void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

public class QueueArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int size = sc.nextInt();

        ArrayQueue q = new ArrayQueue(size);

        while (true) {
            System.out.println("\n1.Enqueue  2.Dequeue  3.Peek  4.Display  5.Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    q.enqueue(sc.nextInt());
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}