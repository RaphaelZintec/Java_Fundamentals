package Project1;

import java.util.Random;

public class Person implements Runnable{
    private String name;
    private int age;
    private Thread heart;
    private Thread breathing;
    private Thread life;


    public Person(){}
    public Person(String name, int age, int heartBeatMiliSeconds) {
        this.name = name;
        this.age = age;
        life = new Thread(this);
        heart = new Thread(new HeartBeat(heartBeatMiliSeconds, this));
    }

    public String getName() {
        return name;
    }

    public void startLife() {
        System.out.println("🙍 "+name+" "+age+" years ");
        life.start();
        heart.start();
    }
    public void endLife() {
        life.interrupt();
        heart.interrupt();
    }
    @Override
    public void run() {
        Random random = new Random();
        for (int i=age, y=random.nextInt(20); i<=100; ++i, y=random.nextInt(20)){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("\uD83D\uDC80 "+name+" died at "+i+" years");
                break;
            }
            System.out.println("⏳ "+name+" Age: "+i+" Random: "+y);
            if (i == 99 || y == 13){
                endLife();
            }
        }
    }


}
