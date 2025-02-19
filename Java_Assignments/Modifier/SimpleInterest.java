package Modifier;

public class SimpleInterest {
	public double calculateSI(int p, int r, int t)
	{
		double si = p*r*t/100;
		return si;
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SimpleInterest s = new SimpleInterest();
		double res= s.calculateSI(30, 20, 4);
		System.out.println("The Simple interest is: "+ res);
		double sum = res+30; //after assigning a variable
		System.out.println("The amount is: "+ sum);
		System.out.println("The amount is: "+(res+30));//without assigning variable
	}
}
