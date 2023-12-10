package Les1.example2;

public class MainApp {
    public static void main(String[] args) {
        for (int i = 0; i<10; ++i){
            Thread t = new Thread(new MyThreadRunnable());
            t.start();
        }
    }
}
