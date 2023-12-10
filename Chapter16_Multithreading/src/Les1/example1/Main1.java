package Les1.example1;

public class Main1 {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1("*", 10);
        Thread1 t2 = new Thread1("-", 100);

        System.out.println(t1.getState());
        System.out.println(t2.getState());
        t1.start();
        t2.start();

        Thread.sleep(2000);
        System.out.println(t1.getState());
        t1.interrupt();
        System.out.println(t1.getState());
        Thread.sleep(500);
        t1.interrupt();
        Thread.sleep(500);
        t1.interrupt();
    }
}
