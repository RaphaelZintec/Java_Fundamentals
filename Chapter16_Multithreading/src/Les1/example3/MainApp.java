package Les1.example3;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();
        MyThreadRunnable myThreadRunnable = new MyThreadRunnable();
        Thread thread2 = new Thread(myThreadRunnable);

        thread1.start();
        Thread.sleep(1000);
        thread2.start();
    }
}
