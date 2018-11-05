import java.util.Stack;

class MyQueue {
    private Stack<Integer> stack;

    /** Initialize your data structure here. */
    public MyQueue() {
        stack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        reverseStack();
        int p = stack.pop();
        reverseStack();

        return p;
    }

    /** Get the front element. */
    public int peek() {
        reverseStack();
        int p = stack.peek();
        reverseStack();

        return p;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }

    private void reverseStack() {
        Stack<Integer> newStack = new Stack<>();
        while (!stack.isEmpty()) {
            newStack.push(stack.pop());
        }
        stack = newStack;
    }
}