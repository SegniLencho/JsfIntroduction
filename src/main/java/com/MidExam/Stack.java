package com.MidExam;

public class Stack {
    String arr[] = new String[10];
    private int top = 0;//LIFO

    public static void main(String args[]) throws Exception {
        Stack stack = new Stack();
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");
        System.out.println("Peek " + stack.peek());
        stack.pop();

        System.out.println("After Last Elemet Poped " + stack.peek());

    }

    public void push(String element) {
        if (top == arr.length - 1)
            resize();
        arr[top++] = element;
        top++;
    }

    public void pop() throws Exception {
        if (isEmpty())
            throw new ArrayIndexOutOfBoundsException("Stack is Empty");
        top--;
    }

    public String peek() {
        return arr[top];
    }

    public boolean isEmpty() {
        if (top == 0)
            return true;
        return false;
    }

    public void resize() {
        String newarr[] = new String[arr.length * 2];
        System.arraycopy(arr, 0, newarr, 0, arr.length - 1);
        arr = newarr;
    }
}
