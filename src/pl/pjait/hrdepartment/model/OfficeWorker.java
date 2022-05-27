package pl.pjait.hrdepartment.model;

public class OfficeWorker extends OfficeEmployee {
    private Manager superior;

    public OfficeWorker(String firstName,
                        String lastName,
                        int birthYear,
                        double wage,
                        double bonus,
                        int phoneNo,
                        int officeNo,
                        Manager superior) {
        super(firstName, lastName, birthYear, wage, bonus, phoneNo, officeNo);
        this.superior = superior;
    }

    @Override
    public String toString() {
        return super.toString() + ",\n" + "superior: " + superior.getFullName();
    }

    public Manager getSuperior() {
        return superior;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }
}
