import java.util.Scanner;

public class Client {
	
	private static Scanner s;
	
	public static void enterPin() {
		System.out.println("Enter your PIN");
		String pin = s.next();
		//calling verifyPin() method
		verifyPin(pin);
	}
	
	public static void verifyPin(String pin) {
		if(pin.equals(Account_Info.pin)) {
			//calling transaction() method
			transaction();
		}
		else {
			System.out.println("InCorrect PIN");
			System.out.println("Transaction Cancelled");
			return;
		}
	}
	public static void transaction() {
		Account account;
		System.out.println("Select account type: \n Press \"S\" for Savings account \n Press \"C\" for Checking account \n Press any other key to exit");
		String type = s.next();
		if(type.equals("C") || type.equals("c")) {
			account = new Checking();
			System.out.println(" Press \"W\" for Cash Withdrawl \n Press \"D\" for Cash Deposit \n Press \"B\" for Balance Enquiry");
			String option = s.next();
			if(option.equals("W") || option.equals("w")) {
				System.out.println("Enter amount");
				int amount = s.nextInt();
				account.withdraw(amount);
				//calling continueTransaction() method
				continueTransaction();
			}
			else if(option.equals("D") || option.equals("d")) {
				System.out.println("Enter amount");
				int amount = s.nextInt();
				account.deposit(amount);
				//calling continueTransaction() method
				continueTransaction();
			}
			else if(option.equals("B") || option.equals("b")) {
				account.balanceEnquiry();
				//calling continueTransaction() method
				continueTransaction();
			}
			else {
				System.out.println("Invalid Option");
				continueTransaction();
			}
		}
		else if(type.equals("S") || type.equals("s")){
			account = new Savings();
			System.out.println("Press \"W\" for Cash Withdrawl \n Press \"D\" for Cash Deposit \n Press \"B\" for Balance Enquiry");
			String option = s.next();
			if(option.equals("W") || option.equals("w")) {
				System.out.println("Enter amount");
				int amount = s.nextInt();
				account.withdraw(amount);
				//calling continueTransaction() method
				continueTransaction();
			}
			else if(option.equals("D") || option.equals("d")) {
				System.out.println("Enter amount");
				int amount = s.nextInt();
				account.deposit(amount);
				//calling continueTransaction() method
				continueTransaction();
			}
			else if(option.equals("B") || option.equals("b")) {
				account.balanceEnquiry();
				//calling continueTransaction() method
				continueTransaction();
			}
			else {
				System.out.println("Invalid Option");
				continueTransaction();
			}
		} else {
			System.out.println("Good bye !");
			return;
		  }
	}
	public static void continueTransaction() {
		System.out.println("Press \"1\" to continue transaction or \"2\" to exit");
		int option = s.nextInt();
		if(option == 1) {
			transaction();
		}
		else if(option == 2){
			System.out.println("Thank You!");
			return;
		}
		else {
			System.out.println("Invalid Option");
			continueTransaction();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s = new Scanner(System.in);
		System.out.println("Welcome to ATM");
		System.out.println("Insert Your Card");
		enterPin();
		
		
	}	
		
}	





