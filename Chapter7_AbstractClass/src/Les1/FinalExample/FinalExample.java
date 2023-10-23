package Les1.FinalExample;

public class FinalExample {

    final int THRESHOLD = 5;
    static final double PI = 3.14;
    final int CAPACITY;
    final static int DAYS_OF_THE_WEEK;
    final int MINIMUM;

    {
        CAPACITY = 25;
    }

    static {
        DAYS_OF_THE_WEEK = 7;
    }

    public FinalExample(){
        MINIMUM = -1;
    }
}
