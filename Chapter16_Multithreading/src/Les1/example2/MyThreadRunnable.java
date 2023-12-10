package Les1.example2;

public class MyThreadRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread "+Thread.currentThread().getId()+" is running");
    }



}
