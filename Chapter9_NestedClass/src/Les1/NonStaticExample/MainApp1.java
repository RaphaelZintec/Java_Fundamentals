package Les1.NonStaticExample;

import Les1.StaticExample.OuterClass1;

public class MainApp1 {
    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2();
        OuterClass2.InnerClass innerClass = outerClass2.new InnerClass();
        System.out.println(outerClass2.x);
        System.out.println(innerClass.y);
    }
}
