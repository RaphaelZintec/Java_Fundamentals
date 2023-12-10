package Les1.example2;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread "+Thread.currentThread().getId()+" is running");
    }



}
