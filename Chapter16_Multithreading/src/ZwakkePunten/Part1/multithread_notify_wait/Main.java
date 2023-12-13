package ZwakkePunten.Part1.multithread_notify_wait;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock(50);
        Thread threadClient    = new Thread(new Client(stock,100));
        Thread threadGucciStore = new Thread(new Gucci(stock,50));

        threadClient.start();
        threadGucciStore.start();
    }

}
