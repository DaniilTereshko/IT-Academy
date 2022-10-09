package credit;

import java.util.Scanner;

public class C8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] s = str.split(" ");
        String max = s[0], min = s[s.length-1];
        int maxI = 0, minI = 0;
        for (int i = 0; i < s.length; i++) {
            if(max.length() < s[i].length()){
                max = s[i];
                maxI = i;
            }
            if(min.length() >= s[i].length()){
                min = s[i];
                minI = i;
            }
        }
        String temp = s[maxI];
        s[maxI] = s[minI];
        s[minI] = temp;
        str = String.join(" ", s);
        System.out.println(str);
    }
}
