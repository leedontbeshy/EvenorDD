import java.util.Scanner;

public class CheckBalance {
    public static void CheckBalance()
    {
        ClearScreen.clearScreen();
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.println("|                             |");
        System.out.println("|           EVENORDD          |");
        System.out.println("|                             |");
        System.out.println("|            WALLET           |"); 
        System.out.println("|                             |");
        System.out.println("| YOUR CURRENT BALANCE:       |");
        System.out.println("| " +EvenorDD.currentBalance +"         |");
        System.out.println("|                             |");
        System.out.println("|  1. MORE MONEY              |");
        System.out.println("|  2. EXIT                    |");
        System.out.println("|                             |");
        System.out.println("|   PRESS 1 OR 2 TO SELECT    |");
        System.out.println("|                             |");
        System.out.println("|                             |");
        System.out.println("-------------------------------");

        while (true) {
            EvenorDD.inputCheckBalance = scanner.nextLine();

            if (EvenorDD.inputCheckBalance.equals("1")) {
                Recharge.Recharge();
                break;
            }
            else if (EvenorDD.inputCheckBalance.equals("2")) {
                MainMenu.MainMenu();
                break;
            }

            else{
                System.out.println("Sorry, you entered incorrectly. Please try again!");
            }
        }
    }
}
