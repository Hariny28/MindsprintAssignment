package Modifier;

import java.util.*;

public class LinkedList_Prac {
public static void main(String a[])
{
	LinkedList<String> l=new LinkedList<String>();
	l.add("May");
	l.add("June");
	l.add("July");
	l.add("August");
	l.add("April");
	l.add("November");
	
	l.addLast("December");
	l.addFirst("January");
	
	l.add(1,"Febuary");
	l.add(2,"March");
	
	System.out.println(l);
	
	l.add(7,"September");
	l.add(8,"October");
	
	l.add(3,"April");
	l.remove(10);
	System.out.println(l);
	
	System.out.println("odd Dates");
	for(int i=0;i<l.size();i++) {
		if(i%2==0) {
			System.out.println(l.get(i));
		}
	}
	System.out.println();
	System.out.println();
	System.out.println("even Dates");
	for(int i=0;i<l.size();i++) {
		if(i%2!=0) {
			System.out.println(l.get(i));
		}
	}
	System.out.println();
	System.out.println();
	
	Iterator itr =l.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println(l.getFirst()+"   "+l.getLast());
	
	l.remove("July");
	
	System.out.println();
	System.out.println();
	
	for(int i=0;i<l.size();i++) {
		if(l.get(i)=="January" || l.get(i)=="Febuary" || l.get(i)=="December" )  {
			System.out.println("Yes it is Present");
		}
	}
	System.out.println();
	System.out.println();
	
	System.out.println(l.peekFirst());
	System.out.println(l.peekLast());
	System.out.println(l.pollFirst());
	System.out.println(l.pollLast());
	
	System.out.println(l);
	
}
}

