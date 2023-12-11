package Les2.timer;

import java.util.Timer;
import java.util.TimerTask;

public class RabbitTime extends TimerTask {

    @Override
    public void run() {
        System.out.println("Im late");
    }

    public static void main(String[] args) {
        RabbitTime task = new RabbitTime();
        Timer timer = new Timer(true);
        timer.schedule(task, 5000);

        try{
            Thread.sleep(10000);
        } catch (Exception e){
            throw new RuntimeException(e);
        }


    }
}
