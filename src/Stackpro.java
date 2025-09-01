public class Stackpro{
    public static void main(String[] args) {
        mystack s=new mystack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.peek();
        s.pop();
        s.display();
    }
}

class mystack{
    int maxsize=5;
    int[] stack=new int[maxsize];
    int top=-1;

    void push(int value){
        if(top==maxsize-1){
            System.out.println("Stack is full!");
        }
        else{
            stack[++top]=value;
            System.out.println(value+"Pushed to stack");
        }
    }

    void pop(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(stack[top]+ " popped from stack");
            top--;
        }
    }

    void peek(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(stack[top]+ " is the top element");
        }
    }

    void display(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack elements are ");
            for(int i=0;i<=top;i++){
                System.out.println(stack[i]+ " ");
            }
        }
        System.out.println();
    }
}