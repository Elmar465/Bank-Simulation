import java.util.Arrays;
import java.util.Scanner;

public class BankSimulation {

    static String[] bankNames= {"Kapital Bank", "Rabite Bank"};
    public    static Scanner choice=  new Scanner(System.in);
    public static String deposit = "d";
    public static int number = 0;


    public static void startApplication(){
        boolean displayMenuv = true;

        while (displayMenuv) {
            displayDashboard();
            int choice  = getUserChoice();
            processChoice(choice);
            System.out.println();
        }
    }

    public  static void displayDashboard(){
        System.out.println("Welcome to Application");
        System.out.println("Please choose the bank which you want to continue: " + Arrays.toString(bankNames));
        System.out.println("Menu:");
        System.out.println("Kapital Bank Deposit Money");
        System.out.println("Kapital Bank Withdraw Money");
        System.out.println("Rabite Bank Deposit Money");
        System.out.println("Rabite Bank Withdraw Money");
    }

    public  static int getUserChoice(){
        System.out.print("Enter one of these option");
        return choice.nextInt();
    }

    public static void processChoice(int choice){
        switch (choice) {
            case 1 :
                depositMoneyKapital();
                break;
            case 2:
                withdrawMoneyKapital();
                break;
            case 3:
                depositMoneyRabite();
                break;
            case 4:
                withdrawMoneyRabite();
                break;
            case 5:
                exitApplication();
            default:
                System.out.println("Error Invalid Choice.Please try again");
        }
    }

    public static void depositMoneyKapital(){
        int balance = 0;
        System.out.println("How much you want Deposit today ?");
        if(balance >= 0) {
            double sum = balance + number;
            System.out.println("After deposit you balance " + sum);
        } else {
            System.out.println("Incorrect operation");
        }
        System.out.println("Your Balance is: "+ balance);
        deposit = choice.next();
    }

    public static void withdrawMoneyKapital(){
        int balance = 1000;
        System.out.println("Your Balance is: " + balance);
        System.out.println("How much money you want withdraw ?");
        double sum = number = balance;
        System.out.println("After withdraw your balance is: " + balance);
        deposit =  choice.next();
    }
    public static  void  depositMoneyRabite(){
        int balance = 0;
        System.out.println("How much you want Deposit today ?");
        if(balance >= 0) {
            double sum = balance + number;
            System.out.println("After deposit you balance " + sum);
        } else {
            System.out.println("Incorrect operation");
        }
        System.out.println("Your Balance is: "+ balance);
        deposit = choice.next();
    }

    public static void withdrawMoneyRabite(){
        int balance = 1000;
        System.out.println("Your Balance is: " + balance);
        System.out.println("How much money you want withdraw ?");
        double sum = number = balance;
        System.out.println("After withdraw your balance is: " + balance);
        deposit =  choice.next();
    }

    public  static void exitApplication(){
        System.out.println("Exiting the application Goodbye");
        System.exit(0);
    }
}
