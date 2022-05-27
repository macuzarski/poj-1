package pl.pjait.hrdepartment.model;

public class Manager extends OfficeEmployee {
    private double managerExtraPay;
    private String department;

    public Manager(String firstName,
                   String lastName,
                   int birthYear,
                   double wage,
                   double bonus,
                   int phoneNo,
                   int officeNo,
                   double managerExtraPay,
                   String department) {
        super(firstName, lastName, birthYear, wage, bonus, phoneNo, officeNo);
        this.managerExtraPay = managerExtraPay;
        this.department = department;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + managerExtraPay;
    }

    @Override
    public String toString() {
        return super.toString() + ",\n" + "manager bonus: " + managerExtraPay
                + ",\n" + "department: " + department;
    }

    public double getManagerExtraPay() {
        return managerExtraPay;
    }

    public void setManagerExtraPay(double managerExtraPay) {
        this.managerExtraPay = managerExtraPay;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
