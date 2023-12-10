package Les1.example1;

public class ExampleJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread studeren = new Thread(new Thread1());
        Thread gamen = new Thread(new Thread1());
        Thread eten = new Thread(new Thread1());

        studeren.start();

        studeren.join(1000);

        gamen.start();

        gamen.join();

        eten.start();

    }
}
