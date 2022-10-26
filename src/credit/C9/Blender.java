package credit.C9;

public class Blender extends KitchenDevice{
    private boolean mechanicalControl;
    private Float volume;

    public Blender(String name, String brand, boolean isPortable, boolean isEmbedded, boolean mechanicalControl, Float volume) {
        super(name, brand, isPortable, isEmbedded);
        this.mechanicalControl = mechanicalControl;
        this.volume = volume;
    }

    public Blender(String name, Float height, Float length, Float width, String brand, boolean isPortable, boolean isEmbedded, boolean mechanicalControl, Float volume) {
        super(name, height, length, width, brand, isPortable, isEmbedded);
        this.mechanicalControl = mechanicalControl;
        this.volume = volume;
    }

    public Blender(String name, Float height, Float length, Float width, Float weight, String brand, boolean isPortable, boolean isEmbedded, boolean mechanicalControl, Float volume) {
        super(name, height, length, width, weight, brand, isPortable, isEmbedded);
        this.mechanicalControl = mechanicalControl;
        this.volume = volume;
    }

    public Blender(String name, String colour, Float height, Float length, Float width, Float weight, Integer power, boolean turnOn, String brand, boolean isPortable, boolean isEmbedded, boolean mechanicalControl, Float volume) {
        super(name, colour, height, length, width, weight, power, turnOn, brand, isPortable, isEmbedded);
        this.mechanicalControl = mechanicalControl;
        this.volume = volume;
    }

    public boolean isMechanicalControl() {
        return mechanicalControl;
    }

    public void setMechanicalControl(boolean mechanicalControl) {
        this.mechanicalControl = mechanicalControl;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Blender{" +
                "mechanicalControl=" + mechanicalControl +
                ", volume=" + volume +
                '}' + super.toString();
    }
}
