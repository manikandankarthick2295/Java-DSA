package practise;

public class multithreaing {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start(); // Starts thread t1
        t2.start(); // Starts thread t2
    }
}
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " → " + i);
        }
    }
}
