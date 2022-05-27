package pl.pjait.hrdepartment.model;

public abstract class Employee {
    private String firstName, lastName;
    private int birthYear;

    public Employee(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public abstract double getSalary();

    @Override
    public String toString() {
        return  "=======================================" + "\n"+
                this.getClass().getSimpleName() + ",\n" +
                "firstName: " + firstName + ",\n" +
                "lastName: " + lastName + ",\n" +
                "birthYear: " + birthYear;

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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

}
