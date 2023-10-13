package Oefening1.Animal;

public class Cat extends Animal{

    //ATTRIBUTS
        private String food;

    //CONSTRUCTOR
        public Cat(){}
        public Cat(String food){
            this.food = food;
        }
        public Cat(String food, String name, int age){
            super(name, age);
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
