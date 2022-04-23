package pl.pjait.javamarkt;

public class Seller extends Client{
    private String accountNumber;

    public Seller(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Seller(String companyName, String address, String nip, String accountNumber) {
        super(companyName, address, nip);
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
