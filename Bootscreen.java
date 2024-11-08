import java.util.Scanner;

public class Bootscreen {
    
    public static void Bootscreen()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.println("|                             |");
        System.out.println("|           EVENORDD          |");
        System.out.println("|                             |");
        System.out.println("|   Press the key to select.  |"); 
        System.out.println("|                             |");
        System.out.println("|     -------------------     |");
        System.out.println("|     |    1.REGIST     |     |");
        System.out.println("|     |    2.lOG IN     |     |");
        System.out.println("|     |    3.EXIT       |     |");
        System.out.println("|     -------------------     |");
        System.out.println("|                             |");
        System.out.println("|                             |");
        System.out.println("|                             |");
        System.out.println("|                             |");
        System.out.println("-------------------------------");

        String inputbootscreen;

        while (true) {
            System.out.println("PRESS THE CORRESPONDING KEY TO SELECT");
            inputbootscreen = scanner.nextLine();

            if (inputbootscreen.equals("1")) {
                Regist.Regist();
                break;
            }
            else if (inputbootscreen.equals("2")) {
                Login.Login();
            }
            else if (inputbootscreen.equals("3")) {
                System.exit(0);
            }

            else 
            {
                System.out.println("Sorry, you entered incorrectly");
                //inputbootscreen = scanner.nextLine();
            }
        }


        
    }

}
