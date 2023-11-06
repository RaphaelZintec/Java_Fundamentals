package Les1.NonStaticExample;

public class MainApp2 {
    public static void main(String[] args) {
        NonStaticExample nonStaticExample = new NonStaticExample();
        NonStaticExample.Inner inner = nonStaticExample.new Inner();
        nonStaticExample.run();
        inner.run();
    }
}
