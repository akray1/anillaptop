package com.anil.collection;

import java.util.Vector;

public class MyVector {
public static void main(String[] args) {
	
	Vector vector=new Vector();
	for(int i=1;i<=10;i++){
		
		vector.addElement(i);
		System.out.println(vector);
		
	}
	vector.addElement("a");
	System.out.println(vector);
	vector.remove(8);
	System.out.println(vector);
	vector.firstElement();
	System.out.println(vector);
}


}
