package credit;

import java.util.Scanner;

public class C5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int number      = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < number/2; i++)
        {
            if(number%i == 0){
                isPrime = false;
                break;
            }

        }
        if(isPrime) System.out.println("Число "+ number + " является простым.");
        else        System.out.println("Число "+ number + " не является простым.");
    }
}
