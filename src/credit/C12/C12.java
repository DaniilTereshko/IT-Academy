package credit.C12;

import java.io.*;
import java.util.Random;

public class C12 {
    static final String FILENAME = "src\\credit\\C12\\C12.bin";
    static final int nOfNumbers = 30;
    public static void main(String[] args) {
        float sum = 0F;
        try(var fis = new FileOutputStream(FILENAME); var bis = new BufferedInputStream(new FileInputStream(FILENAME))) {
            for (int i = 0; i < nOfNumbers; i++) {
                int number = (int)(Math.random()*100)+1;
                fis.write(number);
            }
            int number;
            while((number = bis.read()) != -1){
                sum+=number;
                System.out.print(number+ " ");
            }
            System.out.println("\nСреднее арифметическое: "+ sum/nOfNumbers);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
