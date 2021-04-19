//checking account methods
class Checking implements Account {
	
	private static int balance = 10000; //initial balance
	
	@Override
	//deposit money into checking account
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		balance += amount;
		System.out.println("Amount of " + amount + " Deposited into your Checking Account");
		System.out.println("Updated Balance : " + balance);
	}

	@Override
	//withdraw money from checking account
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		if(amount > balance || amount == 0) {
			System.out.println("Insufficient Funds");
		}
		else {
			balance -= amount;
			System.out.println("Please collect your cash of :" + amount);
			System.out.println("Updated balance : " + balance);
		}
		
	}

	@Override
	//checking account balance check
	public void balanceEnquiry() {
		// TODO Auto-generated method stub
		System.out.println("Your Checking Account balance is :" + balance);
	}
	
}