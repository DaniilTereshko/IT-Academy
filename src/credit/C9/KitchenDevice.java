package credit.C9;

public abstract class KitchenDevice extends Device{
    private String brand;
    private boolean isPortable;
    private boolean isEmbedded;

    public KitchenDevice(String name, String brand, boolean isPortable, boolean isEmbedded) {
        super(name);
        this.brand = brand;
        this.isPortable = isPortable;
        this.isEmbedded = isEmbedded;
    }

    public KitchenDevice(String name, Float height, Float length, Float width, String brand, boolean isPortable, boolean isEmbedded) {
        super(name, height, length, width);
        this.brand = brand;
        this.isPortable = isPortable;
        this.isEmbedded = isEmbedded;
    }

    public KitchenDevice(String name, Float height, Float length, Float width, Float weight, String brand, boolean isPortable, boolean isEmbedded) {
        super(name, height, length, width, weight);
        this.brand = brand;
        this.isPortable = isPortable;
        this.isEmbedded = isEmbedded;
    }

    public KitchenDevice(String name, String colour, Float height, Float length, Float width, Float weight, Integer power, boolean turnOn, String brand, boolean isPortable, boolean isEmbedded) {
        super(name, colour, height, length, width, weight, power, turnOn);
        this.brand = brand;
        this.isPortable = isPortable;
        this.isEmbedded = isEmbedded;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isPortable() {
        return isPortable;
    }

    public void setPortable(boolean portable) {
        isPortable = portable;
    }

    public boolean isEmbedded() {
        return isEmbedded;
    }

    public void setEmbedded(boolean embedded) {
        isEmbedded = embedded;
    }

    @Override
    public String toString() {
        return "KitchenDevice{" +
                "brand='" + brand + '\'' +
                ", isPortable=" + isPortable +
                ", isEmbedded=" + isEmbedded +
                '}' + super.toString();
    }
}
