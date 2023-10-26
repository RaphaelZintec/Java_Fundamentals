package Test;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String s = "Hello world";
        StringTokenizer st = new StringTokenizer(s," ");
        while(st.hasMoreElements())
            System.out.println(st.nextElement());

        String str = "hi bob";
        String[] strTab = str.split(" ");
        for (String e: strTab) {
            System.out.println(e);
        }
    }
}
