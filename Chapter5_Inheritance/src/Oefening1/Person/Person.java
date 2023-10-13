package Oefening1.Person;

public class Person {

    //attributs
        private String name;

    //constructors
        public Person(){}
        public Person(String name){
            this.name = name;
        }

    //properties
        public void setName(String Name){
            this.name = name;
        }
        public String getName(){
            return name;
        }

}
