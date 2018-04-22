package com.java.training.datastructure.stack;

public class ArrayStack<T> implements Stack<T> {

    private static final int DEFAULT_CAPACITY = 10;

    private int capacity;
    private T[] stackArray;
    private int top;

    public ArrayStack() {
        capacity = DEFAULT_CAPACITY;
        stackArray = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        stackArray = (T[]) new Object[capacity];
        top = -1;
    }

    @Override
    public void push(T element) throws StackOverflowException {
        if (!isFull()) {
            stackArray[++top] = element;
        } else {
            throw new StackOverflowException(STACK_OVERFLOW_MESSAGE);
        }
    }

    @Override
    public T pop() {
        return stackArray[top--];
    }

    @Override
    public T peek() {
        return stackArray[top];
    }

    @Override
    public boolean isFull() {
        return (top == capacity - 1);
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

}
