import java.util.HashSet;

public class RemoveDuplicatesInUnsorted {
     Node head;
    class Node {
      int data;
      Node next;

      Node(final RemoveDuplicatesInUnsorted var1, int var2) {
         this.data = var2;
         this.next = null;
      }
   }
  

   public void insert(int var1) {
      Node var2 = new Node(this, var1);
      if (this.head == null) {
         this.head = var2;
      } else {
         Node var3;
         for(var3 = this.head; var3.next != null; var3 = var3.next) {
         }

         var3.next = var2;
      }
   }

   public void display() {
      for(Node var1 = this.head; var1 != null; var1 = var1.next) {
         System.out.print(var1.data + " ");
      }

      System.out.println();
   }
    public void removeduplicates() {
        HashSet<Integer> set =new HashSet<>();
        Node curr=head;
        Node prev=null;
        while(curr != null){
            if(set.contains(curr.data)){
                prev.next=curr.next;
        }
            else{
                set.add(curr.data);
                prev=curr;
            }
            curr=curr.next;
   }
   
}

   

   public static void main(String[] var0) {
      try {
         RemoveDuplicatesInUnsorted var1 = new RemoveDuplicatesInUnsorted();
         var1.insert(10);
         var1.insert(20);
         var1.insert(30);
         var1.insert(20);
         var1.insert(50);
         var1.insert(10);
         var1.display();
         var1.removeduplicates();
         var1.display();
      } catch (Exception var2) {
        System.out.println("Error");
      }

   }

   
}
