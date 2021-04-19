// savings account methods
class Savings implements Account {
	
	private static int balance = 20000; //initial balance
	
	@Override
	//deposit money into savings account
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		balance += amount;
		System.out.println("Amount of " + amount + " Deposited into your Savings Account");
		System.out.println("Updated balance : " + balance);
	}

	@Override
	//withdraw money from savings account
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
	//savings account balance check
	public void balanceEnquiry() {
		// TODO Auto-generated method stub
		System.out.println("Your Savings Account Balance is :" + balance);
	}
	
}
