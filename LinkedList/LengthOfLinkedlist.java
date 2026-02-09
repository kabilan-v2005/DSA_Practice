public class LengthOfLinkedlist {
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
    public int length(){
        int count=0;
        Node temp=head;
        
        while(temp!=null){
            count++;
            temp=temp.next;
            
        }
        return count;
    }

    // Main method
    public static void main(String[] args) {
        try{
        LengthOfLinkedlist list = new LengthOfLinkedlist();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();
        System.out.println(list.length()); 
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}
