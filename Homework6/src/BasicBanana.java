public class BasicBanana extends Banana{

    public BasicBanana(Double bananaWeight, Integer bananaRipeness, String bananaSort, Double bananaBasePrice) {
        super(bananaWeight, bananaRipeness, bananaSort, bananaBasePrice);
    }

    @Override
    public Double bestBefore() {
        return (double) (10 - getBananaRipeness());
    }

    @Override
    public String toString() {
        return "BasicBanana{" + super.toString() + "}";
    }
}//end of BasicBanana
