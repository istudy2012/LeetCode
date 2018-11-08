package implement;

import java.util.ArrayDeque;
import java.util.Queue;

class MyStack {

    private Queue<Integer> input;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        input = new ArrayDeque<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        input.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        Queue<Integer> newQueue = new ArrayDeque<>();
        while (input.size() > 1) {
            newQueue.add(input.poll());
        }
        int t = input.poll();
        input = newQueue;
        return t;
    }

    /**
     * Get the top element.
     */
    public int top() {
        Queue<Integer> newQueue = new ArrayDeque<>();
        while (input.size() > 1) {
            newQueue.add(input.poll());
        }
        int t = input.poll();
        input = newQueue;
        input.add(t);
        return t;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return input.isEmpty();
    }
}