package pl.pjait.loan;

import java.util.Date;

enum Gender { MALE, FEMALE, UNDEFINED }
public class LoanApplication {

    private String firstName;
    private String surname;
    private String pesel;
    private String nip;
    private String bankAccountNumber;
    private Date dateOfBirth;
    private Gender gender;

    public LoanApplication() {
    }

    public LoanApplication(String firstName, String surname, String pesel, String nip, String bankAccountNumber, Date dateOfBirth, Gender gender) {
        this.firstName = firstName;
        this.surname = surname;
        this.pesel = pesel;
        this.nip = nip;
        this.bankAccountNumber = bankAccountNumber;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
