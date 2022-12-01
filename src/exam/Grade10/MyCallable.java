package exam.Grade10;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Result> {
    private final String filename;
    public MyCallable(String filename) {
        this.filename = filename;
    }
    @Override
    public Result call() throws Exception {
        Result res = new Result();
        try(Scanner scanner = new Scanner(new FileInputStream(filename))) {
            int number = 0;
            while(scanner.hasNextLine()){
                if(number == 0){
                    number = Integer.parseInt(scanner.nextLine());
                } else{
                    res.plusSum(Integer.parseInt(scanner.nextLine()));
                }
            }
            res.setAvg(number);
        } catch (IOException e){
            e.printStackTrace();
        }
        return res;
    }
}
