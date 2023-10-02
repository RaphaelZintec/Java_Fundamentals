package be.intecbrussel.Les2;

public class StringBuilderExample {
    public static void main(String[] args) {

        //1
        StringBuilder str = new StringBuilder();
        str.append("hello world");
        System.out.println(str);

        //2
        StringBuilder str2 = new StringBuilder("hello worldd");
        System.out.println(str2);

        //3
        StringBuilder str3 = new StringBuilder("walter, mike");
        str3.insert(6,", edwin");
        System.out.println(str3);


        StringBuilder str4 = new StringBuilder("01234567");
        str4.insert(6,"A");
        System.out.println(str4);

        int a = 50;
        String txt = a+" ";
        txt = Integer.toString(a);
        txt = String.valueOf(a);
        System.out.println(txt);

    }
}
