package credit.C10;

public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(10);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(5);
        myStack.push(5);
        myStack.pop();
        myStack.push(4);
        System.out.println(myStack.max());
    }
}
