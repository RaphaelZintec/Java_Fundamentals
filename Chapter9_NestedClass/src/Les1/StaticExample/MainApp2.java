package Les1.StaticExample;

public class MainApp2 {

    public static void main(String[] args) {
        StaticExample.Inner inner = new StaticExample.Inner();
        inner.run();
        System.out.println(StaticExample.Inner.c);
    }
}
