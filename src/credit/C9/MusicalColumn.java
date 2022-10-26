package credit.C9;

public class MusicalColumn extends LivingRoomDevice{
    private String frequencyRange;
    private Integer resistance;
    private Integer numberLanes;

    public MusicalColumn(String name, String brand, String frequencyRange, Integer resistance, Integer numberLanes) {
        super(name, brand);
        this.frequencyRange = frequencyRange;
        this.resistance = resistance;
        this.numberLanes = numberLanes;
    }

    public MusicalColumn(String name, Float height, Float length, Float width, String brand, String frequencyRange, Integer resistance, Integer numberLanes) {
        super(name, height, length, width, brand);
        this.frequencyRange = frequencyRange;
        this.resistance = resistance;
        this.numberLanes = numberLanes;
    }

    public MusicalColumn(String name, Float height, Float length, Float width, Float weight, String brand, String frequencyRange, Integer resistance, Integer numberLanes) {
        super(name, height, length, width, weight, brand);
        this.frequencyRange = frequencyRange;
        this.resistance = resistance;
        this.numberLanes = numberLanes;
    }

    public MusicalColumn(String name, String colour, Float height, Float length, Float width, Float weight, Integer power, boolean turnOn, String brand, String frequencyRange, Integer resistance, Integer numberLanes) {
        super(name, colour, height, length, width, weight, power, turnOn, brand);
        this.frequencyRange = frequencyRange;
        this.resistance = resistance;
        this.numberLanes = numberLanes;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public Integer getResistance() {
        return resistance;
    }

    public void setResistance(Integer resistance) {
        this.resistance = resistance;
    }

    public Integer getNumberLanes() {
        return numberLanes;
    }

    public void setNumberLanes(Integer numberLanes) {
        this.numberLanes = numberLanes;
    }

    @Override
    public String toString() {
        return "MusicalColumn{" +
                "frequencyRange='" + frequencyRange + '\'' +
                ", resistance=" + resistance +
                ", numberLanes=" + numberLanes +
                '}' + super.toString();
    }
}
