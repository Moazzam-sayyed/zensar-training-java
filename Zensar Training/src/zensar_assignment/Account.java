package zensar_assignment;
import java.util.Scanner;

public class Account {
	Scanner sc = new Scanner(System.in);
	public long accountNumber; // instance variables;
	public String name;
	long balance;

	Account() 				// Default constructor: a constructor with no arguments
	{
		System.out.println("I am in default constructor");
	}

	Account(long accountNumber, String name, long balance) 			// Default constructor: a constructor with two arguments
	{
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		System.out.println("I am in aprametarized constructor");
		
	}

	
	void insert() 		// method to insert account detail
	{
		System.out.println("Enter Nmae of account holder:");
		name = sc.next();
		System.out.println("Enter acoount number:");
		accountNumber = sc.nextLong();
		System.out.println("Enter balance Amount:");
		balance = sc.nextLong();
	}
	void display()
	{
		System.out.println("Name :" + name);
		System.out.println("Account Number :" + accountNumber);
		System.out.println("Balance: " + balance);
		
	}

	long deposit() // method to deposit into account;
	{
		long amount;
		System.out.println("Enter Amount to be deposite: ");
		amount = sc.nextLong();
		balance = balance + amount;
		System.out.println("Current Balance:=" + balance);
		return balance;
	}

	long withdraw() // method to withdraw amount from account
	{
		long amount;
		System.out.println("Enter Withdraw Amount : ");
		amount = sc.nextLong();
		balance = balance - amount;
		System.out.println("Current Balance:=" + balance);
		return balance;
	}

	void checkBalance() { // method to check current
		System.out.println("Balnce:" + balance);
	}

	public static void main(String[] args) {
		Account account1 = new Account();
		account1.insert();
		account1.display();
		account1.deposit();
		account1.withdraw();
		account1.checkBalance();
		account1.display();
		Account account2 = new Account(1235475,"Mazhar",14555);
		account2.display();

	}

}

