package pl.pjait.hrdepartment.model;

public class Executive extends Employee{
    private double wage, meetingsAttendanceBonus;
    private Employee assistant;
    private int attendedMeetingsNo;

    public Executive(String firstName,
                     String lastName,
                     int birthYear,
                     double wage,
                     double meetingsAttendanceBonus, Employee assistant,
                     int attendedMeetingsNo) {
        super(firstName, lastName, birthYear);
        this.wage = wage;
        this.meetingsAttendanceBonus = meetingsAttendanceBonus;
        this.assistant = assistant;
        this.attendedMeetingsNo = attendedMeetingsNo;
    }

    @Override
    public double getSalary() {
        return wage+(attendedMeetingsNo*meetingsAttendanceBonus);
    }


    @Override
    public String toString() {
        return super.toString() + ",\n" + "wage: " + wage
                + ",\n" + "assistant: " + assistant.getFullName()
                + ",\n" + "attended meetings: " + attendedMeetingsNo;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public Employee getAssistant() {
        return assistant;
    }

    public void setAssistant(Employee assistant) {
        this.assistant = assistant;
    }

    public int getAttendedMeetingsNo() {
        return attendedMeetingsNo;
    }

    public void setAttendedMeetingsNo(int attendedMeetingsNo) {
        this.attendedMeetingsNo = attendedMeetingsNo;
    }

    public double getMeetingsAttendanceBonus() {
        return meetingsAttendanceBonus;
    }

    public void setMeetingsAttendanceBonus(double meetingsAttendanceBonus) {
        this.meetingsAttendanceBonus = meetingsAttendanceBonus;
    }
}
