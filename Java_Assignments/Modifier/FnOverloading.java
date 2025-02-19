package Modifier;

public class FnOverloading {
	public int calculate(int d1,int d2)
	{
	    return (d1*d2)/2;
	}
	public int calculate(int r)
	{
		return 22/7*r*r;
	}
	public float calculate(float l, float b)
	{
		return l*b;
	}
	public long calculate(long a)
	{
		return a*a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FnOverloading obj = new FnOverloading();
		int arear= obj.calculate(40,40);
		int areac=obj.calculate(5);
		int arearect=(int)obj.calculate(6.5f,4.3f);
		int areasquare=(int)obj.calculate(545L);
		System.out.println("The area of rhombus: "+arear);
		System.out.println("The area of circle: "+areac);
		System.out.println("The area of rectangle: "+arearect);
		System.out.println("The area of square: "+areasquare);
	}

}
