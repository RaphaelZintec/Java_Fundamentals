package ZwakkePunten.Part1.multithread_notify_wait;

public class Stock{
    private int totalQuantity;
    private final int MAX_QUANTITY = 100;

    public Stock(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public synchronized void add(int quantity) throws InterruptedException {
        if (totalQuantity+quantity > MAX_QUANTITY){
            System.out.println("\n\uD83D\uDD34 Store cannot add "+quantity+" items because not enough space because the store has "+totalQuantity+" and max space is for "+MAX_QUANTITY+" items");
            wait();
        }
        totalQuantity+=quantity;
        System.out.println("\n\uD83C\uDFEA Gucci store just added "+quantity+" new items");
        System.out.println("\uD83D\uDCE6 Total stock is "+totalQuantity);
        notify();
    }
    public synchronized void remove(int quantity) throws InterruptedException {
        if (totalQuantity-quantity < 0){
            System.out.println("\n\uD83D\uDD34 Client cannot buy "+quantity+" items because store has only "+totalQuantity+" items in stock");
            wait();
        }
        totalQuantity-=quantity;
        System.out.println("\n\uD83D\uDE4D A client just bought "+quantity+" items");
        System.out.println("\uD83D\uDCE6 Total stock is "+totalQuantity);
        notify();
    }
}
