package credit;

public class C3 {
    public static void main(String[] args) {
        int sec = (int)(Math.random()*28801);
        System.out.println("Количество секунд: " + sec);
        Print(sec);
    }
    public static void Print(int sec){
        int hours = 0;
        if(sec == 0)        System.out.println("Рабочий день закончился.");
        else if(sec < 3600) System.out.println("Осталось менее часа.");
        else
        {
            hours = sec/3600;
            switch (hours)
            {
                case 1: System.out.println("Остался 1 час.");    break;
                case 2: System.out.println("Осталось 2 часа.");  break;
                case 3: System.out.println("Осталось 3 часа.");  break;
                case 4: System.out.println("Осталось 4 часа.");  break;
                case 5: System.out.println("Осталось 5 часов."); break;
                case 6: System.out.println("Осталось 6 часов."); break;
                case 7: System.out.println("Осталось 7 часов."); break;
                case 8: System.out.println("Осталось 8 часов."); break;
            }
        }
    }
}
