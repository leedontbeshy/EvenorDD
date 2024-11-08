import java.util.Scanner;

public class Betticket {
    public static void Betticket()
    {   
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------");
        System.out.println("|                                  |");
        System.out.println("|            BET TICKETS           |");
        System.out.println("|          --------------          |");
        System.out.println("|                                  |");
        System.out.println(  "|  CURRENT BALANCE: " + EvenorDD.currentBalance + " |"); 
        System.out.println(  "|  BET AMOUNT: " + EvenorDD.betAmount +" |");
        System.out.println("|                                  |");
        System.out.println("|    -------------------------     |");
        System.out.println("|           How to play?           |");
        System.out.println("|->     First, carefully check     |");
        System.out.println("|          the bet amount          |");
        System.out.println("|       Then press S to confirm    |");
        System.out.println("|         Or press R to return     |");
        System.out.println("|                                  |");
        System.out.println("|                                  |");
        System.out.println("------------------------------------");

        while (true) 
        {
            System.out.println("Press S to Start Game!!!");
            EvenorDD.inputEorO=scanner.nextLine();
            
            if (EvenorDD.inputEorO.equals("S") || EvenorDD.inputEorO.equals("s") ) 
            {   
                GameStart.Start();
            }
            else if (EvenorDD.inputEorO.equals("R") || EvenorDD.inputEorO.equals("r")) 
            {   
                //Nhớ sửa lại lỗi quay lại PlayGame bị trừ mất tiền =))) (done)
                PlayGame.PlayGame();
            }
            else
            {
                System.out.println("Sorry, you entered incorrectly. Please try again!");   
            }

        }
    }
}
