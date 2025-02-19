package Modifier;

class product
{
	int prod_id;  
    String name; 
    int price;
    static float discount = 0.05f ; 
    String brand;
    
    product(int p_id, String n,int p,String b)
    {  
	    prod_id=p_id;  
	    name=n;  
	    price=p;
	    brand=b;
	    System.out.println("i am inside the constructor");
    }  
    
    void original(){
	    System.out.println("original price: "+ price);
    }  
    
    void print()
    {
    	System.out.println(prod_id+" "+name+" "+(price-discount*price)+" "+brand);
    }
  
}
public class Static_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product p1= new product(1,"phone",1000,"samsung");
		product p2= new product(2,"tv",10000,"redmi");
		product p3= new product(3,"joystick",5000,"vivo");
		product p4= new product(4,"tab",20000,"apple");
		p1.original();
		p2.original();
		p3.original();
		p4.original();
		p1.print();
		p2.print();
		p3.print();
		p4.print();
		System.out.println("After festive season");
		p1.discount=0.1f;
		p1.print();
		p2.print();
		p3.discount=0.3f;
		p3.print();
		p4.print();
		}

}
