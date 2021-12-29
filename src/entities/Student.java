package entities;

import java.util.Objects;

public class Student {

    //Attibute
    private int number;

    //Constructor
    public Student(int number) {
        this.number = number;
    }

    //Getter and Setter
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //Equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return number == student.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
