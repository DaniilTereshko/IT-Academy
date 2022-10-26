package credit.C9;

public abstract class Device {
    private String brand;

    private boolean isPortable;
    private String name;
    private String colour;
    private Float height;
    private Float length;
    private Float width;
    private Float weight;
    private Integer power;
    private boolean turnOn;

    public Device() {
    }
    public Device(String name) {
        this.name = name;
    }
    public Device(String name, Float height, Float length, Float width) {
        this(name);
        this.height = height;
        this.length = length;
        this.width = width;
    }
    public Device(String name, Float height, Float length, Float width, Float weight) {
        this(name, height, length, width);
        this.weight = weight;
    }
    public Device(String name, String colour, Float height, Float length, Float width, Float weight, Integer power, boolean turnOn) {
        this(name, height, length, width, weight);
        this.colour = colour;
        this.power = power;
        this.turnOn = turnOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", height=" + height +
                ", length=" + length +
                ", width=" + width +
                ", weight=" + weight +
                ", power=" + power +
                ", turnOn=" + turnOn +
                '}';
    }
    public static int totalPower(Device[] o){
        int power = 0;
        for(Device i: o){
            power+=i.getPower();
        }
        return power;
    }
}
