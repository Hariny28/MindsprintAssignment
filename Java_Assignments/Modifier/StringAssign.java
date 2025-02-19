package Modifier;

public class StringAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t="Delhi";
		String o="Mumbai";
		String k="delhi";
		String y= new String("Mumbai");
		String l= new String("Delhi");
		String p= new String("Hello");
		if(o==l) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		if (o.equals(l)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		if(y==p) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		if (y.equals(p)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		if(o==o) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		if (o.equals(k)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
	}

}
