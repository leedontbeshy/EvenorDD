import java.util.Scanner;

public class Recharge {
    public static void Recharge()
    {
        Scanner scanner = new Scanner(System.in);
        ClearScreen.clearScreen();

        System.out.println("-------------------------------");
        System.out.println("|                             |");
        System.out.println("|           EVENORDD          |");
        System.out.println("|                             |");
        System.out.println("|           RECHARGE          |"); 
        System.out.println("|  Select amount you want to  |");
        System.out.println("|  deposit by pressing keys   |");
        System.out.println("|            1 -> 5           |");
        System.out.println("|                             |");
        System.out.println("|  1. 50.000                  |");
        System.out.println("|  2. 100.000                 |");
        System.out.println("|  3. 200.000                 |");
        System.out.println("|  4. 500.000                 |");
        System.out.println("|  5. Other                   |");
        System.out.println("|  6. Return Main Menu        |");
        System.out.println("-------------------------------");

        while (true) {
            EvenorDD.inputReCharge = scanner.nextLine();

            if (EvenorDD.inputReCharge.equals("1")) {
                System.out.println("Recharging...");
                try 
                {
                    Thread.sleep(2000); // Chờ 2 giây 
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                } 
                System.out.println("Succesfully Recharge");
                EvenorDD.currentBalance += 50000;
                System.out.println("Your current balance: " + EvenorDD.currentBalance);
                System.out.println("Loading...");
                try 
                {
                    Thread.sleep(2000); // Chờ 2 giây 
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                } 
                CheckBalance.CheckBalance();
                //MainMenu.MainMenu();
                break;
            }
            if (EvenorDD.inputReCharge.equals("2")) {
                System.out.println("Recharging...");
                try 
                {
                    Thread.sleep(2000); // Chờ 2 giây 
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                } 
                System.out.println("Succesfully Recharge");
                EvenorDD.currentBalance += 100000;
                System.out.println("Your current balance: " + EvenorDD.currentBalance);
                System.out.println("Loading...");
                try 
                {
                    Thread.sleep(2000); // Chờ 2 giây 
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                } 
                CheckBalance.CheckBalance();
                //MainMenu.MainMenu();
                break;
            }

            if (EvenorDD.inputReCharge.equals("3")) {
                System.out.println("Recharging...");
                try 
                {
                    Thread.sleep(2000); // Chờ 2 giây 
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                } 
                System.out.println("Succesfully Recharge");
                EvenorDD.currentBalance += 200000;
                System.out.println("Your current balance: " + EvenorDD.currentBalance);
                System.out.println("Loading...");
                try 
                {
                    Thread.sleep(2000); // Chờ 2 giây 
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                } 
                CheckBalance.CheckBalance();
                //MainMenu.MainMenu();
                break;
            }

            if (EvenorDD.inputReCharge.equals("4")) {
                System.out.println("Recharging...");
                try 
                {
                    Thread.sleep(2000); // Chờ 2 giây 
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                } 
                System.out.println("Succesfully Recharge");
                EvenorDD.currentBalance += 500000;
                System.out.println("Your current balance: " + EvenorDD.currentBalance);
                System.out.println("Loading...");
                try 
                {
                    Thread.sleep(2000); // Chờ 2 giây 
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                } 
                CheckBalance.CheckBalance();
                //MainMenu.MainMenu();
                break;
            }

            if (EvenorDD.inputReCharge.equals("5")) {
                System.out.println("Enter the amount you want to deposit");
                EvenorDD.inputReChargeOption = scanner.nextLong();
                System.out.println("Deposit amount is: " + EvenorDD.inputReChargeOption );
                System.out.println("Recharging...");
                try 
                {
                    Thread.sleep(2000); // Chờ 2 giây 
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                } 
                System.out.println("Succesfully Recharge");
                EvenorDD.currentBalance += EvenorDD.inputReChargeOption;
                System.out.println("Your current balance: " + EvenorDD.currentBalance);
                System.out.println("Loading...");
                try 
                {
                    Thread.sleep(2000); // Chờ 2 giây 
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                } 
                CheckBalance.CheckBalance();
                //MainMenu.MainMenu();
                break;
            }

            
            else if (EvenorDD.inputReCharge.equals("6")) {
                MainMenu.MainMenu();
                break;
            }
            else
            {
                System.out.println("Sorry, you entered incorrectly. Please try again!");
            }

        }
    }
}
