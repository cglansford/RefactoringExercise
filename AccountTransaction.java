public class AccountTransaction {

	String transactionDate;
	String transactionType;
	double transactionAmount;
	
	//Blank constructor
	public AccountTransaction()
	{
		this.transactionDate = "";
		this.transactionType = "";	
		this.transactionAmount = 0;
		
	}
	
	//Constructor with details
	public AccountTransaction(String transactionDate, String transactionType, double transactionAmount)
	{
		this.transactionDate = transactionDate;
		this.transactionType = transactionType;
		
		
		this.transactionAmount = transactionAmount;
		
	}
	
	//Accessor methods
	public String getTransactionDate()
	{
		return this.transactionDate;
	}
	
	public String getTransactionType()
	{
		return this.transactionType;
	}

	public double getTransactionAmount()
	{
		return this.transactionAmount;
	}

	//mutator methods
	public void setTransactionDate(String date)
	{
		this.transactionDate = date;
	}
	
	public void setTransactionType(String type)
	{
		this.transactionType = type;
	}
	
	public void setTransactionAmount(double amount)
	{
		this.transactionAmount = amount;
	}
	
	public String toString()
	{
		return  "\n" + "Date = " + this.transactionDate + "\n"
				+ "Type = " + this.transactionType + "\n"
				+ "Amount = " + this.transactionAmount + "\n";
			
	}
	
}
