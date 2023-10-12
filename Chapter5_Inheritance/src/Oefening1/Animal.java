package Oefening1;

public class Animal {
    //ATTRIBUTS
        private String name;
        private int age;

    //CONSTRUCTORS
        public Animal(){}
        public Animal(String name){
            this.name = name;
        }
        public Animal(String name, int age){
            this.name = name;
            this.age = age;
        }

    //PROPERTIES
        public void setName(String name){
            this.name = name;
        }
        public void setAge(String age){
            this.age = age;
        }
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
}
