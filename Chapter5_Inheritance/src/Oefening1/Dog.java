package Oefening1;

public class Dog extends Animal{
    //ATTRIBUTS
        private String hobby = "Playing with a ball";

    //CONSTRUCTOR
        public Dog(){}
        public Dog(String hobby){
            this.hobby = hobby;
        }

    //PROPERTIES
        public void setHobby(String hobby){
            this.hobby = hobby;
        }
        public String getHobby(){
            return hobby;
        }
}
