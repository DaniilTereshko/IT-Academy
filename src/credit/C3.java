package credit;

public class C3 {
    public static void main(String[] args) {
        int sec = (int)(Math.random()*28801);
        System.out.println("Количество секунд: " + sec);
        print(sec);
    }
    public static void print(int sec){
        if(sec == 0)        System.out.println("Рабочий день закончился.");
        else
        {
            int hours = sec/3600; 
            switch (hours) {
                case 0       -> System.out.println("Осталось менее часа.");
                case 1       -> System.out.println("Остался 1 час.");
                case 2, 3, 4 -> System.out.println("Осталось " + hours + " часа.");
                default      -> System.out.println("Осталось " + hours + " часов.");
            }
        }
    }
}
