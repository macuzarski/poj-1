package pl.pjait.hrdepartment.model;

public class OfficeEmployee extends Employee{

    private double wage, bonus;
    private int phoneNo, officeNo;

    public OfficeEmployee(String firstName,
                          String lastName,
                          int birthYear,
                          double wage,
                          double bonus,
                          int phoneNo,
                          int officeNo) {
        super(firstName, lastName, birthYear);
        this.wage = wage;
        this.bonus = bonus;
        this.phoneNo = phoneNo;
        this.officeNo = officeNo;
    }

    @Override
    public double getSalary() {
        return wage+(bonus*wage);
    }

    @Override
    public String toString() {
        return super.toString() + ",\n" + "wage: " + wage
                + ",\n" + "bonus: " + bonus
                + ",\n" + "phone number: "+ phoneNo
                + ",\n" + "room number: " + officeNo;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getOfficeNo() {
        return officeNo;
    }

    public void setOfficeNo(int officeNo) {
        this.officeNo = officeNo;
    }
}
