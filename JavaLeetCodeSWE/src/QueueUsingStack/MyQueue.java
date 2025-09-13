package QueueUsingStack;

import java.util.Stack;

public class MyQueue {
    public Stack<Integer> stackRead;
    public Stack<Integer> stackWrite;

    public MyQueue() {
        this.stackRead = new Stack<>();
        this.stackWrite = new Stack<>();
    }

    public void push(int x) {
        stackRead.push(x);
    }

    public int pop() {
        if (stackRead.isEmpty()) return -1;

        int n = stackRead.size();
        for (int i = 0; i < n - 1; i++) {
            stackWrite.push(stackRead.pop());
        }

        int front = stackRead.pop();

        while (!stackWrite.isEmpty()) {
            stackRead.push(stackWrite.pop());
        }

        return front;
    }

    public int peek() {
        if (stackRead.isEmpty()) return -1;

        int n = stackRead.size();
        for (int i = 0; i < n - 1; i++) {
            stackWrite.push(stackRead.pop());
        }

        int front = stackRead.pop();
        stackRead.push(front);

        while (!stackWrite.isEmpty()) {
            stackRead.push(stackWrite.pop());
        }

        return front;
    }

    public boolean empty() {
        return stackRead.isEmpty();
    }
}