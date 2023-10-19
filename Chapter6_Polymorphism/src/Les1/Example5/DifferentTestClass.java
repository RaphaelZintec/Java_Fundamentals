package Les1.Example5;

public class DifferentTestClass extends TestInstanceOf{
    public static void method1(TestInstanceOf test){
        if(test instanceof DifferentTestClass){
            DifferentTestClass dtc = (DifferentTestClass) test;
            System.out.println("downcasting");
        }
    }
}
