package Les2.Oefeningen.Oef2;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class VillainSpot {
    public static void main(String[] args) {


        //INIT TIMER
        Random random = new Random();
        int randomTimer = random.nextInt(30000);
        System.out.println("timer: "+ randomTimer);
        System.exit(1);

        //THIS THREAD IS TO SHOW EACH SECOND
        Thread threadBombTimer = new Thread(()-> {
            try {
                secondTask(randomTimer);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        //MAIN THREAD
        Thread mainThread = new Thread(()->mainTask(threadBombTimer, randomTimer));
        mainThread.start();

    }

    public static void mainTask(Thread threadBombTimer, int randomTimer){
        TimeBomb timeBomb = new TimeBomb(10); // Bomb has 10 seconds!
        timeBomb.activate();
        threadBombTimer.start();

        //ONLY MAIN THREAD SLEEP NOT THE threadBombTimer
        try {
            Thread.sleep(randomTimer*1000); // It will take us between 0-30 secs to disarm the bomb.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timeBomb.disarm();
    }

    //THIS METHOD ONLY SHOW EVERY SECONDS
    public static void secondTask(int randomTimer) throws InterruptedException {
        for(int i=1; i<=randomTimer; ++i){
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }
    }


}