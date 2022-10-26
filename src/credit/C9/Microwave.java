package credit.C9;

public class Microwave extends KitchenDevice{
    private boolean mirrorDoor;
    private boolean bottomGrill;
    private Integer volume;

    public Microwave(String name, String brand, boolean isPortable, boolean isEmbedded, boolean mirrorDoor, boolean bottomGrill, Integer volume) {
        super(name, brand, isPortable, isEmbedded);
        this.mirrorDoor = mirrorDoor;
        this.bottomGrill = bottomGrill;
        this.volume = volume;
    }

    public Microwave(String name, Float height, Float length, Float width, String brand, boolean isPortable, boolean isEmbedded, boolean mirrorDoor, boolean bottomGrill, Integer volume) {
        super(name, height, length, width, brand, isPortable, isEmbedded);
        this.mirrorDoor = mirrorDoor;
        this.bottomGrill = bottomGrill;
        this.volume = volume;
    }

    public Microwave(String name, Float height, Float length, Float width, Float weight, String brand, boolean isPortable, boolean isEmbedded, boolean mirrorDoor, boolean bottomGrill, Integer volume) {
        super(name, height, length, width, weight, brand, isPortable, isEmbedded);
        this.mirrorDoor = mirrorDoor;
        this.bottomGrill = bottomGrill;
        this.volume = volume;
    }

    public Microwave(String name, String colour, Float height, Float length, Float width, Float weight, Integer power, boolean turnOn, String brand, boolean isPortable, boolean isEmbedded, boolean mirrorDoor, boolean bottomGrill, Integer volume) {
        super(name, colour, height, length, width, weight, power, turnOn, brand, isPortable, isEmbedded);
        this.mirrorDoor = mirrorDoor;
        this.bottomGrill = bottomGrill;
        this.volume = volume;
    }

    public boolean isMirrorDoor() {
        return mirrorDoor;
    }

    public void setMirrorDoor(boolean mirrorDoor) {
        this.mirrorDoor = mirrorDoor;
    }

    public boolean isBottomGrill() {
        return bottomGrill;
    }

    public void setBottomGrill(boolean bottomGrill) {
        this.bottomGrill = bottomGrill;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Microwave{" +
                "mirrorDoor=" + mirrorDoor +
                ", bottomGrill=" + bottomGrill +
                ", volume=" + volume +
                '}' + super.toString();
    }
}
