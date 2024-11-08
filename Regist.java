import java.util.Scanner;

public class Regist {

    public static void Regist()
    {
        ClearScreen.clearScreen();
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.println("|                             |");
        System.out.println("|           EVENORDD          |");
        System.out.println("|                             |");
        System.out.println("|            REGIST           |"); 
        System.out.println("|                             |");
        System.out.println("|   -----------------------   |");
        System.out.println("|   |Account :            |   | ");
        System.out.println("|   |Password:            |   | ");
        System.out.println("|   |Re-Type :            |   | ");
        System.out.println("|   -----------------------   |");
        System.out.println("|                             |");
        System.out.println("|                             |");
        System.out.println("|                             |");
        System.out.println("|                             |");
        System.out.println("-------------------------------");

        while (true) {
            
        
        System.out.println("Please enter your account name.");
        EvenorDD.account = scanner.nextLine();

        System.out.println("Please enter your password");
        EvenorDD.password = scanner.nextLine();

        System.out.println("Re-enter password"); // phát triển thêm tính năng đo độ mạnh yếu của pass
        EvenorDD.re_enterpass = scanner.nextLine();

        System.out.println("If you want to exit, press 123 or press anything to continue");
        EvenorDD.exitinregist = scanner.nextLine();

        int result = EvenorDD.password.compareTo(EvenorDD.re_enterpass);
        if (result == 0) {
            System.out.println("You have successfully registered");
            Login.Login();
            break;
        }
        else if (EvenorDD.exitinregist.equals("123")) {
            System.out.println("Exiting Registration...");
            System.exit(result);
        }
        else
        {
            System.out.println("Password don't match, please try again!.");
            
        }

    }

    scanner.close();
        

    }
}