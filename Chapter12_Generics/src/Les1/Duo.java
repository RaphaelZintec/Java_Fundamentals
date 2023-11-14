package Les1;

public class Duo <T>{
    private T s1;
    private T s2;

    public Duo(T s1, T s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public void setS1(T s1) {
        this.s1 = s1;
    }

    public void setS2(T s2) {
        this.s2 = s2;
    }

    public T getS1() {
        return s1;
    }

    public T getS2() {
        return s2;
    }

    public void swap(){
        T temp = s1;
        s1=s2;
        s2=temp;
    }

}
