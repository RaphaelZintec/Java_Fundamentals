package Les2.Daemon;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->print(ThreadColors.AINSI_BLUE + "1",100));
        Thread thread2 = new Thread(()->print(ThreadColors.AINSI_GREEN + "2",100));

        thread2.setDaemon(true);
        thread1.start();
        thread2.start();

        System.out.println(Runtime.getRuntime().availableProcessors());
    }

    public static void print(String text, int count){
        for(int j=0; j<count; ++j){
            System.out.print(text);
            Thread.yield();
        }
    }
}
