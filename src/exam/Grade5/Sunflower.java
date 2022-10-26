package exam.Grade5;

public class Sunflower extends Flower{
    boolean pabular;
    public Sunflower(Float price, Float length, String colour, Integer lifeTimeInDays) {
        super(price, length, colour, lifeTimeInDays);
    }

    public Sunflower(Float price, Float length, String colour, Integer lifeTimeInDays, boolean pabular) {
        super(price, length, colour, lifeTimeInDays);
        this.pabular = pabular;
    }

    public boolean isPabular() {
        return pabular;
    }

    public void setPabular(boolean pabular) {
        this.pabular = pabular;
    }
}
