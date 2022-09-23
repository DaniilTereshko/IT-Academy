package credit;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C6 {
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
        int max = array[0];
        int min = max;
        int indexMin = 0, indexMax = 0;
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max) {
                max = array[i];
                indexMax = i;
            }
            if(array[i]<min) {
                min = array[i];
                indexMin = i;
            }
        }
        System.out.println("Индекс максимального элемента: "+ indexMax);
        System.out.println("Индекс минимального элемента: " + indexMin);
    }
}
