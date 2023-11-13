package Les1;

import java.util.ArrayList;

public class StreamsExample1 {
    public static void main(String[] args) {
        ArrayList< String> names = new ArrayList<>();
        names.add(0,"Rakeesh");
        names.add(1,"Panjeet");
        names.add(2,"Calia");
        names.forEach((name)->System.out.println(name+" ee"));
    }
}
