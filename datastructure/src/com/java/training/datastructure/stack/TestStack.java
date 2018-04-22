package com.java.training.datastructure.stack;

public class TestStack {

    public static void main(String[] args) {
        Stack<Long> stack = new ArrayStack<Long>(10);
        stack.push(20L);
        stack.push(40L);
        stack.push(60L);
        stack.push(80L);
        stack.push(90L);
        stack.push(100L);
        stack.push(120L);
        stack.push(140L);
        stack.push(160L);
        stack.push(180L);

        while (!stack.isEmpty()) {
            long value = stack.pop();
            System.out.println(value);
        }
    }

}
