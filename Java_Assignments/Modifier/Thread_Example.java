package Modifier;

public class Thread_Example extends Thread {
    private static final Object lock = new Object();
    private static boolean t2Done = false;
    private static boolean t4Done = false;
    private static boolean t1Done = false;

    private String threadName;

    public Thread_Example(String threadName) {
        this.threadName = threadName;
    }

    synchronized public int add(int a, int b) {
        int sum = a + b;
        System.out.println(threadName + " - Sum: " + sum);
        return sum;
    }

    synchronized public int factorial(int a) {
        int fact = 1;
        for (int i = a; i >= 1; i--) {
            fact = i * fact;
        }
        System.out.println(threadName + " - Factorial: " + fact);
        return fact;
    }

    public void run() {
        synchronized (lock) {
            try {
                switch (threadName) {
                
                    case "T1":
                        while (!t4Done) {
                            lock.wait();
                        }
                        factorial(4);
                        t1Done = true;
                        lock.notifyAll();
                        break;
                        
                    case "T2":
                        factorial(6);
                        t2Done = true;
                        lock.notifyAll();
                        break;
                        
                    case "T3":
                        while (!t1Done) {
                            lock.wait();
                        }
                        add(4,5);
                        lock.notifyAll();
                        break;
                        
                    case "T4":
                        while (!t2Done) {
                            lock.wait();
                        }
                        add(20,10);
                        t4Done = true;
                        lock.notifyAll();
                        break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread_Example t1 = new Thread_Example("T1");
        Thread_Example t2 = new Thread_Example("T2");
        Thread_Example t3 = new Thread_Example("T3");
        Thread_Example t4 = new Thread_Example("T4");

        t2.start();
        t4.start();
        t1.start();
        t3.start();
    }
}
