package Project1;

import java.util.Random;

public class Person implements Runnable{
    private String name;
    private int age;
    private final int MAX_AGE;
    private int cursedNumber;
    private String avatar;
    private String textColor;
    private Thread heart;
    private Thread breathing;
    private Thread life;


    public Person(int maxAge){
        MAX_AGE = maxAge;
    }

    public Person(String name, int age, int heartBeatMiliSeconds, String avatar, int maxAge, int cursedNumber, String textColor) {
        this.name = name;
        this.age = age;
        this.avatar = avatar;
        this.MAX_AGE = maxAge;
        this.cursedNumber = cursedNumber;
        this.textColor = textColor;
        life = new Thread(this);
        heart = new Thread(new HeartBeat(heartBeatMiliSeconds, this));
        breathing = new Thread(new Lungs(this));
    }

    public String getAvatar() {
        return avatar;
    }

    public String getTextColor() {
        return textColor;
    }

    public void startLife() {
        System.out.println(textColor+""+avatar+" this is "+name+" and he is "+age+" years\u001B[0m");
        heart.start();
        breathing.start();
        life.start();
    }
    public void endLife() throws InterruptedException {
        heart.interrupt();
        heart.join();           //first heart stop beating
        breathing.interrupt();
        breathing.join();       //then lungs stop working
        life.interrupt();       //finally person die
    }
    @Override
    public void run() {
        Random random = new Random();
        for (int i=age, y=random.nextInt(21); i<=MAX_AGE+1; ++i, y=random.nextInt(21)){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("\u001B[41m\uD83D\uDC80\uD83D\uDC80\uD83D\uDC80 "+avatar+""+name+" died at "+(age = i-1)+" years \uD83D\uDC80\uD83D\uDC80\uD83D\uDC80\u001B[0m");
                break;
            }
            System.out.println(textColor+""+avatar+"⏳ a year has passed and now "+name+" is "+(age = i)+" (random: "+y+")\u001B[0m");
            if (i == MAX_AGE || y == cursedNumber){ //if jerry reach MAX_AGE years or random number which is cursedNumber then he dies
                try {
                    endLife();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


}
