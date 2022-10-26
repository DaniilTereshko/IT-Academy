package credit.C9;

public abstract class LivingRoomDevice extends Device{
    private String brand;

    public LivingRoomDevice(String name, String brand) {
        super(name);
        this.brand = brand;
    }

    public LivingRoomDevice(String name, Float height, Float length, Float width, String brand) {
        super(name, height, length, width);
        this.brand = brand;
    }

    public LivingRoomDevice(String name, Float height, Float length, Float width, Float weight, String brand) {
        super(name, height, length, width, weight);
        this.brand = brand;
    }

    public LivingRoomDevice(String name, String colour, Float height, Float length, Float width, Float weight, Integer power, boolean turnOn, String brand) {
        super(name, colour, height, length, width, weight, power, turnOn);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "LivingRoomDevice{" +
                "brand='" + brand + '\'' +
                '}' + super.toString();
    }
}
