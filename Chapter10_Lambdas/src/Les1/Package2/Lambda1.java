package Les1.Package2;

public class Lambda1 {
    public static void main(String[] args) {
        LambdaInterface ref = (x,y) -> {
            System.out.println("hello"+x+y);
            System.out.println("have a nice day");
        };
        ref.message("world", '!');
    }
}
