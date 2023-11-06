package Les1.NonStaticExample;

public class NonStaticExample {
    private int a = 10;

    public class Inner{
        int a = 1;
        public void run(){
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(NonStaticExample.this.a);
        }
    }
    public void run(){
        System.out.println(a);
        System.out.println(this.a);
    }


}
