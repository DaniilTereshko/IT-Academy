package credit;
import java.util.Scanner;

public class C2 {
    public static void main(String[] args){
        boolean lastDay = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату(XX XX XXXX): ");
        byte day   = scanner.nextByte();
        if((day > 31) || (day <= 0))
        {
            System.out.println("Ошибка. Некорректный ввод.");
            System. exit(0);
        }
        byte month = scanner.nextByte();
        if((month > 12) || (month <= 0))
        {
            System.out.println("Ошибка. Некорректный ввод.");
            System. exit(0);
        }
        int year   = scanner.nextInt();
        if(year <= 0)
        {
            System.out.println("Ошибка. Некорректный ввод.");
            System. exit(0);
        }
        if(month == 2)
        {
            if ((year % 4) != 0 && day == 28) {
                lastDay = true;
            }
            if ((year % 4) == 0 && day == 29) {
                lastDay = true;
            }
        }
        else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day == 30))
        {
            month++;
            day = 1;
        }
        else if(day == 31)
        {
            lastDay = true;
        }
        if (lastDay)
        {
            day = 1;
            if (month == 12)
            {
                month = 1;
                year++;
            }
            else month++;
        }
        else day++;
        System.out.println(day+"/"+month+"/"+year);

    }
}
