abstract class Banana {
    private Double bananaWeight; //of 1 banana
    private Integer bananaRipeness; //from 1 to 10
    private String bananaSort; //Cavendish, Panama, India
    private Double bananaBasePrice; //€/kg

    public Banana (Double bananaWeight, Integer bananaRipeness, String bananaSort, Double bananaBasePrice) {
        this.bananaWeight = bananaWeight;
        this.bananaRipeness = bananaRipeness;
        this.bananaSort = bananaSort;
        this.bananaBasePrice = bananaBasePrice;
    }

    public Integer getBananaRipeness() {
        return bananaRipeness;
    }

    public Double price() {
        if (this.bananaWeight > 0.2) {
            return bestBefore() * this.bananaBasePrice * 0.95;
        } else {
            return bestBefore() * this.bananaBasePrice;
        }
    }
    public abstract Double bestBefore();

    @Override
    public String toString() {
        return "Banana{" +
                "bananaWeight=" + bananaWeight +
                ", bananaRipeness=" + bananaRipeness +
                ", bananaSort='" + bananaSort + '\'' +
                ", bananaBasePrice=" + bananaBasePrice +
                '}';
    }
} //end of Banana