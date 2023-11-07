package Oefening1And2;
//OEFENING 1 & 2
public class OuterClass {
    private int a;
    private int b;

    public class InnerClass implements MathFunctions{
        public int sum() {
            return a+b;
        }
        public int min(){
            return Math.min(a,b);
        }
        public int max(){
            return Math.max(a,b);
        }

        @Override
        public double product() {
            return a*b;
        }

        @Override
        public double division() {
            return a/b;
        }
    }


    public void setA(int a) {
        this.a = a;
    }


    public void setB(int b) {
        this.b = b;
    }
}
