package exam.Grade8;

import java.io.*;
import java.util.*;

public class Grade8 {
    static final int NUMBERS = 1000;
    static final String IN1 = "src/exam/Grade8/in1.txt";
    static final String IN2 = "src/exam/Grade8/in2.txt";
    static final String OUT = "src/exam/Grade8/out.txt";

    public static void main(String[] args) {
        try(var bw1 = new BufferedWriter(new FileWriter(IN1));
            var bw2 = new BufferedWriter(new FileWriter(IN2))) {
            int number1, number2;
            for (int i = 0; i < NUMBERS; i++) {
                number1 = (int)(Math.random()*100000)+1;
                number2 = (int)(Math.random()*100000)+1;
                bw1.write(number1 + " ");
                bw2.write(number2 + " ");
            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        try(var scanner1 = new Scanner(new FileReader(IN1));
            var scanner2 = new Scanner(new FileReader(IN2));
            var bw = new BufferedWriter(new FileWriter(OUT))){
            ArrayList<Integer> numbers = new ArrayList<>();
            while(scanner1.hasNext() && scanner2.hasNext()){
                numbers.add(scanner1.nextInt());
                numbers.add(scanner2.nextInt());
            }
            bw.write(numbers.toString());
            System.out.println(numbers.size());
            System.out.println(numbers);
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
