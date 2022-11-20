package credit.C12;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class C12 {
    static final String FILENAME = "src/credit/C12/C12.bin";
    static final int N_OF_NUMBERS = 30;
    public static void main(String[] args) {
        float sum = 0F;
        try(var dos = new DataOutputStream(new FileOutputStream(FILENAME)); var dis = new DataInputStream(new FileInputStream(FILENAME))) {
            for (int i = 0; i < N_OF_NUMBERS; i++) {
                int number = (int)(Math.random()*1000)+1;
                dos.writeInt(number);
            }
            int number;
            //Scanner scanner = new Scanner(bis);
            while(dis.available() > 0){
                number = dis.readInt();
                sum+= number;
                System.out.print(number + " ");
            }
            System.out.println("\nСреднее арифметическое: "+ sum/N_OF_NUMBERS);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
