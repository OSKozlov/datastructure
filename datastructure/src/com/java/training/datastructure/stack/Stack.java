package com.java.training.datastructure.stack;

public interface Stack<T> {
    
    public static final String STACK_OVERFLOW_MESSAGE = "Stack overflow !!!";

    /**
     * This method place element on top of stack
     *
     * @param element
     * @throws StackOverflowException 
     */
    public void push(T element) throws StackOverflowException;

    /**
     * This method eject element from top of stack
     * 
     * @return element from top of stack
     */
    public T pop();

    /**
     * This method read element from top of stack
     * 
     * @return element from top of stack
     */
    public T peek();

    /**
     * This method check is stack full
     * 
     * @return true if stack full, otherwise false
     */
    public boolean isFull();

    /**
     * This method check is stack empty
     * 
     * @return true if stack empty, otherwise false
     */
    public boolean isEmpty();

}
