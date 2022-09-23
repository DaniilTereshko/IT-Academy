package credit;

public class C4 {
    static final int amountOfTanks = 100_000;

    public static void main(String[] args) {
        int specialNumbers = 0;
        for(int tanksNumber = 1; tanksNumber < amountOfTanks; tanksNumber++)
        {
            int currentNumber = tanksNumber;
            while(currentNumber >= 1)
            {
                if(currentNumber%10 == 4){
                    ++specialNumbers;
                    break;
                }
                if(currentNumber%100 == 13)
                {
                    ++specialNumbers;
                    break;
                }
                currentNumber/=10;
            }
        }

        System.out.println(specialNumbers);
    }
}
