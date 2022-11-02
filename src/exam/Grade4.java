package exam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Grade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.toLowerCase().trim().split("\\W+");
        Set uniqueWords = new HashSet(Arrays.asList(split));
        System.out.println(uniqueWords.size());
    }
}
