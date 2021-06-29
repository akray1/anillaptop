package com.anil.collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumarationClass {
public static void main(String[] args) {
	Vector vt=new Vector();
	for(int i=1;i<=10;i++){
		vt.addElement(i);
	}
	Enumeration enu=vt.elements();
	while(enu.hasMoreElements()){
		Integer in=(Integer)enu.nextElement();
		if (in %2==0){
			System.out.println(in);
		}
	}
}
}
