import java.util.ArrayList;
import java.util.Scanner;



public class bankaccountmethods {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        ArrayList<String> tList = new ArrayList<>();
        
        double balance = 0.0;

        int choice = 0;

        while (true) { 
            
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4.View Transactions");
            System.out.println("5. Exit");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1 -> balance = deposit(input, balance, tList);
                case 2 -> balance = withdraw(input, balance, tList);
                case 3 -> showBalance(balance);
                case 4 -> viewTransactions(tList);
                case 5 -> {
                }
                    
            }



        }

        










        
    }
    
    public static double deposit (Scanner input, double balance,ArrayList<String> tList) {
        
        double amount;

        do { 
            System.out.println("Amount To Deposit: ");
            amount = input.nextDouble();

            if (amount < 0) {
                System.out.println("Enter valid amount ");
            }
        } while (amount < 0);

        balance += amount;

        tList.add("Client Deposited: " + amount);

        System.out.println("Deposit Successful");


      return balance;
    }

    public static double withdraw (Scanner input, double balance,ArrayList<String> tList) {

        double amount;

        do { 
           
            System.out.println("Amount to withdraw: ");

            amount = input.nextDouble();

            if (amount <= 0 || amount > balance) {

                System.out.println("Invalid Try Again");

            }
           
        } while (amount <= 0 || amount > balance);

        balance -= amount;

        tList.add("Client Withdrew: " + amount);

        System.out.println("Withdraw Successful Balance is : " + balance);

        return balance;
    }

    public static void viewTransactions (ArrayList<String> tList) {
        if (tList.isEmpty()) {
            System.out.println("No Transaction History");
        }
        else {
            for (int i = 0; i < tList.size(); i++) {
                System.out.println(i + 1 + " . " + tList.get(i));
            }
        }      
    }

    public static void showBalance (double balance) {
        System.out.println("Your current balance is: " + balance);
    }


    

}
