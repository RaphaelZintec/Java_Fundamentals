package Les2.Oefeningen.Oef2;

import java.time.Duration;
import java.time.LocalTime;

public class TimeBomb {
    private int timer;
    private LocalTime timeStart;
    private LocalTime timeEnd;

    public TimeBomb(int timer) {
        this.timer = timer;
    }

    public void activate() {
        //GET TIME WHEN ACTIVATED
        System.out.println("Bomb is activated: "+timer+" seconds left");
        timeStart = LocalTime.now();
    }

    public void disarm() {
        //GET TIME WHEN DISMANTLED
        timeEnd = LocalTime.now();
        Duration duration = Duration.between(timeStart, timeEnd);
        //COMPARE BOTH TIME
        if(duration.getSeconds()<=10){
            System.out.println("Bomb is dismantled within "+duration.getSeconds()+" seconds");
        }
        else System.out.println("BOMB EXPLODED: "+duration.getSeconds()+" seconds passed");

    }
}
