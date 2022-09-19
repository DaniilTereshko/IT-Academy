package credit;
//Немного усложнил задание по ходу его выполнения, решил реализовать программу с использованием перечисления
import java.util.Scanner;

public class C2 {
    public enum Months {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC};

    public static void main(String[] args){
        Months  monthOfTheYear;
        boolean lastDay = false;
        Scanner scanner      = new Scanner(System.in);
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
        monthOfTheYear = GetMonth(month);
        int year  = scanner.nextInt();
        if(year <= 0)
        {
            System.out.println("Ошибка. Некорректный ввод.");
            System. exit(0);
        }
        if(monthOfTheYear == Months.FEB)
        {
            if ((year % 4) != 0 && day == 28) {
                lastDay = true;
            }
            if ((year % 4) == 0 && day == 29) {
                lastDay = true;
            }
        }
        else if ((monthOfTheYear == Months.APR || monthOfTheYear == Months.JUN || monthOfTheYear == Months.SEP || monthOfTheYear == Months.NOV) && (day == 30))
        {
            monthOfTheYear = GetMonth(++month);
            day = 1;
        }
        else if(day == 31)
        {
            lastDay = true;
        }
        if (lastDay)
        {
            day = 1;
            if (monthOfTheYear == Months.DEC)
            {
                monthOfTheYear = Months.JAN;
                year++;
            }
            else monthOfTheYear = GetMonth(++month);
        }
        else day++;
        System.out.println("The "+day+Ending(day)+" of "+GetMonthName(monthOfTheYear)+year);

    }
    public static Months GetMonth(int n){
        Months  monthOfTheYear = Months.FEB;
        switch(n)
        {
            case 1:  monthOfTheYear = Months.JAN; break;
            case 2:  monthOfTheYear = Months.FEB; break;
            case 3:  monthOfTheYear = Months.MAR; break;
            case 4:  monthOfTheYear = Months.APR; break;
            case 5:  monthOfTheYear = Months.MAY; break;
            case 6:  monthOfTheYear = Months.JUN; break;
            case 7:  monthOfTheYear = Months.JUL; break;
            case 8:  monthOfTheYear = Months.AUG; break;
            case 9:  monthOfTheYear = Months.SEP; break;
            case 10: monthOfTheYear = Months.OCT; break;
            case 11: monthOfTheYear = Months.NOV; break;
            case 12: monthOfTheYear = Months.DEC; break;
        }
        return monthOfTheYear;
    }
    public static String GetMonthName(Months monthOfTheYear){
        String nameOfMonth = "";
        switch(monthOfTheYear)
        {
            case JAN: nameOfMonth = "January ";   break;
            case FEB: nameOfMonth = "February ";  break;
            case MAR: nameOfMonth = "March ";     break;
            case APR: nameOfMonth = "April ";     break;
            case MAY: nameOfMonth = "May ";       break;
            case JUN: nameOfMonth = "June ";      break;
            case JUL: nameOfMonth = "July ";      break;
            case AUG: nameOfMonth = "August ";    break;
            case SEP: nameOfMonth = "September "; break;
            case OCT: nameOfMonth = "October ";   break;
            case NOV: nameOfMonth = "November ";  break;
            case DEC: nameOfMonth = "December ";  break;
        }
        return nameOfMonth;
    }
    public static String Ending(int day)
    {
        String ending = "";
        if     (day == 1) ending = "st";
        else if(day == 2) ending = "nd";
        else if(day == 4) ending = "rd";
        else              ending = "th";
        return ending;
    }
}
