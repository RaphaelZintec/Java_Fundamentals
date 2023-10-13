package Oefening1.Person;

public class School{

    //attributs
        private String schoolName;
        private Teacher[] teacherArray;
        private Student[] studentArray;

    //constructors
        public School(){}
        public School(String schoolName){
            this.schoolName = schoolName;
        }
        public School(String schoolName, Teacher[] teacherArray){
            this.schoolName = schoolName;
            this.teacherArray = teacherArray;
        }
        public School(String schoolName, Student[] studentArray){
            this.schoolName = schoolName;
            this.studentArray = studentArray;
        }
        public School(String schoolName, Teacher[] teacherArray, Student[] studentArray){
            this.schoolName = schoolName;
            this.teacherArray = teacherArray;
            this.studentArray = studentArray;
        }

    //properties
        public void setSchoolName(String schoolName){
            this.schoolName = schoolName;
        }
        public String getSchoolName(){
            return schoolName;
        }
        public void setTeacherArray(Teacher[] teacherArray){
            this.teacherArray = teacherArray;
        }
        public Teacher[] getTeacherArray(){
            return teacherArray;
        }
        public void setStudentArray(Student[] studentArray){
            this.studentArray = studentArray;
        }
        public Student[] getStudentArray(){
            return studentArray;
        }
        public void showTeachersInfos(){
            System.out.println("\n### HERE ARE OUR TEACHERS ###");
            int i = 0;
            for(Teacher e: teacherArray){
                System.out.println("\nTeacher n°"+(++i));
                System.out.println("Name: "+e.getName());
                System.out.println("Work experience: "+e.getWorkExperience());
            }
        }
        public void showStudentsInfos(){
            System.out.println("\n### HERE ARE OUR STUDENTS ###");
            int i = 0;
            for(Student e: studentArray){
                System.out.println("\nStudent n°"+(++i));
                System.out.println("Name: "+e.getName());
                System.out.println("Educational degres: "+e.getEduDegres());
            }
        }
}
