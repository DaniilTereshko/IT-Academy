package exam.Grade5;

import java.util.HashSet;
import java.util.Set;

public abstract class Flower {
    private Float price;
    private Float length;
    private String colour;
    private Integer lifeTimeInDays;

    public Flower(Float price, Float length, String colour, Integer lifeTimeInDays) {
        this.price = price;
        this.length = length;
        this.colour = colour;
        this.lifeTimeInDays = lifeTimeInDays;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getLifeTimeInDays() {
        return lifeTimeInDays;
    }

    public void setLifeTimeInDays(Integer lifeTimeInDays) {
        this.lifeTimeInDays = lifeTimeInDays;
    }

    public static Float bouquetPrice(Flower[] obj){
        Float price = 0F;
        for(Flower o: obj) price+=o.getPrice();
        return price;
    }
    public static Integer lifeTime(Flower[] obj){
        Integer time = 0;
        Integer max = obj[0].getLifeTimeInDays();
        for(Flower o: obj) {
            if(max < o.getLifeTimeInDays()) max = o.getLifeTimeInDays();
        }
        return max;
    }
    public static String colours(Flower[] obj){
        Set<String> colours = new HashSet<>();
        for(Flower o: obj) {
            colours.add(o.getColour());
        }
        return colours.toString();
    }
}
