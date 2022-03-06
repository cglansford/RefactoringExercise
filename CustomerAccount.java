
import java.util.ArrayList; 

public class CustomerAccount  {
   
	String number;
	double balance;
	ArrayList<AccountTransaction> transactionList = new ArrayList<AccountTransaction>();

	//Blank Constructor
	public CustomerAccount()
	{
		this.number = "";
		this.balance = 0;
		this.transactionList = null;
	}
	
	//Constructor with Details
	public CustomerAccount(String number, double balance, ArrayList<AccountTransaction> transactionList)
	{
		this.number = number;
		this.balance = balance;
		this.transactionList = transactionList;
	}
	
	//Accessor methods
	
	public String getNumber()
	{
		return this.number;
	}
	
	

	
	public double getBalance()
	{
		return this.balance;
	}
	
	public ArrayList getTransactionList()
	{
		return this.transactionList;
	}

	//Mutator methods
	public void setNumber(String number)
	{
		this.number = number;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public void setTransactionList(ArrayList transactionList)
	{
		this.transactionList = transactionList;
	}
	
	public void addLodgement(Component f, double lodgementAmount) {
		String euro = "\u20ac";
		balance += lodgementAmount;
		Date transactionDate = new Date();

		AccountTransaction transaction = new AccountTransaction(transactionDate.toString(), "Lodgement", balance);
		transactionList.add(transaction);

		JOptionPane.showMessageDialog(f, balance + euro + " added do you account!", "Lodgement",
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(f, "New balance = " + balance + euro,
				"Lodgement", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
