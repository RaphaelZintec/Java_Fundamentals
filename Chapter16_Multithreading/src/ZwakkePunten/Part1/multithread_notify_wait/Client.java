package ZwakkePunten.Part1.multithread_notify_wait;

public class Client extends Thread{
    private Stock stock;
    private int numberOfItems;

    public Client(Stock stock, int numberOfItems) {
        this.stock = stock;
        this.numberOfItems = numberOfItems;
    }

    @Override
    public void run() {
        try {
            stock.remove(numberOfItems);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
