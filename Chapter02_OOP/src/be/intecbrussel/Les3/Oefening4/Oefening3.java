package be.intecbrussel.Les3.Oefening4;

public class Oefening3 {
    public static void main(String[] args) {

        //random number from 0-60 + round ceil + convert to int
        int a = (int)Math.ceil(Math.random()*61);

        //control is even of oneven
        boolean even = a % 2 == 0 ? true : false;

        //show result
        if(even){
            System.out.println("Your number is EVEN: "+a);
        }else{
            System.out.println("Your number is ONEVEN: "+a);
        }
    }
}
