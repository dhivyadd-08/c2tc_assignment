package assignment6;
	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Create an account
	        BankAccount myAccount = new BankAccount(1234, 1000.0);

	        myAccount.displayBalance();

	        try {
	            // Deposit money
	            System.out.print("Enter amount to deposit: ");
	            double depositAmount = sc.nextDouble();
	            myAccount.deposit(depositAmount);
	            myAccount.displayBalance();

	            // Withdraw money
	            System.out.print("Enter amount to withdraw: ");
	            double withdrawAmount = sc.nextDouble();
	            myAccount.withdraw(withdrawAmount);
	            myAccount.displayBalance();

	        } catch (InvalidAmountException | InsufficientFundsException e) {
	            System.out.println("Error: " + e.getMessage());
	        } finally {
	            System.out.println("Thank you for banking with us.");
	        }

	        sc.close();
	    }
	}


