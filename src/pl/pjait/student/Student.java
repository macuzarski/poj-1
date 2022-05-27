package pl.pjait.student;

public class Student extends Person{
    private int index;

    public Student() {
    }

    public Student(String firstName, String lastName, int yearOfBirth, Gender gender, int index) {
        super(firstName, lastName, yearOfBirth, gender);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String toString() {
        return super.toString() + ",\n" + "index: " + index;
    }

}
