package Les1;

public class NumberDuo <T extends Number>{
    private T first;
    private T second;

    public NumberDuo(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public double sum(){
        return first.doubleValue()+second.doubleValue();
    }
}
