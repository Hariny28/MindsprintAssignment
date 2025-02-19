package Modifier;

public class Calculation {
	public int calculate(int a, int b) {
		return a+b;
	}
	public float calculate(float a, float b) {
		return a-b;
	}
	public long calculate(long a, long b)
	{
		return a/b;
	}
	public double calculate(double a, double b)
	{
		return a*b;
	}
	public void even(int a)
	{
		if(a%2==0) {
			System.out.println(a+" is even number");
			return;
		}
		System.out.println(a+" is not an even number");
	}
	public void prime(int a)
	{
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0) 
			{
				System.out.println(a+" is not prime");
				return;
			}
			
		}
		System.out.println(a+" is prime");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculation c= new Calculation();
		c.even(4);
		c.even(5);
		c.prime(4);
		c.prime(11);
		System.out.println(c.calculate(4,3));
		System.out.println(c.calculate(4.2f,3.45f));
		System.out.println(c.calculate(4.267,3.45));
		System.out.println(c.calculate(4267L,3458L));
		

	}

}
