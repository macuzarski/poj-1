package pl.pjait.student;

public class Scholar extends Student {
    private double scholarship;

    public Scholar() {
    }

    public Scholar(String firstName, String lastName, int yearOfBirth, Gender gender, int index, double scholarship) {
        super(firstName, lastName, yearOfBirth, gender, index);
        this.scholarship = scholarship;
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }

    public String toString() {
        return super.toString() + ",\n" + "scholarship: " + scholarship;
    }
}
