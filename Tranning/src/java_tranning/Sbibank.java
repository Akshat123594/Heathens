package java_tranning;

public class Sbibank implements Loan {
	public void show()
	{
		System.out.println("im from SBI BANK AND I WILL MEET YOU IN COUSTOMER 1");
	}
	@Override
	public void intrest(int amount) {
		double intrest=(amount*5.5)/100;
		System.out.println("total amount"+intrest);
		
	}

}
