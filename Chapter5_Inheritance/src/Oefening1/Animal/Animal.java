package Oefening1.Animal;

public class Animal {

    //ATTRIBUTS
        private String name;
        private int age;

    //CONSTRUCTORS
        public Animal(){}
        public Animal(String name){
            this.name = name;
        }
        public Animal(int age){
            this.age = age;
        }
        public Animal(String name, int age){
            this.name = name;
            this.age = age;
        }

    //PROPERTIES
        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
}
