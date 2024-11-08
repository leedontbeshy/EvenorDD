import java.util.Random;

public class dices {


    
    public static void Dices()
    {
        Random random1 = new Random();
        EvenorDD.result1 = random1.nextInt(1,7);
        EvenorDD.result2 = random1.nextInt(1,7);
        EvenorDD.result3 = random1.nextInt(1,7);

        EvenorDD.finalresult = EvenorDD.result1 + EvenorDD.result2 + EvenorDD.result3;







    }
}
