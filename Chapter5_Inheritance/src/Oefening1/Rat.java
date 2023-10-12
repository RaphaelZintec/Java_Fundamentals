package Oefening1;

public class Rat extends Animal{
    //ATTRIBUTS
        private String disease = "Salmonellose";

    //CONSTRUCTOR
        public Rat(){}
        public Rat(String disease){
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
