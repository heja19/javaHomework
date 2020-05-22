public class Product {

    private int productNumber;
    private String productName;
    private int unitsInStock;
    private double productPrice;
    private Vendor vendor;

    public Product(int productNumber, String productName, int unitsInStock, double productPrice) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.unitsInStock = unitsInStock;
        this.productPrice = productPrice;
    }

    public Product(Vendor vendor) {
    }

    public double totalInventoryValue(){
        return unitsInStock * productPrice;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNumber=" + productNumber +
                ", productName='" + productName + '\'' +
                ", unitsInStock=" + unitsInStock +
                ", productPrice=" + productPrice +
                ", vendor=" + vendor +
                '}';
    }

}