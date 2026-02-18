
public class InsertAndDeleteAtBEG_MID_END {
    Node head;  
    Node tail;
   class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
   }
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }           
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }
    public void insertAtpos(int data,int pos){
        Node newNode = new Node(data);
        Node temp=head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        // temp.next=newNode;
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        Node temp=head;
        if(head==null){
            head=newNode;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next.next=newNode;
    }
    public void display() {        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void deleteAtBeginning(){
        if(head==null){
            System.out.println("Linked List is empty");
        }
        else{
            head=head.next;
        }
    }
    public void deleteAtpos(int pos){
        Node temp=head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    public void deleteAtEnd(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }


        public static void main(String[] args) {
            // Scanner sc=new Scanner(System.in);
            InsertAndDeleteAtBEG_MID_END list = new InsertAndDeleteAtBEG_MID_END();
            list.insert(10);
            list.insert(20);
            list.insert(30);
            System.out.println("Linked List after insertion:");
            list.display();
            list.insertAtBeginning(5);
            System.out.println("Linked List after inserting at the beginning:");
            list.display();
            list.insertAtpos(15,3);
            System.out.println("Linked List after inserting at the middle:");
            list.display();
            list.insertAtEnd(40);
            System.out.println("Linked List after inserting at the end:");
            list.display();
            list.deleteAtBeginning();
            System.out.println("Linked List after deleting at the beginning:");
            list.display();
            list.deleteAtpos(3);
            System.out.println("Linked List after deleting at the middle:");
            list.display();
            list.deleteAtEnd();
            System.out.println("Linked List after deleting at the end:");
            list.display();



        }
    }
   

