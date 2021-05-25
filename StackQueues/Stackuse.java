package StackQueues;

import BinaryTree.StackEmptyException;

public class Stackuse {

	public static void main(String[] args) throws StackFullException, StackEmptyException{
		StackUsingArray stack=new StackUsingArray(3);
		
		
		for(int i=1;i<=5;i++) {
			stack.push(i);
		}
		
		while(!stack.isEmpy()) {
			System.out.println(stack.pop());
		}
		
	}

}
