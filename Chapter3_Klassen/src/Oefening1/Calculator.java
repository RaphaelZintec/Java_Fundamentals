package Oefening1;

public class Calculator {

    public int smallestNumber = 0;

    public int getSmallestNumber(int n1, int n2, int n3){
        if(n1 < n2 && n1 < n3){
            this.smallestNumber = n1;
        } else if (n2 < n1 && n2 < n3) {
            this.smallestNumber = n2;
        }
        else {
            this.smallestNumber = n3;
        }
        return this.smallestNumber;
    }
    public boolean checkEvenOnevenNumber(int number){
        if(number%2==0){
            return true;
        }
        else {
            return false;
        }
    }

    /*INT METHODS*/
    public int getAddition(int n1, int n2){
        return n1+n2;
    }
    public int getSubtraction(int n1, int n2){
        return n1-n2;
    }
    public int getMultiplication(int n1, int n2){
        return n1*n2;
    }
    public int getDivision(int n1, int n2){
        return n1/n2;
    }
    public static int getModulo(int n1, int n2){
        return n1%n2;
    }


    /*DOUBLE METHODS*/
    public double getAddition(double n1, double n2){
        return n1+n2;
    }
    public double getSubtraction(double n1, double n2){
        return n1-n2;
    }
    public double getMultiplication(double n1, double n2){
        return n1*n2;
    }
    public double getDivision(double n1, double n2){
        return n1/n2;
    }


}
