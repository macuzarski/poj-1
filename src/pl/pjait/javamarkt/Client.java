package pl.pjait.javamarkt;

public class Client {
    private String companyName;
    private String address;
    private String nip;

    public Client() {
    }

    public Client(String companyName, String address, String nip) {
        this.companyName = companyName;
        this.address = address;
        this.nip = nip;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
}
