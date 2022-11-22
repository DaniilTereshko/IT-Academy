package exam.Grade9;

import java.util.*;

public class Main {
    final static int N_POINTS = 10;
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Point> points = new ArrayList<>();
        for (int i = 0; i < N_POINTS; i++) {
            Integer x = random.nextInt(10)-5;
            Integer y = random.nextInt(10)-5;
            Integer z = random.nextInt(10)-5;
            points.add(new Point(x,y,z));
        }
        System.out.println(points);
        Optional<Point> max = points.stream().max(Comparator.comparingInt(Point::getX));
        max.ifPresent(System.out::println);
        points.stream()
                .mapToDouble(Main::distance)
                .forEach(p-> System.out.print(p + " "));
        System.out.println();
        points.stream().filter(p -> distance(p) > 5)
                .forEach(System.out::print);
        System.out.println();
        points.stream().sorted(Comparator.comparingDouble(Main::distance))
                .forEach(p-> System.out.print(p + " "));
    }
    public static double distance(Point p){
        return Math.sqrt(p.getX() * p.getX() + p.getY() * p.getY() + p.getZ() * p.getZ());
    }
}
