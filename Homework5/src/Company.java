public class Company extends Product{

    private String companyName;


    public Company(int productNumber, String productName, int unitsInStock, double productPrice, String companyName) {
        super(productNumber, productName, unitsInStock, productPrice);
        this.companyName = companyName;
    }

    public Company(Vendor vendor, String companyName) {
        super(vendor);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                "} " + super.toString();
    }

    @Override
    public double totalInventoryValue(){
        return super.totalInventoryValue() * 1.05;
    }
}