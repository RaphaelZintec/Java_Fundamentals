package My;

public class A {
    public int a = 5;
    public A(int a) throws MyExc{
        this.a=a; throw new MyExc();
    }
}
