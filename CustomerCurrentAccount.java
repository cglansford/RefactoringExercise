import java.util.ArrayList;

public class CustomerCurrentAccount extends CustomerAccount 
{
	ATMCard atm;
	
public CustomerCurrentAccount()
{
	super();
	this.atm = null;
	
}

public CustomerCurrentAccount(ATMCard atm, String number, double balance, ArrayList<AccountTransaction> transactionList)
{
	super(number, balance, transactionList);	
	this.atm = atm;
}

public boolean atmLogin(Component f) {
	
	int pinAttempts = 3;
	boolean correctPin = true;
	boolean loop = true;

	while (loop) {
		
		if (pinAttempts == 0) {
			JOptionPane.showMessageDialog(f,
					"Pin entered incorrectly 3 times. ATM card locked.", "Pin",
					JOptionPane.INFORMATION_MESSAGE);
			atm.setValid(false);
			
			loop = false;
			return false;
		}

		String Pin = JOptionPane.showInputDialog(f, "Enter 4 digit PIN;");
		int i = Integer.parseInt(Pin);

		if (correctPin) {
			if (atm.getPin() == i) {
				loop = false;
				JOptionPane.showMessageDialog(f, "Pin entry successful", "Pin",
						JOptionPane.INFORMATION_MESSAGE);

			} else {
				pinAttempts--;
				JOptionPane.showMessageDialog(f,
						"Incorrect pin. " + pinAttempts + " attempts remaining. pin is" + atm.getPin() , "Pin",
						JOptionPane.INFORMATION_MESSAGE);
			}

		}
	}
	
	return true;
}

public ATMCard getAtm()
{
	return this.atm;
}

public void setAtm(ATMCard atm)
{
	this.atm = atm;
}

}
