public class BananaTest {
    public static void main(String[] args) {

        BasicBanana bc1 = new BasicBanana(0.19, 3, "Cavendish Banana", 1.2);
        BasicBanana bc2 = new BasicBanana(0.281, 7, "Cavendish Banana", 1.0);
        BasicBanana bp1 = new BasicBanana(0.22, 3, "Panama Banana", 1.1);
        BananaIndia bi1 = new BananaIndia(0.053, 2, "India Banana", 1.0, 20);
        BananaIndia bi2 = new BananaIndia(0.081, 9, "India Banana", 0.9, 45);
        BananaIndia bi3 = new BananaIndia(0.101, 3, "India Banana", 1.1, 15);
        BananaIndia bi4 = new BananaIndia(0.118, 6, "India Banana", 1.1, 33);
        BananaIndia bi5 = new BananaIndia(0.136, 4, "India Banana", 1.1, 23);
        BananaIndia bi6 = new BananaIndia(0.244, 8, "India Banana", 0.9, 39);
        BananaIndia bi7 = new BananaIndia(0.281, 1, "India Banana", 1.0, 19);


        Banana[] bananas = {bi1, bi2, bi3, bi4, bi5, bi6, bi7, bc1, bc2, bp1};

        for (Banana b : bananas) {
            System.out.println(b);
            System.out.println("This banana expires in " + b.bestBefore() + " day(s).");
            System.out.println("And the price for this banana is " + b.price() + " €/kg.");
            System.out.println();
        }
    }
} //end of BananaTest