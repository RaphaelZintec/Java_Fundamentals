package Oefening1.Person;

public class SchoolApp {
    public static void main(String[] args) {

        Teacher[] teacherArray = new Teacher[3];
        teacherArray[0] = new Teacher();
        teacherArray[1] = new Teacher("Junior");
        teacherArray[2] = new Teacher("Hilal","Senior");

        Student[] studentArray = new Student[3];
        studentArray[0] = new Student();
        studentArray[1] = new Student("Bachelor");
        studentArray[2] = new Student("Haytam", "Master");

        School school = new School("Intec", teacherArray, studentArray);
        System.out.println("WELCOME TO THE SCHOOL "+school.getSchoolName());
        school.showTeachersInfos();
        school.showStudentsInfos();
    }
}
