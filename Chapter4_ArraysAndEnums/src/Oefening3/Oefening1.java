package Oefening3;

public class Oefening1 {

    public final int MAX_TEMPERATURE = 30;

    public static void main(String[] args) {
        String myString = "Char Array!";
        char[] charArray = myString.toCharArray();
        for (int i = 0; i<charArray.length; ++i){
            System.out.print(
                    i == 0 || i == 4 ?
                    charArray[i] == ' ' ? i+" = | " : "|"+i+" = "+charArray[i]+" | "
                            : i+" = "+charArray[i]+" | ");
        }

        //Oefening1 obj = new Oefening1();
        //obj.MAX_TEMPERATURE = 50;
        //System.out.println(obj.MAX_TEMPERATURE);
        //obj = instance/reference 986d6c50 points to the object

        //class= MyClass
        //constant = MY_CONSTANT
        //everything else = giveTheNameYouWant

    }
}
