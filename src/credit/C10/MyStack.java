package credit.C10;

import java.util.EmptyStackException;

public class MyStack {
    private int mSize;
    private int[] stackArray;
    private int[] maxStackArray;
    private int topIndex;
    private int maxIndex;
    public int max(){
        return maxStackArray[maxIndex];
    }
    public MyStack(int mSize) {
        this.mSize = mSize;
        stackArray = new int[mSize];
        topIndex = -1;
        maxIndex = -1;
        maxStackArray = new int[mSize];
    }
    public void push(int item) {
        if(isEmpty()){
            maxStackArray[++maxIndex] = item;
        }
        else if(item > readTop()){
            maxStackArray[++maxIndex] = item;
        }
        stackArray[++topIndex] = item;
    }
    public int pop() {
        if(readTop() == maxStackArray[maxIndex]) maxIndex--;
        return stackArray[topIndex--];
    }
    public boolean isEmpty() {
        return (topIndex == -1);
    }
    public boolean isFull() {
        return (topIndex == mSize - 1);
    }
    public int readTop() {
        return stackArray[topIndex];
    }
}
