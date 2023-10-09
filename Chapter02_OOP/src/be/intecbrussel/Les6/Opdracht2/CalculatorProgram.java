package be.intecbrussel.Les6.Opdracht2;
import java.util.Scanner;
public class CalculatorProgram {
    public static void main(String[] args) {
            //CalculatorProgram

            //init
            int age = 0;
            Scanner myScanner = new Scanner(System.in);

            //welcome msg
            System.out.println("Welcome to age calculator program\nWrite the age: ");

            //user enter age and check if he enter only numbers
            while(true){
                try{
                    age = myScanner.nextInt();
                    break;
                }catch(Exception e){
                    myScanner.nextLine();
                    System.out.println("Write only numbers no decimals: ");
                }
            }

            //call check age method
            System.out.println(ageChecking(age));

            //goodbye message
            System.out.println("Thank you for using this program");

    }

    //check age method
    public static String ageChecking(int age){
        if(age >= 18){
            return "You are an adult";
        } else if (age >= 10 && age < 18) {
            return "You are a teenage";
        } else if (age >= 2 && age < 10) {
            return "You are a child";
        }else{
            return "You are a baby";
        }
    }

}
