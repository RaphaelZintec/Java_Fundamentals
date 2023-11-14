package Project2;

public class Student extends Person {
    private int id;
    private static int incrementId;

    public Student(){getIncrementId();}
    public Student(String name, String lastName) {
        super(name, lastName);
        getIncrementId();
    }

    private static int getIncrementId() {
        return ++incrementId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
