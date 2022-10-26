package exam.Grade5;

public class Main {
    public static void main(String[] args) {
        Flower[] bouquet1 = new Flower[5];
        Flower[] bouquet2 = new Flower[4];
        bouquet1[0] = new Aster(3F, 4F, "red", 3);
        bouquet1[1] = new Carnation(2F, 3F, "blue", 2);
        bouquet1[2] = new Chamomile(1F, 4F, "orange", 4);
        bouquet1[3] = new Gerbera(4F, 2.3F, "red", 2);
        bouquet1[4] = new Rose(5.5F, 4F, "white", 5, true);

        bouquet2[0] = new Tulips(4F, 3.4F, "pink", 4);
        bouquet2[1] = new Sunflower(0.5F, 6F, "yellow", 5);
        bouquet2[2] = new Poppy(0.5F, 4.4F, "red", 5);
        bouquet2[3] = new Iris(3.4F, 2F, "red", 6);

        System.out.println("Цена первого букета: " + Flower.bouquetPrice(bouquet1));
        System.out.println("Цена второго букета: " + Flower.bouquetPrice(bouquet2));
        System.out.println("Цвета в первом букете: " + Flower.colours(bouquet1));
        System.out.println("Цвета во втором букете: " + Flower.colours(bouquet2));
        System.out.println("Первый букет полностью завяент через " + Flower.lifeTime(bouquet1));
        System.out.println("Второй букет полностью завяент через " + Flower.lifeTime(bouquet2));

    }
}
