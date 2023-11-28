package PriorityQueueOefening;

public class BurgerOrder implements Comparable<BurgerOrder>{
    private String naam;
    private int nummer;


    public BurgerOrder(int nummer, String naam) {
        this.nummer = nummer;
        this.naam = naam;
    }


    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }


    @Override
    public String toString() {
        return "BurgerOrder{" +
                "naam='" + naam + '\'' +
                ", nummer=" + nummer +
                '}';
    }


    @Override
    public int compareTo(BurgerOrder o) {
        return this.nummer - o.nummer;
    }
}
