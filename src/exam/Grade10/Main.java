package exam.Grade10;

import java.util.concurrent.*;

public class Main {
    public final static int N_OF_FILES = 3;
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(N_OF_FILES);
        Future<Result> arr1 = service.submit(new MyCallable("src/exam/Grade10/array1.txt"));
        Future<Result> arr2 = service.submit(new MyCallable("src/exam/Grade10/array2.txt"));
        Future<Result> arr3 = service.submit(new MyCallable("src/exam/Grade10/array3.txt"));
        try {
            System.out.println("Файл 1: " + arr1.get());
            System.out.println("Файл 2: " + arr2.get());
            System.out.println("Файл 3: " + arr3.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        service.shutdown();
    }
}
