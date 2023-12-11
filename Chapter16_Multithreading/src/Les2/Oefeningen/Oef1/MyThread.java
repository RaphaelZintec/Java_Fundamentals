package Les2.Oefeningen.Oef1;

import java.time.LocalTime;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(this.getName() + " (id:"+this.getId()+") is working on "+LocalTime.now());
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new MyThread();
        Thread thread2 = new MyThread();
        thread1.start();
        Thread.sleep(10000);
        thread2.start();
    }

}
