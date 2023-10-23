package Les1.FinalExample;

public class FinalExample3 {
    public static void main(String[] args) {
        int[] tab = {1,2,3};
        for (final int e:tab)
            System.out.println(e);
    }
}
