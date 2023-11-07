package Les2;

public class Main {
    public static void main(String[] args) {
        Anonieme a = new Anonieme(){
            public void run(){
                System.out.println("run2");
            }
        };

        a.run();

    }
}
