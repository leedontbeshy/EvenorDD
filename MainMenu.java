import java .util.*;
public class MainMenu {
    public static void MainMenu()
    {
        ClearScreen.clearScreen();
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.println("|                             |");
        System.out.println("|           EVENORDD          |");
        System.out.println("|                             |");
        System.out.println("|           MAIN MENU         |"); 
        System.out.println("|                             |");
        System.out.println("|       1.   PLAY             |");
        System.out.println("|       2.   CHECK BALANCE    |");
        System.out.println("|       3.   RECHARGE         |");
        System.out.println("|       4.   TRADING          |");
        System.out.println("|       5.   SETTINGS         |");
        System.out.println("|       6.   EXIT             |");
        System.out.println("|                             |");
        System.out.println("|                             |");
        System.out.println("|                             |");
        System.out.println("-------------------------------");

        while (true) 
        {
            System.out.println("PRESS THE CORRESPONDING KEY TO SELECT");
            EvenorDD.inputMainMenu=scanner.nextLine();
            
            switch (EvenorDD.inputMainMenu) {
                case "1":
                    System.out.println("Loading...");

                    try 
                    {
                        Thread.sleep(1000); // Chờ 1 giây trước khi login nếu đúng tk mk
                    } 
                    catch (InterruptedException e) 
                    {
                        e.printStackTrace();
                    }

                    PlayGame.PlayGame();
                break;

                case "2":
                    System.out.println("Loading...");
                    try 
                    {
                        Thread.sleep(1000); // Chờ 1 giây trước khi login nếu đúng tk mk
                    } 
                    catch (InterruptedException e) 
                    {
                        e.printStackTrace();
                    }

                    CheckBalance.CheckBalance();
                break;

                case "3":
                    System.out.println("Loading...");
                    try 
                    {
                        Thread.sleep(1000); // Chờ 1 giây trước khi login nếu đúng tk mk
                    } 
                    catch (InterruptedException e) 
                    {
                        e.printStackTrace();
                    }

                    Recharge.Recharge();
                break;

                case "4":
                    System.out.println("Loading...");
                    try 
                    {
                        Thread.sleep(1000); // Chờ 1 giây trước khi login nếu đúng tk mk
                    } 
                    catch (InterruptedException e) 
                    {
                        e.printStackTrace();
                    }

                    Trading.Trading();
                break;

                case "5":
                    System.out.println("Loading...");
                    try 
                    {
                        Thread.sleep(1000); // Chờ 1 giây trước khi login nếu đúng tk mk
                    } 
                    catch (InterruptedException e) 
                    {
                        e.printStackTrace();
                    }

                    Setting.Setting();
                break;
                    
                case "6":
                    System.out.println("Loading...");
                    try 
                    {
                        Thread.sleep(1000); // Chờ 1 giây trước khi login nếu đúng tk mk
                    } 
                    catch (InterruptedException e) 
                    {
                        e.printStackTrace();
                    }

                    System.exit(0);
                break;
                    
            
                default:
                    System.out.println("Nhập ko hợp lệ, vui lòng nhập lại");
                    continue;
            }
            scanner.close();
        }
        
        

        

    }
}
