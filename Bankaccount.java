
class Bankaccount{
	int balance;	
	public Bankaccount(int balance){
		this.balance=balance;
		System.out.println("Amount created with balance"+balance);
	}
	protected void deposit(int amount){
		if(amount>0){	
			balance+=amount;
			System.out.println("Deposit successfull");
		}else
			System.out.println("Amount cannot be negative");
	}
	protected void withdraw(int amount){
		if(amount<=balance){
			balance-=amount;
			System.out.println("Withdraw successfull");
		}else
			System.out.println("Insuuficent balance");
		
	}
	public void setbalance(int balance){
		this.balance=balance;
	}
	public int getbalance(){
		return balance;
	}
}