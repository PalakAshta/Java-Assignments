package CalculateInterest;

public class SBAccount extends Account {
	private String accType;
    
	public SBAccount(double amount, int age, String accType) {
		super(amount, age);
		this.accType = accType;
	}

	public double calculateInterest(double amount) {
		double r = 1.0;

		if (accType == "Normal")
			r = 4.0;

		else if (accType == "NRI")
			r = 6.0;
		setInterestRate(r);
		return (r * amount) / 100.0;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}
	

}
