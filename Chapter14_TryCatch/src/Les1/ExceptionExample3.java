package Les1;

public class ExceptionExample3 {
    public static void main(String[] args) {

        String[] months = {"januari", "februari", "mart", "april"};

        try{
            for(int i = 0; i<5; ++i){
                System.out.println(months[i]);
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("final code");
        }

    }
}
