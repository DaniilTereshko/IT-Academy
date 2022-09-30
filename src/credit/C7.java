package credit;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int sizeOfArray = scanner.nextInt();
        if(sizeOfArray <= 0)
        {
            System.out.println("Ошибка. Некорректный ввод.");
            System. exit(0);
        }
        int[] array = new int[sizeOfArray];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = new Random().nextInt(60);
        }
        System.out.println(Arrays.toString(array));
        for (int i=0;i<array.length/2;i++)
        {
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
