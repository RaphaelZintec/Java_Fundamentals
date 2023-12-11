package Les2.synch;

public class MyThread {
    private int count= 0;

    public int getCount() {
        return count;
    }

    public static void main(String[] args) throws Exception {
        MyThread voorbeeld = new MyThread();
        InnerThread innerThread1 = new InnerThread(voorbeeld);
        InnerThread innerThread2 = new InnerThread(voorbeeld);

        innerThread1.start();
        innerThread1.join();
        innerThread2.start();

        System.out.println("Hello vanaf hoofdthread");
    }
        private static class InnerThread extends Thread{
            private MyThread voorbeeld;
            public InnerThread(MyThread voorbeeld){
                this.voorbeeld = voorbeeld;
            }
            public void run(){
                try {
                    voorbeeld.incrementCount();
                    Thread.sleep(3000);
                    System.out.println("hello vanaf thread "+this.getId()+", count is nu "+voorbeeld.getCount());
                } catch(InterruptedException e){
                    e.printStackTrace();
                }

            }
        }
    public synchronized void incrementCount(){
        count++;
    }

}
