
class Bankaccount{
	int balance;	
	public Bankaccount(int balance){
		this.balance=balance;
	}
	private void deposit(int amount){
		if(amount>0)	
			balance+=amount;
			System.out.println("Deposit successfull");
		else
			System.out.println("Amount cannot be negative");
	}	
}