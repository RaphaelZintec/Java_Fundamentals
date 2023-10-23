package Les1.FinalExample;

public class FinalExample2 {
    public static void main(String[] args) {
        final StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.append(" World");
        System.out.println(sb);
    }
}
