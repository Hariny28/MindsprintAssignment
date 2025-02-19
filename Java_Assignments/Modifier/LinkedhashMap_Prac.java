package Modifier;

import java.util.*;

public class LinkedhashMap_Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> lm= new LinkedHashMap<Integer,String>();
		lm.put(1, "India");
		lm.put(2, "b");
		lm.put(3, "c");
		lm.put(4, "d");
		lm.put(5, "e");
		lm.put(6, "f");
		lm.put(7, "g");
		lm.put(8, "h");
		lm.put(9, "i");
		lm.put(10, "j");
		System.out.println("Contents of LinkedHashMap : " + lm);
		System.out.println("Key");
		for(Integer key:lm.keySet()) {
			System.out.println(key);
		}
		System.out.println("values");
		for(Integer key:lm.keySet()) {
			System.out.println(lm.get(key));
		}
		System.out.println("India present or not "+ lm.containsValue("India"));
		System.out.println("45 present or not: "+ lm.containsKey(45));
		System.out.println("Contents of LinkedHashMap : " + lm);
		System.out.println();
		lm.remove(9,"i");
		lm.remove(6);
		System.out.println("Contents of LinkedHashMap : " + lm);
		System.out.println();
		
		Map<Integer,String> lmnew= new LinkedHashMap<Integer,String>();
		lmnew.put(11,"tn");
		lmnew.put(12,"ke");
		lmnew.put(13,"ma");
		lmnew.put(14,"od");
		
		lm.putAll(lmnew);
		System.out.println("The final one: "+lm);
		lm.remove(5);
		System.out.println("After removing 5: "+lm);
		System.out.println(lm.isEmpty());
		lm.clear();
		System.out.println(lm.isEmpty());
	}

}
/*Create object of LinkedHashmap of 10 countries of your choice( countrycode = key and countryname= value)
		do following operations:
			- fetch all the map keys
			- fetch all the map values
			- check if the value("India") exists or not
			- check if the key(45) exists or not
			- remove 1 country
			 
			Also create a new map with (key=statecode , value=statename) and marge with the above map
			- also delete the key(5)
			- check if the map is empty or not
			- clear the map*/