import java.util.*;

public class PlayGame {
    public  static void PlayGame()
    {  
        ClearScreen.clearScreen();
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------");
        System.out.println("|                                  |");
        System.out.println("|              EVENORDD            |");
        System.out.println("|             ----------           |");
        System.out.println("|                                  |");
        System.out.println(  "|  CURRENT BALANCE: " + EvenorDD.currentBalance + " |"); 
        System.out.println("|  BET AMOUNT:                     |");
        System.out.println("|                                  |");
        System.out.println("|  -------------------------       |");
        System.out.println("|                                  |");
        System.out.println("|                                  |");
        System.out.println("|                                  |");
        System.out.println("|                                  |");
        System.out.println("|                                  |");
        System.out.println("|                                  |");
        System.out.println("|                                  |");
        System.out.println("------------------------------------");

        while (true) {
            System.out.println("Enter the amount you want to bet or type 'exit' to exit");
        
            if (scanner.hasNextLong()) 
            {
                EvenorDD.inputAmountToBet = scanner.nextLong();
                if (EvenorDD.inputAmountToBet > 0 && EvenorDD.inputAmountToBet < EvenorDD.currentBalance) //Kiểm tra số tiền cược > 0 và nhỏ hơn số dư hiện tại
                {
                    EvenorDD.betAmount = EvenorDD.inputAmountToBet; 
                    EvenorDD.currentBalance = EvenorDD.currentBalance - EvenorDD.betAmount;   //Trừ tiền lần 1

                    ClearScreen.clearScreen();
                    System.out.println("Loading...");
                    try {
                        Thread.sleep(1000); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Betticket.Betticket();
                    break;
                } 
                else 
                {
                    System.out.println("The amount must be greater than zero or current balance is not enough. Please try again.");
                }
            } 
            else 
            {
                String input = scanner.next(); // Đọc bỏ đầu vào không hợp lệ để tiếp tục vòng lặp
                if (input.equals("exit")) {
                    System.out.println("Exiting to main screen...");
                    MainMenu.MainMenu();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            }
        }



        // while (true) {
        //     System.out.println("Press e to select odd and press o to select odd");
        //     EvenorDD.inputEorO=scanner.nextLine();
        //     if (EvenorDD.inputEorO.equals("E") || EvenorDD.inputEorO.equals("e") ) 
        //     {
        //         if(dices.finalresult % 2 == 0)
        //         {
        //             System.out.println("You Win!");
        //             EvenorDD.currentBalance += EvenorDD.betAmount;
        //             PlayGame.PlayGame();
        //             break;
        //         }
        //         else
        //         {
        //             System.out.println("You lose!");
        //             EvenorDD.currentBalance -= EvenorDD.betAmount;
        //             PlayGame.PlayGame();
        //             break;
        //         }
        //     }
        //     else if (EvenorDD.inputEorO.equals("o") || EvenorDD.inputEorO.equals("O")) 
        //     {
        //         if(dices.finalresult % 2 != 0)
        //         {
        //             System.out.println("You Win!");
        //             EvenorDD.currentBalance += EvenorDD.betAmount;
        //             PlayGame.PlayGame();
        //             break;
        //         }
        //         else
        //         {
        //             System.out.println("You lose!");
        //             EvenorDD.currentBalance -= EvenorDD.betAmount;
        //             PlayGame.PlayGame();
        //             break;
        //         }
        //     }
        //     else
        //     {
        //         System.out.println("Sorry, you entered incorrectly. Please try again!");
        //         EvenorDD.inputEorO=scanner.nextLine();
        //     }

        //}
        

        



        // if (EvenorDD.betAmount < EvenorDD.currentBalance)
        // {
        //     System.out.println("Current balance is not enough to play");
        //     PlayGame.PlayGame();

        // }
        // else if (EvenorDD.betAmount >= EvenorDD.currentBalance) 
        // {
        //     GameStart.Start();
        // }











    }
}
