package be.intecbrussel.Les3;

public class IfExample1 {
    public static void main(String[] args) {
        int number = 110;

        if(number < 100){
            System.out.println("number value is smaller than 100");
        }
        else{
            System.out.println("number value is bigger than 100");
        }


        int time = 22;

        if(time < 10){
            System.out.println("Good morning");
        }
        else if(time < 22){
            System.out.println("Good day");
        }
        else{
            System.out.println("Good evening");
        }
    }
}
