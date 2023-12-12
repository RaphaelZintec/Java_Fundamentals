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
                System.out.println("\u001B[41m⚠️⚠️⚠️ "+person.getAvatar()+"❤️ stopped beating! ⚠️⚠️⚠️\u001B[0m");
                break;
            }
            System.out.println(person.getAvatar()+"❤️ beating at "+miliSecondsBetweenBeats+" miliseconds");
        }
    }


}
