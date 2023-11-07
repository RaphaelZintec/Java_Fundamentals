package Les1.Package1;

public class Main {
    public static void main(String[] args) {
        LambdaInterface expression = (int x)-> System.out.println(2*x);
        expression = (int x)-> System.out.println(3*x);
        expression.abstractFunction(5);
    }
}
