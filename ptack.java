!!!!!!!!!!!!!!!!!!!!!Stack implementation using Array!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
class stack {
    static final int max=100;
    int top;
    int a[]=new int[max];
    boolean isEmpty(){
        return (top<0);
    }
    stack(){
        top =-1;
    }
    boolean push(int x){
        if(top>=max-1){
            System.out.print("Stack Overflow");
            return false;
        }
        else{
            a[++top]=x;
            System.out.println(x+"Pushed in Stack");
            return true;
        }
    }
     int pop(){
        if(top<0){
            System.out.print("Stack Underflow");
            return 0;
        }
        else{
            int x=a[top--];
            return x;
        }
    }
    int peek(){
        if(top<0){
            System.out.println("stack Underflow");
            return 0;
        }
        else{
            int x=a[top];
            return x;
        }
    }
    void print(){
        for(int i=top;i>-1;i++){
            System.out.print(""+a[i]);
        }
    }
}

public class ptack {
    public static void main(String[] args) {
        stack s=new stack();
        s.push(10);
        s.push(20);
        System.out.println(s.pop()+ "Poped from Stack");
    }
    
}
    

