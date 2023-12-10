package Les1.example1;

public class PrintAppLambda {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->print('c',10));
        Thread t2 = new Thread(()->print('*',10));

        System.out.println(t1.getState());
        System.out.println(t2.getState());

        t1.start();
        System.out.println(t1.getState());

        t2.start();
        System.out.println(t2.getState());

        print('&',10);
    }

    public static void print(char c, int count){
        for(int i = 0; i<count; ++i){
            System.out.print(c);
        }
    }


}
