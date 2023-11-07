package Les1.Package1;

public class Main3 {
    public static void main(String[] args) {
        print((a, b) -> a + b, "+");
        print((a, b) -> a - b, "-");
        print((a, b) -> a * b, "*");
        print((a, b) -> a / b, "/");
    }

    static void print(MathInterface math, String op){
        switch (op){
            case "+": System.out.println("Sum: "+math.operation(3,3));  break;
            case "-": System.out.println("SUB: "+math.operation(3,3));  break;
            case "*": System.out.println("Mul: "+math.operation(3,3));  break;
            case "/": System.out.println("Div: "+math.operation(3,3));  break;
            default: throw new AssertionError();
        }
    }
}
