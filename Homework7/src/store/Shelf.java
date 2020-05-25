package store;

public class Shelf {
    private String shelfName;
    private Product product;


    public Shelf(String shelfName, Product product) {
        this.shelfName = shelfName;
        this.product = product;
    }

    public String getShelfName() {
        return shelfName;
    }

    public Product getProduct() {
        return product;
    }
}//end of Shelf