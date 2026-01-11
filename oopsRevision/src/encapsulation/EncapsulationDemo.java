package encapsulation;

class Account{
	//encapsulation rules
	//data will remain secure nobody can directly touch it and can't modify it
	//will provide control access using access modifier
	private int balance;//data hidden
	
	//providing access through getter/setters
	public void getBalance() {
		System.out.println("Account Balance: "+balance);
	}
	
	public void setBalance(int balance) {
		if(balance>0) {
			this.balance+=balance;
		}
	}
	
	public void withdraw(int amount) {
		if(amount>0 && amount<=balance) {
			this.balance-= amount;
		}
	}
}

public class EncapsulationDemo {
	public static void main(String[] args) {
		Account ac = new Account();
		ac.setBalance(1000);
		ac.getBalance();
		ac.withdraw(500);
		ac.getBalance();
		//ac.balance = 500; data cannot access or modify directly
	}
}
