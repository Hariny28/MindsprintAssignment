package Modifier;
import java.util.*;
public class LinkedHashDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet L1 = new LinkedHashSet();
		L1.add(2);
		L1.add(3);
		L1.add(4.00f);
		L1.add(5.00f);
		L1.add(true);
		System.out.println("The L1 has: "+L1);
		L1.remove(3);
		System.out.println(L1.contains("India"));
		L1.contains(5);
		System.out.println("The L1 has: "+L1);
		L1.clear();
		System.out.println("The L1 has: "+L1);
		LinkedHashSet<Integer> L2 = new LinkedHashSet();
		Scanner myobj= new Scanner(System.in);
		System.out.println("Enter number: ");
		int s=10;
		int[] arr= new int[s];
		for(int i=0;i<10;i++)
		{
			arr[i]= myobj.nextInt();
			L2.add(arr[i]);
		}
		System.out.println("The output is: "+L2);
		/*System.out.println("Enter number: ");
		while(L2.size()<10)
		{
			int num=myobj.nextInt();
			L2.add(num);
		}
		System.out.println("The output is: "+L2);*/
		TreeSet<String> L3 = new TreeSet();
		L3.add("C");
		L3.add("C++");
		L3.add("C#");
		L3.add("Python");
		L3.add("Java");
		L3.add("Javascript");
		System.out.println("The L3 has: "+L3);
		L3.remove("Java");
		L3.remove("C");
		System.out.println("The L3 has: "+L3);
		System.out.println(L3.contains("Java"));
		//System.out.println(L3.contains(5)); //no meaning
		L3.clear();
		System.out.println("The L3 has: "+L3);
		
	}

}
;
