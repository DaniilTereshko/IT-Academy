package credit.C9;

public class HairDryer extends BathroomDevice{
    private Integer numberTempModes;
    private Integer numberSpeedModes;
    private boolean overheatProtection;
    private boolean ionizationFunction;

    public HairDryer(String name, String brand, boolean isProfessional, Integer numberTempModes, Integer numberSpeedModes, boolean overheatProtection, boolean ionizationFunction) {
        super(name, brand, isProfessional);
        this.numberTempModes = numberTempModes;
        this.numberSpeedModes = numberSpeedModes;
        this.overheatProtection = overheatProtection;
        this.ionizationFunction = ionizationFunction;
    }

    public HairDryer(String name, Float height, Float length, Float width, String brand, boolean isProfessional, Integer numberTempModes, Integer numberSpeedModes, boolean overheatProtection, boolean ionizationFunction) {
        super(name, height, length, width, brand, isProfessional);
        this.numberTempModes = numberTempModes;
        this.numberSpeedModes = numberSpeedModes;
        this.overheatProtection = overheatProtection;
        this.ionizationFunction = ionizationFunction;
    }

    public HairDryer(String name, Float height, Float length, Float width, Float weight, String brand, boolean isProfessional, Integer numberTempModes, Integer numberSpeedModes, boolean overheatProtection, boolean ionizationFunction) {
        super(name, height, length, width, weight, brand, isProfessional);
        this.numberTempModes = numberTempModes;
        this.numberSpeedModes = numberSpeedModes;
        this.overheatProtection = overheatProtection;
        this.ionizationFunction = ionizationFunction;
    }

    public HairDryer(String name, String colour, Float height, Float length, Float width, Float weight, Integer power, boolean turnOn, String brand, boolean isProfessional, Integer numberTempModes, Integer numberSpeedModes, boolean overheatProtection, boolean ionizationFunction) {
        super(name, colour, height, length, width, weight, power, turnOn, brand, isProfessional);
        this.numberTempModes = numberTempModes;
        this.numberSpeedModes = numberSpeedModes;
        this.overheatProtection = overheatProtection;
        this.ionizationFunction = ionizationFunction;
    }

    public Integer getNumberTempModes() {
        return numberTempModes;
    }

    public void setNumberTempModes(Integer numberTempModes) {
        this.numberTempModes = numberTempModes;
    }

    public Integer getNumberSpeedModes() {
        return numberSpeedModes;
    }

    public void setNumberSpeedModes(Integer numberSpeedModes) {
        this.numberSpeedModes = numberSpeedModes;
    }

    public boolean isOverheatProtection() {
        return overheatProtection;
    }

    public void setOverheatProtection(boolean overheatProtection) {
        this.overheatProtection = overheatProtection;
    }

    public boolean isIonizationFunction() {
        return ionizationFunction;
    }

    public void setIonizationFunction(boolean ionizationFunction) {
        this.ionizationFunction = ionizationFunction;
    }

    @Override
    public String toString() {
        return "HairDryer{" +
                "numberTempModes=" + numberTempModes +
                ", numberSpeedModes=" + numberSpeedModes +
                ", overheatProtection=" + overheatProtection +
                ", ionizationFunction=" + ionizationFunction +
                '}' + super.toString();
    }
}
