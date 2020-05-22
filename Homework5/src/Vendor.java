public class Vendor {

    private String companyName;
    private String address;
    private String representativeName;
    private String phoneNumber;

    public Vendor(String companyName, String address, String representativeName, String phoneNumber) {
        this.companyName = companyName;
        this.address = address;
        this.representativeName = representativeName;
        this.phoneNumber = phoneNumber;
    }
    public Vendor(){
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

    public String getRepresentativeName() {
        return representativeName;
    }

    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                ", representativeName='" + representativeName + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}