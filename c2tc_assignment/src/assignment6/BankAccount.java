package assignment6;

	class BankAccount {
	    private int accountNumber;
	    private double balance;

	    // Constructor
	    public BankAccount(int accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    // Method to add money
	    public void deposit(double amount) throws InvalidAmountException {
	        if (amount <= 0) {
	            throw new InvalidAmountException("Deposit must be greater than 0.");
	        }
	        balance += amount;
	        System.out.println("Deposit successful.");
	    }

	    // Method to take out money
	    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
	        if (amount <= 0) {
	            throw new InvalidAmountException("Withdrawal must be greater than 0.");
	        }
	        if (amount > balance) {
	            throw new InsufficientFundsException("Not enough balance.");
	        }
	        balance -= amount;
	        System.out.println("Withdrawal successful.");
	    }

	    // Show balance
	    public void displayBalance() {
	        System.out.println("Account No: " + accountNumber + ", Balance: ₹" + balance);
	    }
	}


