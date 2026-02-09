
public class MergeTwoList {
    
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
       public static Node concate(Node head1,Node head2){
        if(head1==null) return head2;
        if(head2==null) return head1;
        Node temp=head1;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head2;
        return head1;
       }
    
        // Main method
        public static void main(String[] args) {
            try{
            MergeTwoList list1 = new MergeTwoList();
            MergeTwoList list2 = new MergeTwoList();
            list1.insert(10);
            list1.insert(20);
            list1.insert(30);
            list2.insert(100);
            list2.insert(120);
            list2.insert(140);
            // Merging two lists
            list1.head=concate(list1.head,list2.head);
            list1.display();
            
            
            }catch(Exception e){
                System.out.println("Error");
            }
        
}

}
