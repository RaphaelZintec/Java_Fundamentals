package My.MyTests.Test;

public enum Test1 {
    //CONSTANT
        LU(1),MA(2),ME(3),JE(4),VE(5),SA(6),DI(7);

    //ATTRIBUTS
        private int number;

    //CONSTRUCTOR
        private Test1(int number){
            this.number = number;
        }

    //METHODS
        public int getNumber(){
            return number;
        }

}
