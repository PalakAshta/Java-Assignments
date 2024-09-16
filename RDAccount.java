package CalculateInterest;

public class RDAccount extends Account {
	private int months;
	private int monthyAmount;
	private String ageGp;
    
	
	public RDAccount(double amount, int age, int months, int monthyAmount) {
		super(amount, age);
		this.months = months;
		this.monthyAmount = monthyAmount;
		setAgeGp(age);
		
	}

	public double calculateInterest(double amount) {
		double r = 1.0;
		if (ageGp == "General") {

			if (months <= 6)
				r = 7.5;
			if (months <= 9)
				r = 7.75;
			if (months <= 12)
				r = 8.0;
			if (months <= 15)
				r = 8.25;
			if (months <= 18)
				r = 8.5;
			if (months <= 21)
				r = 8.75;
			setInterestRate(r);
			return (r * amount) / 100.0;
		} else if (ageGp == "Senior Citizen") {

			if (months <= 6)
				r = 8;
			if (months <= 9)
				r = 8.25;
			if (months <= 12)
				r = 8.5;
			if (months <= 15)
				r = 8.75;
			if (months <= 18)
				r = 9.0;
			if (months <= 21)
				r = 9.25;
			setInterestRate(r);
			return (r * amount) / 100.0;
		} else
			return amount;
	}

	public void setAgeGp(int age) {
		if (age < 60)
			this.ageGp = "General";
		if (age >= 60 && age < 80)
			this.ageGp = "Senior Citizen";
	}

	public int getMonths() {
		return months;
	}

	public void setMonths(int months) {
		this.months = months;
	}

	public int getMonthyAmount() {
		return monthyAmount;
	}

	public void setMonthyAmount(int monthyAmount) {
		this.monthyAmount = monthyAmount;
	}

	public String getAgeGp() {
		return ageGp;
	}

	public void setAgeGp(String ageGp) {
		this.ageGp = ageGp;
	}
	
	
}
