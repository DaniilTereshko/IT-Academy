package credit;

import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите две стороны прямоугольного отверстия(a,b): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Введите радиус круглой картонки(r): ");
        int r = scanner.nextInt();

        double diagonal = Math.sqrt(a*a+b*b);
        if((a > 0) && (b > 0) && (r>0))
        {
            if (diagonal <= r * 2)
            {
                System.out.println("Картонка с радиусом " + r + " полностью закрывает отверстие размера " + a + '*' + b);
            }
            else System.out.println("Картонка с радиусом " + r + " НЕ закрывает отверстие размера " + a + '*' + b);
        }
        else System.out.println("Ошибка. Длины отрезков должны быть больше нуля. Поворите попытку...");
    }
}
