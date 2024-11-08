

public class PrintBetInfo {
    public static void PrintBetInfo()
    {
        ClearScreen.clearScreen();
            

            System.out.println("------------------------------------");
            System.out.println("|                                  |");
            System.out.println("|            BET TICKETS           |");
            System.out.println("|          --------------          |");
            System.out.println("|                                  |");
            System.out.println(  "|  CURRENT BALANCE: " + EvenorDD.currentBalance + " |"); 
            System.out.println(  "|  BET AMOUNT: " + EvenorDD.betAmount +" |");
            System.out.println("|                                  |");
            System.out.println("|  -------------------------       |");
            System.out.println("|  How to play?                    |");
            System.out.println("|-> Just press 'e' to select even  |");
            System.out.println("|   and press 'o' to select odd    |");
            System.out.println("|                                  |");
            System.out.println("|                                  |");
            System.out.println("|                                  |");
            System.out.println("|                                  |");
            System.out.println("------------------------------------");

            
    }
}
