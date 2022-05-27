package pl.pjait.hrdepartment.model;

import java.util.ArrayList;

public class Worker extends Employee {
    private double grossPerHour;
    private int rbhNo, overtimeNo;
    private Manager superior;
    private ArrayList<String> skills;

    public Worker(String firstName,
                  String lastName,
                  int birthYear,
                  double grossPerHour,
                  int rbhNo,
                  int overtimeNo,
                  Manager superior,
                  ArrayList<String> skills) {
        super(firstName, lastName, birthYear);
        this.grossPerHour = grossPerHour;
        this.rbhNo = rbhNo;
        this.overtimeNo = overtimeNo;
        this.superior = superior;
        this.skills = skills;
    }

    @Override
    public double getSalary() {
        return (rbhNo * grossPerHour) + (1.5*grossPerHour*overtimeNo);
    }

    @Override
    public String toString() {
        return super.toString() + ",\n" + "hourly rate: " + grossPerHour
                + ",\n" + "RBH: " + rbhNo
                + ",\n" + "total overtime: " + overtimeNo
                + ",\n" + "superior: " + superior.getFullName()
                + ",\n" + "skills: " + skills.toString();
    }

    public double getGrossPerHour() {
        return grossPerHour;
    }

    public void setGrossPerHour(double grossPerHour) {
        this.grossPerHour = grossPerHour;
    }

    public int getRbhNo() {
        return rbhNo;
    }

    public void setRbhNo(int rbhNo) {
        this.rbhNo = rbhNo;
    }

    public int getOvertimeNo() {
        return overtimeNo;
    }

    public void setOvertimeNo(int overtimeNo) {
        this.overtimeNo = overtimeNo;
    }

    public Manager getSuperior() {
        return superior;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }
}
