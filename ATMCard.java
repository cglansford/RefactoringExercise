public class ATMCard {
 
	int cardPin;
	boolean cardValid;

	public ATMCard()
	{
		this.cardPin = 0000;
	}
	
	public ATMCard(int pin, boolean valid)
	{
		this.cardPin = pin;
	}
	
	public int getPin()
	{
		return this.cardPin;
	}
	
	public boolean getValid()
	{
		return this.cardValid;
	}
	
	public void setPin(int pin)
	{
		this.cardPin = pin;
	}
	
	public void setValid(boolean valid)
	{
		this.cardValid = valid;
	}
	
	public String toString()
	{
		return "Pin = " + this.cardPin;
			
	}
}
