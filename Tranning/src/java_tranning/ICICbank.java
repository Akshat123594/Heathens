package java_tranning;

public class ICICbank implements Loan {
	public void show()
	{
		System.out.println("im from ICIC BANK AND I WILL MEET YOU IN COUSTOMER 2");
	}
	@Override
	public void intrest(int amount) {
		double intrest=(amount*6.5)/100;
		System.out.println("total amount"+intrest);
		
	}

}
