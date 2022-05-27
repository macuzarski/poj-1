package pl.pjait.student;

public class Lecturer extends Person{
    private String title;

    public Lecturer(String title) {
        this.title = title;
    }

    public Lecturer(String firstName, String lastName, int yearOfBirth, Gender gender, String title) {
        super(firstName, lastName, yearOfBirth, gender);
        this.title = title;
    }

    public String toString() {
        return super.toString() + ", \n" + "title: " + title;
    }
}
