
import java.util.Scanner;

class Stack{
    int top=-1;
    

    public static void main(String[] args) {
        Stack s=new Stack();

        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter the element to be pushed");
            int x=sc.nextInt();
            s.push(x, arr);
        }
        System.out.println("Top Element is : "+s.peek(arr));
        System.out.println(s.pop(arr));
        System.out.println(s.pop(arr));
        System.out.println(s.pop(arr));
        System.out.println(s.pop(arr));
    }
    void push(int x,int[] arr){
        if(top==arr.length-1){
            System.out.println("Stack is full");
        }
        else{
            top++;
            arr[top]=x;
        }
    }
    int pop(int [] arr){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            int x=arr[top];
            top--;
            return x;
        }
    }
    int peek(int arr[]){
        if(top==-1){
            System.out.print("Stack is empty");
            return -1;
        }
        else{
            return arr[top];
        }
    }


}