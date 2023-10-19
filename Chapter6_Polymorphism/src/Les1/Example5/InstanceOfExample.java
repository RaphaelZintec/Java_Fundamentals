package Les1.Example5;

import javax.lang.model.type.NullType;

public class InstanceOfExample {
    public static void main(String[] args) {
        String name = "dd";
        System.out.println(name instanceof String);
        System.out.println(name instanceof Object);

        TestInstanceOf obj1 = new TestInstanceOf();
        System.out.println(obj1 instanceof TestInstanceOf);
        System.out.println(obj1 instanceof DifferentTestClass);

        DifferentTestClass obj2 = new DifferentTestClass();
        System.out.println(obj2 instanceof TestInstanceOf);
        System.out.println(obj2 instanceof DifferentTestClass);

        TestInstanceOf obj3 = null;
        System.out.println(obj3 instanceof TestInstanceOf);
        System.out.println(obj3 instanceof NullType);

        TestInstanceOf obj4 = new DifferentTestClass();

        DifferentTestClass.method1(obj4);
    }
}
