public class InsertANDPrint {
    Node head;
    Node tail;
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void insert(int data) {
        Node n=new Node(data);
        Node temp=head;
        if(head==null){
            head=n;
            tail=n;
        }
        else{
            tail.next=n;
            tail=n;
            tail.next=head;
        }
    }
    public void insertAtBeginning(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            return;
        }
        n.next=head;
        head=n;
        tail.next=head;
    }
    public void deleteFromBeginning(){
        head=head.next;
        tail.next=head;
    }
    public void display(){
        Node temp=head;
        System.out.print(temp.data+" ");
        temp=temp.next;
        while(temp!=head){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        InsertANDPrint cll = new InsertANDPrint();
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.display();
        cll.insertAtBeginning(5);
        cll.display();
        cll.deleteFromBeginning();
        cll.display();
    }
}
