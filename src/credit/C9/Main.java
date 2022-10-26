package credit.C9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 6;
        Device[] flatDevices = new Device[n];
        flatDevices[0] = new Microwave("20MW700-1479BKB", "black", 26F, 44F, 36F, 10.8F, 700, true, "Horizont", false, false, true, true, 20);
        flatDevices[1] = new Blender("BR1240", "white", 15F, 10F, 8F, 5F, 800, false, "Brayer", true, false, true, 0.35F);
        flatDevices[2] = new HairDryer("HT-HD-008", "red", 5F, 10F, 8F, 0.9F, 2200, false, "Helt", true, 3, 2, true, false);
        flatDevices[3] = new Television("Mi TV P1 32", "gray", 47.9F, 73.4F, 8F, 3.9F, 55, true, "Xiaomi", true,60, "1366x768(HD)");
        flatDevices[4] = new WashingMachine("WRE65P2BAA", "black", 84F, 60F, 40F, 55F, 800, true, "Beko", false, 'A', 6, false, true);
        flatDevices[5] = new MusicalColumn("B215XL", "black", 44F, 33F, 69F, 17.6F, 1000, true, "Behringer", "55Hz - 20kHz", 8, 2);

        System.out.println("Текущая мощность всех приборов в квартире: " + Device.totalPower(flatDevices));
        int powerIfTurnOn = 0;
        for (Device flatDevice : flatDevices) {
            if (flatDevice.isTurnOn()) powerIfTurnOn += flatDevice.getPower();
        }
        System.out.println("Мощность включенных приборов: " + powerIfTurnOn);
        for(Device o: sortByPower(flatDevices)){
            System.out.println(o.toString());
        }
        String model, brand;
        System.out.print("Введите название модели: ");
        model = scanner.nextLine();
        System.out.print("Введите название бренда: ");
        brand = scanner.nextLine();

        for (Device flatDevice : flatDevices) {
            if (flatDevice instanceof BathroomDevice) {
                if (flatDevice.getName().equalsIgnoreCase(model) && ((BathroomDevice) flatDevice).getBrand().equalsIgnoreCase(brand)) {
                    System.out.println(flatDevice.toString());
                }
            }
        }


    }
    public static Device[] sortByPower(Device[] obj){
        for (int i = 0; i < obj.length; i++) {
            int min = i;
            for (int j = i+1; j < obj.length; j++) {
                if(obj[j].getPower() < obj[min].getPower()) min = j;
            }
            Device temp = obj[i];
            obj[i] = obj[min];
            obj[min] = temp;
        }
        return obj;
    }
}
