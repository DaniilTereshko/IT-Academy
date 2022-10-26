package credit.C9;

public class WashingMachine extends BathroomDevice{
    private Character washClass;
    private Integer maximumLoad;
    private boolean drying;
    private boolean automatic;

    public WashingMachine(String name, String brand, boolean isProfessional, Character washClass, Integer maximumLoad, boolean drying, boolean automatic) {
        super(name, brand, isProfessional);
        this.washClass = washClass;
        this.maximumLoad = maximumLoad;
        this.drying = drying;
        this.automatic = automatic;
    }

    public WashingMachine(String name, Float height, Float length, Float width, String brand, boolean isProfessional, Character washClass, Integer maximumLoad, boolean drying, boolean automatic) {
        super(name, height, length, width, brand, isProfessional);
        this.washClass = washClass;
        this.maximumLoad = maximumLoad;
        this.drying = drying;
        this.automatic = automatic;
    }

    public WashingMachine(String name, Float height, Float length, Float width, Float weight, String brand, boolean isProfessional, Character washClass, Integer maximumLoad, boolean drying, boolean automatic) {
        super(name, height, length, width, weight, brand, isProfessional);
        this.washClass = washClass;
        this.maximumLoad = maximumLoad;
        this.drying = drying;
        this.automatic = automatic;
    }

    public WashingMachine(String name, String colour, Float height, Float length, Float width, Float weight, Integer power, boolean turnOn, String brand, boolean isProfessional, Character washClass, Integer maximumLoad, boolean drying, boolean automatic) {
        super(name, colour, height, length, width, weight, power, turnOn, brand, isProfessional);
        this.washClass = washClass;
        this.maximumLoad = maximumLoad;
        this.drying = drying;
        this.automatic = automatic;
    }

    public Character getWashClass() {
        return washClass;
    }

    public void setWashClass(Character washClass) {
        this.washClass = washClass;
    }

    public Integer getMaximumLoad() {
        return maximumLoad;
    }

    public void setMaximumLoad(Integer maximumLoad) {
        this.maximumLoad = maximumLoad;
    }

    public boolean isDrying() {
        return drying;
    }

    public void setDrying(boolean drying) {
        this.drying = drying;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "washClass=" + washClass +
                ", maximumLoad=" + maximumLoad +
                ", drying=" + drying +
                ", automatic=" + automatic +
                '}' + super.toString();
    }
}
