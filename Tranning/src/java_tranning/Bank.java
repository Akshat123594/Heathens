package java_tranning;

public class Bank {
double amount=2000;
public void deposit( double amount)
{
	amount+=this.amount;
	System.out.println(amount);
}
public void withdraw(double amount) {
	if(amount>this.amount) {
		System.out.print("infussicent balance");
		}
		else
		{
			this.amount-=amount;
			System.out.println(this.amount);
		}
			
	
	
}
	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.deposit(500);
		obj.withdraw(2001);

	}

}
