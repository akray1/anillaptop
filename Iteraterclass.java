package com.anil.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteraterclass {
	public static void main(String[] args) {
		ArrayList vt=new ArrayList();
		for(int i=1;i<=10;i++){
			vt.add(i);
		}
		Iterator itr=vt.iterator();
		while(itr.hasNext()){
			Integer in=(Integer)itr.next();
			if (in %2==0){
				System.out.println(in);
			}
			else
				itr.remove();
		}
	}
}
