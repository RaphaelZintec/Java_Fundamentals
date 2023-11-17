package My;

public class MainApp {
    public static void main(String[] args) {
        try{
            A a = new A(4);
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
