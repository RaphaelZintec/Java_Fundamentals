package Les1;

public class MixedDuo<T, T2>{
    private T obj1;
    private T2 obj2;

    public MixedDuo(T obj1, T2 obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1() {
        return obj1;
    }

    public void setObj1(T obj1) {
        this.obj1 = obj1;
    }

    public T2 getObj2() {
        return obj2;
    }

    public void setObj2(T2 obj2) {
        this.obj2 = obj2;
    }
}
