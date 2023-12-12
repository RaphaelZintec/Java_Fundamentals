package Simple;

public class Gucci extends Thread{
    private Stock stock;
    private int numberOfItems;

    public Gucci(Stock stock, int numberOfItems) {
        this.stock = stock;
        this.numberOfItems = numberOfItems;
    }

    @Override
    public void run() {
        try {
            stock.add(numberOfItems);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
