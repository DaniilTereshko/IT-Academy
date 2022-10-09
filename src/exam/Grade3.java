package exam;

import java.util.Random;
import java.util.Scanner;

public class Grade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if((j == i) || (j + i + 1 == array.length)) array[i][j] = 0;
                else if(((i < j) && (j < array.length-i-1)) || ((i > j) && (j > array.length-i-1))) array[i][j] = new Random().nextInt(16)+1;
                else array[i][j] = new Random().nextInt(10)-20;
            }
        }
        int sum = 0;
        for (int[] value : array) {
            for (int i : value) {
                sum += i;
                System.out.print(i + "\t\t");
            }
            System.out.println();
        }
        int count = 0;
        int sum2 = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt > sum) {
                    sum2 += anInt;
                    count++;
                }
            }
        }
        float res = (float)sum2/count;
        System.out.println("Суммa всех элементов: "+sum);
        System.out.printf("Cреднее арифметическое всех элементов больше " + sum +": "+res);
    }


}
