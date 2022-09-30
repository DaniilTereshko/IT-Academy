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
        long minutes = seconds % 3600 / 60;
        long hours   = seconds % 86400 / 3600;
        long days    = seconds % 604800 / 86400;
        long week    = seconds % (604800*365) / 604800;
        long year    = seconds / (604800*365);
        System.out.println(getYears(year) + getWeeks(week) + getDays(days) + getHours(hours) + getMin(minutes) + getSec(sec));
    }
    public static String getSec(long sec){
        String s = "";
        if      (sec == 0)                                                               return s;
        else if (sec%10 == 1)                                                            s = sec + " секунда ";
        else if ((sec >=5) && (sec <= 9))                                                s = sec + " секунд ";
        else if ((sec >=10 && sec<=20) || sec>20 && (sec%10==0 || sec%10 >=5))           s = sec + " секунд ";
        else if (sec%10 >=2)                                                             s = sec + " секунды ";
        return s;
    }
    public static String getMin(long min){
        String m = "";
        if      (min == 0)                                                               return m;
        else if (min%10 == 1)                                                            m = min + " минута ";
        else if ((min >=5) && (min <= 9))                                                m = min + " минут ";
        else if ((min >=10 && min<=20) || min>20 && (min%10==0 || min%10 >=5))           m = min + " минут ";
        else if (min%10 >=2)                                                             m = min + " минуты ";
        return m;
    }
    public static String getHours(long hours){
        String h = "";
        if      (hours == 0)                                                             return h;
        else if (hours%10 == 1)                                                          h = hours + " час ";
        else if ((hours >=5) && (hours <= 9))                                            h = hours + " часов ";
        else if ((hours >=10 && hours<=20) || hours>20 && (hours%10==0 || hours%10 >=5)) h = hours + " часов ";
        else if (hours%10 >=2)                                                           h = hours + " часа ";
        return h;
    }
    public static String getDays(long days){
        String d = "";
        if      (days == 0)                                                              return d;
        else if (days%10 == 1)                                                           d = days + " день ";
        else if ((days >=5) && (days <= 9))                                              d = days + " дней ";
        else if ((days >=10 && days<=20) || days>20 && (days%10==0 || days%10 >=5))      d = days + " дней ";
        else if (days%10 >=2)                                                            d = days + " дня ";
        return d;
    }
    public static String getWeeks(long weeks){
        String w = "";
        if      (weeks == 0)                                                             return w;
        else if (weeks%10 == 1)                                                          w = weeks + " неделя ";
        else if ((weeks >=5) && (weeks <= 9))                                            w = weeks + " недель ";
        else if ((weeks >=10 && weeks<=20) || weeks>20 && (weeks%10==0 || weeks%10 >=5)) w = weeks + " недель ";
        else if (weeks%10 >=2)                                                           w = weeks + " недели ";
        return w;
    }
    public static String getYears(long years){
        String y = "";
        if      (years == 0)                                                             return y;
        else if (years%10 == 1)                                                          y = years + " год ";
        else if ((years >=5) && (years <= 9))                                            y = years + " лет ";
        else if ((years >=10 && years<=20) || years>20 && (years%10==0 || years%10 >=5)) y = years + " лет ";
        else if (years%10 >=2)                                                           y = years + " года ";
        return y;
    }
}