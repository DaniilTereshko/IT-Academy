package credit.C9;

public class Television extends LivingRoomDevice{
    private boolean smartTV;
    private Integer updateFrequency;
    private String permission;

    public Television(String name, String brand, boolean smartTV, Integer updateFrequency, String permission) {
        super(name, brand);
        this.smartTV = smartTV;
        this.updateFrequency = updateFrequency;
        this.permission = permission;
    }

    public Television(String name, Float height, Float length, Float width, String brand, boolean smartTV, Integer updateFrequency, String permission) {
        super(name, height, length, width, brand);
        this.smartTV = smartTV;
        this.updateFrequency = updateFrequency;
        this.permission = permission;
    }

    public Television(String name, Float height, Float length, Float width, Float weight, String brand, boolean smartTV, Integer updateFrequency, String permission) {
        super(name, height, length, width, weight, brand);
        this.smartTV = smartTV;
        this.updateFrequency = updateFrequency;
        this.permission = permission;
    }

    public Television(String name, String colour, Float height, Float length, Float width, Float weight, Integer power, boolean turnOn, String brand, boolean smartTV, Integer updateFrequency, String permission) {
        super(name, colour, height, length, width, weight, power, turnOn, brand);
        this.smartTV = smartTV;
        this.updateFrequency = updateFrequency;
        this.permission = permission;
    }

    public boolean isSmartTV() {
        return smartTV;
    }

    public void setSmartTV(boolean smartTV) {
        this.smartTV = smartTV;
    }

    public Integer getUpdateFrequency() {
        return updateFrequency;
    }

    public void setUpdateFrequency(Integer updateFrequency) {
        this.updateFrequency = updateFrequency;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "Television{" +
                "smartTV=" + smartTV +
                ", updateFrequency=" + updateFrequency +
                ", permission='" + permission + '\'' +
                '}' + super.toString();
    }
}
