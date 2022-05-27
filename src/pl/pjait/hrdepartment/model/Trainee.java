package pl.pjait.hrdepartment.model;

public class Trainee extends Employee{
    private Employee buddy;
    private boolean scholarship;

    public Trainee(String firstName, String lastName, int birthYear, Employee buddy, boolean scholarship) {
        super(firstName, lastName, birthYear);
        this.buddy = buddy;
        this.scholarship = scholarship;
    }

    @Override
    public double getSalary() {
        if(!scholarship)return 0;
        return 500.0;
    }

    @Override
    public String toString() {
        return super.toString() + ",\n" + "buddy: " + buddy.getFullName()
                + ",\n" + "scholarship: " + scholarship;
    }

    public Employee getBuddy() {
        return buddy;
    }

    public void setBuddy(Employee buddy) {
        this.buddy = buddy;
    }

    public boolean isScholarship() {
        return scholarship;
    }

    public void setScholarship(boolean scholarship) {
        this.scholarship = scholarship;
    }
}
