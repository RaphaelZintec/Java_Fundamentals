package Oefening1;

import Les1.Car;

public class Cat extends Animal{
    //ATTRIBUTS
        private String food = "Wiskas";

    //CONSTRUCTOR
        public Cat(){}
        public Cat(String food){
            this.food = food;
        }

    //PROPERTIES
        public void setFood(String food){
            this.food = food;
        }
        public String getFood(){
            return food;
        }
}
