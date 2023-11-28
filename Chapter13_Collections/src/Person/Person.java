package Person;

public class Person {
    public enum Gender{
        MALE, FEMALE;
    }

    private String name;
    private Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name +"-"+gender;
    }
}
