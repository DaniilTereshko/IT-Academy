package credit.C11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C11 {
    public static final String FILENAME = "src\\credit\\C11\\C11.txt";
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        int marks = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(FILENAME))){
            String str;
            while((str = br.readLine()) != null){
                Pattern pattern = Pattern.compile("[.,!?\"():;']");
                Matcher matcher = pattern.matcher(str);
                while(matcher.find()) marks++;
                String[] split = str.split("[ ,.!?\"():;']+");
                words.addAll(Arrays.asList(split));
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println("Слов в тексте: " + words.size() +"\nЗнаков препинания в тексте: "+ marks);
    }
}
