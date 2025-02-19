package Modifier;

import java.util.*;

public class ArrayListAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("Strawberry");
		al.add("Banana");
		al.add("Guava");
		al.add("Pineapple");
		
		al.add("Chennai");
		al.add("Bangalore");
		
		al.add("Singing");
		al.add("Dancing");
		
		System.out.println("The arraylist: "+al);

		al.remove("Dancing");
		System.out.println("The arraylist: "+al);
		
		System.out.println("The arraylist has or not : "+al.contains("cricket"));
		
		al.remove("Chennai");
		al.remove("Guava");
		System.out.println("The arraylist: "+al);
		
		System.out.println("The 4th and 6th: "+al.get(4)+" "+al.get(6));
		
		al.set(6,"Dancing");
		System.out.println("The arraylist: "+al);
		
		Collections.reverse(al);   //Reversing order of arraylist
		System.out.println("Reversed arraylist is :" + al);
		
		al.set(3, "Kerala");//array indexing from 0
		al.set(1, "Mango");
		System.out.println("The arraylist: "+al);
		
		System.out.println(al.subList(2, 5));
		
	}
}
