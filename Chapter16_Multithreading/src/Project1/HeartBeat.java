package Project1;

public class HeartBeat implements Runnable{
    private int miliSecondsBetweenBeats;

    private Person person;

    public HeartBeat(int miliSecondsBetweenBeats, Person person) {
        this.miliSecondsBetweenBeats = miliSecondsBetweenBeats;
        this.person = person;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(miliSecondsBetweenBeats);
            } catch (InterruptedException e) {
                System.out.println("❤️ of "+person.getName()+" stopped beating!");
            }
            System.out.println("❤️ of "+person.getName()+" is beating at "+miliSecondsBetweenBeats+" miliseconds");
        }
    }


}
