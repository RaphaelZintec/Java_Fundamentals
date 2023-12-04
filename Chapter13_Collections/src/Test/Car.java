package Test;

import java.util.Objects;

public class Car {
    private int a;
    private String b;

    public Car(int a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return a == car.a && Objects.equals(b, car.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

}
