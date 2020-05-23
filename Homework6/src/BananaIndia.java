public class BananaIndia extends Banana{

    public Integer curvature;

    public BananaIndia(Double bananaWeight, Integer bananaRipeness, String bananaSort, Double bananaBasePrice, int curvature) {
        super(bananaWeight, bananaRipeness, bananaSort, bananaBasePrice);
        this.curvature = curvature;
    }

    @Override
    public Double bestBefore() {
        return (double) (10 - getBananaRipeness()) * 0.5;
    }

    @Override
    public String toString() {
        return "BananaIndia{" +
                "curvature=" + curvature +
                "} " + super.toString();
    }
} //end of BananaIndia