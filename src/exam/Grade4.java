package exam;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Grade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\W+");
        String[] words = pattern.split(input.trim());

        int countUnique = 0;
        boolean isUnq = true;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if(words[i].equalsIgnoreCase(words[j])&& (i != j)){
                    isUnq = false;
                    break;
                }
            }
            if(isUnq){
                countUnique++;
            }
            isUnq = true;
        }
        System.out.println("Number of unique words: " +countUnique);
    }

}
