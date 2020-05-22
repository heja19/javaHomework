import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductTester {

    public static void main(String[] args) {

        Vendor vendor = new Vendor("Blesk Shop", "611 Commerce St", "Anette Anderson", "62339944");

        Product ChacottBall98599 = new Product(101, "Gold Art. 016-98599", 13, 63);
        Product ChacottBall98577 = new Product(102, "Amethyst Art. 016-98577", 2, 64);
        Product ChacottBall98537 = new Product(103, "Emerald Art. 016-98537", 11, 60);
        Product ChacottBall98681 = new Product(104, "Carrot Art. 015-98681 ", 17, 67);
        Product ChacottBall98645 = new Product(105, "Rose Art. 015-98645", 19, 61);
        Product ChacottBall98631 = new Product(106, "Gold Art. 015-98631", 27, 66);

        ArrayList<Product> products = new ArrayList<Product>();
        Collections.addAll(products, ChacottBall98599, ChacottBall98577, ChacottBall98537, ChacottBall98681, ChacottBall98645, ChacottBall98631);

        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).toString());
        }

        Scanner scan = new Scanner(System.in);

        while (true) { //if writing e, then stop asking new products
            System.out.println("Insert the product as: product number, product name, units in stock and product price.");
            System.out.println("Or write e to exit.");
            try {
                String productData = scan.nextLine();
                if (productData.equals("e")) {
                    System.out.println("Exit from inserting a new product");
                    break;
                } else {
                    String[] newProductArray = productData.split(", ");
                    Product newProduct = new Product(Integer.parseInt(newProductArray[0]), newProductArray[1], Integer.parseInt(newProductArray[2]), Double.parseDouble(newProductArray[3]));
                    products.add(newProduct);
                }
            } catch (Exception e) {
                System.out.println("Something went wrong, but I try to figure it out. You can try again in few moments :)" + e);
            }
        }
        for(Product p : products){
            p.setVendor(vendor);
            System.out.println(p.toString());
        }
    }
}