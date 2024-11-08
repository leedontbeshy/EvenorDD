import java.util.Scanner;

public class Login {
    public static void Login()
    {
        ClearScreen.clearScreen();
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.println("|                             |");
        System.out.println("|           EVENORDD          |");
        System.out.println("|                             |");
        System.out.println("|            LOGIN            |"); 
        System.out.println("|                             |");
        System.out.println("|   -----------------------   |");
        System.out.println("|   |Account :            |   | ");
        System.out.println("|   |Password:            |   | ");
        System.out.println("|   |                     |   |");
        System.out.println("|   |CAPTCHA :            |   | ");
        System.out.println("|   -----------------------   |");
        System.out.println("| -  What's is captcha?       |");
        System.out.println("|  -> Just answer a simple    |");
        System.out.println("|     question to continue    |");
        System.out.println("|                             |");
        System.out.println("-------------------------------");

        while (true) {
            System.out.println("Please enter your account name");
            EvenorDD.inputLoginaccount = scanner.nextLine();

            System.out.println("Please enter password");
            EvenorDD.inputLoginpass = scanner.nextLine();

            while (true) 
            {
            
                System.out.println("Please enter an answer to confirm you are human ");
                System.out.println("The question is whats 6+9? ");
                EvenorDD.inputLogincaptcha = scanner.nextLine(); 

                if(EvenorDD.inputLogincaptcha.equals("69"))
                    {
                        System.out.println("You're right!");
                        try 
                        {
                            Thread.sleep(2000); // Chờ 2 giây trước khi login nếu đúng tk mk
                        } 
                        catch (InterruptedException e) 
                        {
                            e.printStackTrace();
                        }
                        break;
                    }
                else
                    {
                        System.out.println("Wrong answer, please try again");
                    }
            }

            int resultaccountlogin = EvenorDD.inputLoginaccount.compareTo(EvenorDD.account);
            int resultpasswordlogin = EvenorDD.inputLoginpass.compareTo(EvenorDD.password);

            if (resultaccountlogin == 0 && resultpasswordlogin == 0) 
            {   
                System.out.println("Loading.....");
                try 
                {
                    Thread.sleep(2000); // Chờ 2 giây trước khi login nếu đúng tk mk
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                }
                System.out.println("Succesfully login!");
                MainMenu.MainMenu();
                break;
            }
            else
            {
                System.out.println("Incorrect account name or password!");
            }
        }

        
        

    }
}
