package exam;

import java.util.Scanner;

public class Grade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество футов, которые улитка преодолевает за день: ");
        int a = scanner.nextInt();
        System.out.print("Введите количество футов, на которые улитка сползает за день: ");
        int b = scanner.nextInt();
        System.out.print("Введите высоту дерева: ");
        int h = scanner.nextInt();
        if(a>=h)
        {
            System.out.println("Улитка пройдет путь за 1 день.");
        }
        else if(a <= b)
        {
            System.out.println("Невозможно.");
        }
        else
        {
            int days   = 0;
            int passed = 0;
            while(passed != h)
            {
                days++;
                passed+=a;
                if(passed>=h) break;
                else passed-=b;
            }
            System.out.println("Количество дней: "+days);
        }
    }
}
