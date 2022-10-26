package exam.Grade5;

public class Chamomile extends Flower{
    boolean field;
    public Chamomile(Float price, Float length, String colour, Integer lifeTimeInDays) {
        super(price, length, colour, lifeTimeInDays);
    }

    public Chamomile(Float price, Float length, String colour, Integer lifeTimeInDays, boolean field) {
        super(price, length, colour, lifeTimeInDays);
        this.field = field;
    }

    public boolean isField() {
        return field;
    }

    public void setField(boolean field) {
        this.field = field;
    }
}
