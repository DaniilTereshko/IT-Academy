package credit.C9;

public abstract class BathroomDevice extends Device{
    private String brand;
    private boolean isProfessional;

    public BathroomDevice(String name, String brand, boolean isProfessional) {
        super(name);
        this.brand = brand;
        this.isProfessional = isProfessional;
    }

    public BathroomDevice(String name, Float height, Float length, Float width, String brand, boolean isProfessional) {
        super(name, height, length, width);
        this.brand = brand;
        this.isProfessional = isProfessional;
    }

    public BathroomDevice(String name, Float height, Float length, Float width, Float weight, String brand, boolean isProfessional) {
        super(name, height, length, width, weight);
        this.brand = brand;
        this.isProfessional = isProfessional;
    }

    public BathroomDevice(String name, String colour, Float height, Float length, Float width, Float weight, Integer power, boolean turnOn, String brand, boolean isProfessional) {
        super(name, colour, height, length, width, weight, power, turnOn);
        this.brand = brand;
        this.isProfessional = isProfessional;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isProfessional() {
        return isProfessional;
    }

    public void setProfessional(boolean professional) {
        isProfessional = professional;
    }

    @Override
    public String toString() {
        return "BathroomDevice{" +
                "brand='" + brand + '\'' +
                ", isProfessional=" + isProfessional +
                '}' + super.toString();
    }
}
