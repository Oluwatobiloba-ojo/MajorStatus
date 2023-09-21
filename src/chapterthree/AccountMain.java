package chapterthree;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Account myAccount = new Account("Mathew Cephas", 0.00);
        Account ourAccount = new Account("Jane Berry", 0.00);
        Scanner input = new Scanner(System.in);

        displayAccount(myAccount);
        displayAccount(ourAccount);

        System.out.println("Enter the amount to deposit to mathew Cephas ");
        int amount = input.nextInt();
        myAccount.deposit(amount);
        displayAccount(myAccount);

        System.out.println("Enter the amount to deposit to jane");
        int amount2 = input.nextInt();
        ourAccount.deposit(amount2);
        displayAccount(ourAccount);

        displayAccount(myAccount);

        System.out.println("Enter the amount to withdraw from mathew: ");
        int withdrawal = input.nextInt();
        myAccount.withdraw(withdrawal);
        displayAccount(myAccount);

        System.out.println("Enter the amount to withdraw from jane: ");
        int withdraw = input.nextInt();
        ourAccount.withdraw(withdraw);
        displayAccount(ourAccount);
        displayAccount(myAccount);
    }
    public static void displayAccount(Account myAccount){
        System.out.println(myAccount.getName()+ "  " +myAccount.checkBalance());
    }
}
