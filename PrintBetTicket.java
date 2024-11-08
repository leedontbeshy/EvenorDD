public class PrintBetTicket {
    public static void PrintBetTicket()
    {
        ClearScreen.clearScreen();
                    System.out.println("-------------------------------");
                    System.out.println("|                             |");
                    System.out.println("|          BET TICKETS        |");
                    System.out.println("|        --------------       |");
                    System.out.println("|                             |");
                    System.out.println(  "|  CURRENT BALANCE: " + EvenorDD.currentBalance + "                |"); 
                    System.out.println(  "|  BET AMOUNT: " + EvenorDD.inputAmountToBet +"                  |");
                    System.out.println("|                             |");
                    System.out.println("|  -------------------------  |");
                    System.out.println("|                             |");
                    System.out.println("| The first dice results: " + EvenorDD.result1 +"      |");
                    System.out.println("| The second dice results: " + EvenorDD.result2 +"         |");
                    System.out.println("| The third dice results: "  + EvenorDD.result3 +"          |");
                    System.out.println("|                             |");
                    System.out.println("| And The Final Result is: " + EvenorDD.finalresult +"          |");
                    System.out.println("|                             |");
                    System.out.println("-------------------------------");
    }
}
