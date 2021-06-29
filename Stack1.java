package com.anil.collection;

import java.util.Stack;

public class Stack1 {
int i=0;
public static void main(String[] args) {
	Stack st=new Stack();
	st.push("a");
	
	st.push("b");

	st.push("c");
	st.push("d");
	st.push("e");
	System.out.println(st);
	st.peek();
	System.out.println(st);
	st.pop();
	System.out.println(st);
	st.search("b");
	System.out.println(st);
}
}
