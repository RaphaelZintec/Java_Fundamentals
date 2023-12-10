package Les1.example1;

public class Thread1 extends Thread{
    private String sign;
    private int number;

    public Thread1(String sign){
        this.sign = sign;
    }


    public Thread1(String sign, int number){
        this.sign = sign;
        this.number = number;
    }

    public Thread1(){}

    @Override
    public void run() {
        for (int i=0; i<50; ++i)
            System.out.println(sign+" "+number);
    }
}
