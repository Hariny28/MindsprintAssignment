package Modifier;

class Product {
	int id=78;
	String name="Amul";
	public void display()
	{
		System.out.println(id+name);
	}
}
class A extends Product{
	int count=50;
	String category="butter";
	public void display()
	{
		System.out.println("product name: "+name+"product id: "+id+"count: "+count+"category: "+category);
	}
}
class B extends Product{
	int count=90;
	String category="Milk";
	public void display()
	{
		System.out.println("product name: "+name+"product id: "+id+"count: "+count+"category: "+category);
	}
}
class C extends Product{
	int count=56;
	String category="choco";
	public void display()
	{
		System.out.println("product name: "+name+" product id: "+id+" count: "+count+" category: "+category);
	}
}
class subA extends A{
	int price=30;
	int total_price= count*price;
	public void display()
	{
		System.out.println("product id: "+id+" product name: "+name+" category: "+category+" count: "+count);
		System.out.println("total price: "+total_price);
	}
	
}
class subB extends B{
	int price=10;
	int total_price= count*price;
	public void display()
	{
		System.out.println("product id: "+id+" product name: "+name+" category: "+category+" count: "+count);
		System.out.println("total_price: "+total_price);
	}
	
}
public class Multilevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subA sa= new subA();
		subB sb=new subB();
		sa.display();
		sb.display();
	}

}
