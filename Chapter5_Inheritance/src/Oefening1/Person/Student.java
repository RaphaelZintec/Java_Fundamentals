package Oefening1.Person;

public class Student extends Person{

    //attributs
        private String eduDegres;

    //constructors
        public Student(){}
        public Student(String eduDegres){
            this.eduDegres = eduDegres;
        }
        public Student(String name, String eduDegres){
            super(name);
            this.eduDegres = eduDegres;
        }

    //properties
        public void setEduDegres(String eduDegres){
            this.eduDegres = eduDegres;
        }
        public String getEduDegres(){
            return eduDegres;
        }

}
