package Oefening1.Animal;

public class Rat extends Animal{

    //ATTRIBUTS
        private String disease;

    //CONSTRUCTOR
        public Rat(){}
        public Rat(String disease){
            this.disease = disease;
        }
        public Rat(String disease, int age){
            super(age);
            this.disease = disease;
        }
        public Rat(String disease, String name, int age){
            super(name, age);
            this.disease = disease;
        }

    //PROPERTIES
        public void setDisease(String disease){
            this.disease = disease;
        }
        public String getDisease(){
            return disease;
        }
}
