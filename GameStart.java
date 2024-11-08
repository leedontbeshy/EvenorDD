import java.util.Scanner;

public class GameStart {
    public static void Start()
    {
        ClearScreen.clearScreen();
        Scanner scanner = new Scanner(System.in);
        dices.Dices();

        while (true) 
        {   
            PrintBetInfo.PrintBetInfo();//

            System.out.println("Press e to select even or o to select odd!!!");
            EvenorDD.inputEorO=scanner.nextLine();
            
            if (EvenorDD.inputEorO.equals("E") || EvenorDD.inputEorO.equals("e") ) 
            {   
                
                if(EvenorDD.finalresult % 2 == 0)
                {  

                    PrintBetTicket.PrintBetTicket();
                    System.out.println("You Win!");
                    EvenorDD.currentBalance = EvenorDD.currentBalance + 2*(EvenorDD.betAmount);
                    break;
                }
                
                else
                {
                    PrintBetTicket.PrintBetTicket();//
                    System.out.println("You lose!");
                    break;
                    
                    
                }
            }
                
            
            else if (EvenorDD.inputEorO.equals("o") || EvenorDD.inputEorO.equals("O")) 
            {   
                
                
                if(EvenorDD.finalresult % 2 != 0)
                {
                    PrintBetTicket.PrintBetTicket();

                    System.out.println("You Win!");
                    EvenorDD.currentBalance = EvenorDD.currentBalance + 2*(EvenorDD.betAmount);
                    break; // Kết thúc vòng lặp
                }
                else
                {
                    PrintBetTicket.PrintBetTicket();
                    System.out.println("You lose!");
                    break; // Kết thúc vòng lặp
                    
                }
            }

            else
            {
                System.out.println("Sorry, you entered incorrectly. Please try again!");
            }

            

        }

        System.out.println("Press R to continue");
            EvenorDD.inputinGameStart = scanner.nextLine();

            if (EvenorDD.inputinGameStart.equals("R") || EvenorDD.inputinGameStart.equals("r") ) 
            {
                PlayGame.PlayGame();
            }
            else
            {
                System.exit(0);
            }
        
    }
}
