package Oefening1;

public class Dog extends Animal{

    //ATTRIBUTS
        private String hobby;

    //CONSTRUCTOR
        public Dog(){}
        public Dog(String hobby){
            this.hobby = hobby;
        }
        public Dog(String hobby, String name, int age){
            super(name, age);
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
