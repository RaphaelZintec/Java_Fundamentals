package Oefening1.Person;

public class Teacher extends Person{

    //attributs
        private String workExperience;

    //constructors
        public Teacher(){}
        public Teacher(String workExperience){
            this.workExperience = workExperience;
        }
        public Teacher(String name, String workExperience){
            super(name);
            this.workExperience = workExperience;
        }

    //properties
        public void setWorkExperience(String workExperience){
            this.workExperience = workExperience;
        }
        public String getWorkExperience(){
            return workExperience;
        }

}
