package Project1;

public class Lungs implements Runnable{
    private boolean lungsFull;
    private Person person;

    public Lungs(){}
    public Lungs(Person person) {
        this.person = person;
    }


    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("\u001B[41m⚠️⚠️⚠️ "+person.getAvatar()+"\uD83E\uDEC1 stopped working! ⚠️⚠️⚠️\u001B[0m");
                break;
            }
            if (lungsFull)
                System.out.println(person.getAvatar()+"\uD83C\uDF2C\uFE0F is breathing out");
            else
                System.out.println(person.getAvatar()+"\uD83C\uDF2C\uFE0F is breathing in");
            lungsFull = !lungsFull;
        }

    }


}
