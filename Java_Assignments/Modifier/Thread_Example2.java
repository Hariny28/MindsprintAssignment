package Modifier;

class FactorialThread extends Thread {
    private int number;
 
    public FactorialThread(int number) {
        this.number = number;
    }
 
    @Override
    public void run() {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("Factorial of " + number + " is " + result);
    }
}
 
class AddThread extends Thread {
    private int num1, num2;
 
    public AddThread(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
 
    @Override
    public void run() {
        int result = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + result);
    }
}
 
public class Thread_Example2 {
    public static void main(String[] args) {
        Thread t1 = new FactorialThread(4);
        Thread t2 = new FactorialThread(6);
        Thread t3 = new AddThread(4, 5);
        Thread t4 = new AddThread(10, 20);
 
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
