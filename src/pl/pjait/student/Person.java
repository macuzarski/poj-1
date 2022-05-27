package pl.pjait.student;

public class Person {

    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Gender gender;

    public Person() {
    }

    public Person(String firstName, String lastName, int yearOfBirth, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + ",\n" +
                "lastName: " + lastName + ",\n" +
                "yearOfBirth: " + yearOfBirth + ",\n" +
                "gender: " + gender;
    }
}
