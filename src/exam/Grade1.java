package exam;

import java.util.Scanner;

public class Grade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество секунд: ");
        long seconds = scanner.nextLong();
        if(seconds < 0)
        {
            System.out.println("Ошибка. Некорректный ввод.");
            System. exit(0);
        }
        long sec     = seconds % 60;
        int minutes  = (int) seconds % 3600 / 60;
        int hours    = (int) seconds % 86400 / 3600;
        int days     = (int) seconds % 604800 / 86400;
        int week     = (int) seconds % (604800*365) / 604800;
        int year     = (int) seconds / (604800*365);

        System.out.println(GetYears(year) + GetWeeks(week) + GetDays(days) + GetHours(hours) + GetMin(minutes) + GetSec(sec));
    }
    public static String GetSec(long sec){
        String s = "";
        if      (sec == 0)                                                               return s;
        else if (sec%10 == 1)                                                            s = sec + " секунда ";
        else if ((sec >=5) && (sec <= 9))                                                s = sec + " секунд ";
        else if ((sec >=10 && sec<=20) || sec>20 && (sec%10==0 || sec%10 >=5))           s = sec + " секунд ";
        else if ((sec%10 >=2) && (sec%10 <= 4))                                          s = sec + " секунды ";
        return s;
    }
    public static String GetMin(int min){
        String m = "";
        if      (min == 0)                                                               return m;
        else if (min%10 == 1)                                                            m = min + " минута ";
        else if ((min >=5) && (min <= 9))                                                m = min + " минут ";
        else if ((min >=10 && min<=20) || min>20 && (min%10==0 || min%10 >=5))           m = min + " минут ";
        else if ((min%10 >=2) && (min%10 <= 4))                                          m = min + " минуты ";
        return m;
    }
    public static String GetHours(int hours){
        String h = "";
        if      (hours == 0)                                                             return h;
        else if (hours%10 == 1)                                                          h = hours + " час ";
        else if ((hours >=5) && (hours <= 9))                                            h = hours + " часов ";
        else if ((hours >=10 && hours<=20) || hours>20 && (hours%10==0 || hours%10 >=5)) h = hours + " часов ";
        else if ((hours%10 >=2) && (hours%10 <= 4))                                      h = hours + " часа ";
        return h;
    }
    public static String GetDays(int days){
        String d = "";
        if      (days == 0)                                                              return d;
        else if (days%10 == 1)                                                           d = days + " день ";
        else if ((days >=5) && (days <= 9))                                              d = days + " дней ";
        else if ((days >=10 && days<=20) || days>20 && (days%10==0 || days%10 >=5))      d = days + " дней ";
        else if ((days%10 >=2) && (days%10 <= 4))                                        d = days + " дня ";
        return d;
    }
    public static String GetWeeks(int weeks){
        String w = "";
        if      (weeks == 0)                                                             return w;
        else if (weeks%10 == 1)                                                          w = weeks + " неделя ";
        else if ((weeks >=5) && (weeks <= 9))                                            w = weeks + " недель ";
        else if ((weeks >=10 && weeks<=20) || weeks>20 && (weeks%10==0 || weeks%10 >=5)) w = weeks + " недель ";
        else if ((weeks%10 >=2) && (weeks%10 <= 4))                                      w = weeks + " недели ";
        return w;
    }
    public static String GetYears(int years){
        String y = "";
        if      (years == 0)                                                             return y;
        else if (years%10 == 1)                                                          y = years + " год ";
        else if ((years >=5) && (years <= 9))                                            y = years + " лет ";
        else if ((years >=10 && years<=20) || years>20 && (years%10==0 || years%10 >=5)) y = years + " лет ";
        else if ((years%10 >=2) && (years%10 <= 4))                                      y = years + " года ";
        return y;
    }
}
