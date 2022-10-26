package exam.Grade5;

public class Rose extends Flower{
    boolean spikes;

    public Rose(Float price, Float length, String colour, Integer lifeTimeInDays) {
        super(price, length, colour, lifeTimeInDays);
    }

    public Rose(Float price, Float length, String colour, Integer lifeTimeInDays, boolean spikes) {
        super(price, length, colour, lifeTimeInDays);
        this.spikes = spikes;
    }

    public boolean isSpikes() {
        return spikes;
    }

    public void setSpikes(boolean spikes) {
        this.spikes = spikes;
    }
}
