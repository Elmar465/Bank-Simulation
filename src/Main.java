import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

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
        System.out.println("Exit the application");
    }

    public  static int getUserChoice(){
        System.out.print("Enter one of these option: ");
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

        System.out.print("How much you want Deposit today:");
        Scanner dp = new Scanner(System.in);
        int depositMoney =  dp.nextInt();
        double balance = 0;
        double sum  = balance + depositMoney;
        if(depositMoney > 0) {
            System.out.println("Your Deposit Was Successful.");
            System.out.println("Your Balance After Deposit is: "+ sum);
        } else {
            System.out.println("Operation was unsuccessful, Please try again");
        }


    }

    public static void withdrawMoneyKapital(){
        int balance = 1000;
        System.out.print("How much money you want to withdraw: ");
        Scanner wt =  new Scanner(System.in);
        int withdrawMoney =  wt.nextInt();
        double result  =  balance - withdrawMoney;
        if(result == -1) {
            System.out.println("Wrong operation, Try again");
        } else {
            System.out.println("Operation was successful:");
            System.out.println("Your balance after withdraw is: "+ result);
        }

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
    public static void main(String[] args) {
        startApplication();

    }
}