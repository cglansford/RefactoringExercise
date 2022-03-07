
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane; 

public class CustomerAccount  {
   
	String accountNumber;
	double accountBalance;
	ArrayList<AccountTransaction> transactionList = new ArrayList<AccountTransaction>();

	//Blank Constructor
	public CustomerAccount()
	{
		this.accountNumber = "";
		this.accountBalance = 0;
		this.transactionList = null;
	}
	
	//Constructor with Details
	public CustomerAccount(String accountNumber, double accountBalance, ArrayList<AccountTransaction> transactionList)
	{
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.transactionList = transactionList;
	}
	
	//Accessor methods
	
	public String getNumber()
	{
		return this.accountNumber;
	}
	
	

	
	public double getBalance()
	{
		return this.accountBalance;
	}
	
	public ArrayList getTransactionList()
	{
		return this.transactionList;
	}

	//Mutator methods
	public void setNumber(String number)
	{
		this.accountNumber = number;
	}
	
	public void setBalance(double balance)
	{
		this.accountBalance = balance;
	}
	
	public void setTransactionList(ArrayList transactionList)
	{
		this.transactionList = transactionList;
	}
	
	public void addLodgement(Component f, double lodgementAmount) {
		String euro = "\u20ac";
		accountBalance += lodgementAmount;
		Date transactionDate = new Date();

		AccountTransaction transaction = new AccountTransaction(transactionDate.toString(), "Lodgement", accountBalance);
		transactionList.add(transaction);

		JOptionPane.showMessageDialog(f, accountBalance + euro + " added do you account!", "Lodgement",
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(f, "New balance = " + accountBalance + euro,
				"Lodgement", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void addWithdraw(Component f, double withdrawAmount) {
		String euro = "\u20ac";
		accountBalance -= withdrawAmount;
		Date transactionDate = new Date();

		AccountTransaction transaction = new AccountTransaction(transactionDate.toString(), "Withdraw", withdrawAmount);
		transactionList.add(transaction);

		JOptionPane.showMessageDialog(f, withdrawAmount + euro + " withdrawn.", "Withdraw",
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(f, "New balance = " + accountBalance + euro, "Withdraw",
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	
}
