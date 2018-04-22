package com.java.training.reverse;

import com.java.training.datastructure.stack.ArrayStack;
import com.java.training.datastructure.stack.Stack;

public class Reverser {

	private String input;
	private String output;
	
	public Reverser(String in) {
		input = in;
	}
	
	public String doRev() {
		int stackSize = input.length();
		Stack<Character> arrayStack = new ArrayStack<Character>(stackSize);
		
		for(int j = 0; j < input.length(); j++) {
			char ch = input.charAt(j);
			arrayStack.push(ch);
		}
		
		output = "";
		while(!arrayStack.isEmpty()) {
			char ch = arrayStack.pop();
			output = output + ch;
		}
		
		return output;
	}
	
}
