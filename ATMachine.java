// java.util.*;

import java.util.Scanner;

class ATM{

    float Balance;
    int PIN = 5679;

    public void checkpin(){
        System.out.print("Enter your PIN : ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin == PIN){
            menu();
        }
        else{
            System.out.println("Wrong PIN entered");
        }
        sc.close();
    }

    public void menu(){
        System.out.println();
        System.out.println("ENTER YOUR CHOICE");
        System.out.println("1. Check A/C Balance ");
        System.out.println("2. Withdraw Money ");
        System.out.println("3. Deposit Money ");
        System.out.println("4. Exit");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int enteroption = sc.nextInt();

        if(enteroption == 1){
            checkBalance();
        }
        if(enteroption == 2){
            WithdrawMoney();
        }
        if(enteroption == 3){
            DepositeBalance();
        }
        if(enteroption == 4){
            System.out.print("Thank you !!");
        }
        else{
            System.out.println("Enter a valid choice ");
        }
        sc.close();

    }
    public void checkBalance(){
        System.out.println("Balance : " +  Balance);
        menu();
    }
    public void WithdrawMoney(){
         System.out.print("Enter amount to be withdrawn : ");
         Scanner sc = new Scanner(System.in);
         float amount = sc.nextFloat();
         if(amount > Balance){
            System.out.println("Insufficient Balance");
            System.out.println();
         }
         else{
            Balance = Balance - amount ;
            System.out.println("Money Withdrawn Successfully ");
         }
         menu();
         sc.close();
    }
    public void DepositeBalance(){
        System.out.print("Enter the amount : ");
        Scanner sc = new Scanner(System.in);
        float money = sc.nextFloat();
        Balance += money;
        System.out.println("Money deposited sucessfully");
        menu();
        sc.close();
    }
}
    public class ATMachine{
        public static void main(String[] args) {
            System.out.println("Indian Bank ");
            System.out.println();
            ATM obj = new ATM();
            obj.checkpin();
        }
    }
