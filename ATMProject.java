package com.mycompany.mavenproject1;
import java.util.Scanner;
public class ATMProject {
    private static final int PIN=1234;
    private static long balance=0;
    public static void deposit(long amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit successful...");
        }
        else{
            System.out.println("Invalid amount.Try again!");
        }
    }
        public static void withdraw(long amount){
         if(amount<=0){
             System.out.println("Invalid amount.Try again!");
         }   
         else if(amount >balance){
             System.out.println("Insufficient balance...");
         }
         else{
             balance-=amount;
             System.out.println("Withdrawal successful...");
         }
        }
        public static void checkBalance(){
            System.out.println("Your balance is "+ balance);
        }
    public static void main(String[] args) {
       int choice;
        Scanner sc=new Scanner(System.in);
        boolean loggedin=false;
        for(int attempts=3;attempts>0;attempts--){
            System.out.print("Enter pin:");
            int enteredPin=sc.nextInt();
            if(PIN==enteredPin){
                System.out.println("Login successfull!");
                loggedin=true;
                 break;
        }
            else{
                if(attempts-1>0){
                    System.out.println("Wrong pin.Try again...");
                    System.out.println("Attempts left= "+ (attempts-1));
                }
                else{
                    System.out.println("Account locked due to 3 wrong attempts");
                }
            }
            
    }
        if(loggedin){
            while(true){
                System.out.println("\n----ATM Menu---");
                System.out.println("1)Deposit");
                System.out.println("2)Withdraw");
                System.out.println("3)Check balance");
                System.out.println("4)Exit");
                System.out.print("Enter your choice: ");
                choice=sc.nextInt();
            
        
        switch(choice){
            case 1:
                System.out.print("Enter amount to deposit: ");
                long depositAmount=sc.nextLong();
                deposit(depositAmount);
                break;
            case 2:
                System.out.print("Enter amount to withdraw: ");
                long withdrawAmount=sc.nextLong();
                withdraw(withdrawAmount);
                break;
            case 3:
                checkBalance();
                break;
            case 4:
                System.out.println("Thankyou for using the ATM.Goodbye!...");
                sc.close();
                return;
            default:
                System.out.println("Invalid option.Plz try again...");
                continue;
        }
    
}
}
    }
}


