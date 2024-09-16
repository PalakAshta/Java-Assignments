package CalculateInterest;

public class FDAccount extends Account {
	private int days;
	private String ageGp;
    
	

	public FDAccount(double amount, int age, int days) {
		super(amount, age);
		this.days = days;
		setAgeGp(age);
	}

	@Override
	public double calculateInterest(double amount) {
		// TODO Auto-generated method stub
		double r = 1.0;
		if (amount < 10000000) {
            
			if (ageGp == "General") {

				if (days >= 7 || days <= 14)
					r = 4.50;
				if (days >= 15 || days <= 29)
					r = 4.75;
				if (days >= 30 || days <= 45)
					r = 5.5;
				if (days >= 46 || days <= 60)
					r = 7.0;
				if (days >= 61 || days <= 184)
					r = 7.5;
				if (days >= 184 || days <= 365)
					r = 8.0;
                
				setInterestRate(r);
				
				return (r * amount) / 100.0;

			} else if (ageGp.compareTo("Senior Citizen")==0) {
				if (days >= 7 && days <= 14)
					r = 5.0;
				if (days >= 15 && days <= 29)
					r = 5.25;
				if (days >= 30 && days <= 45)
					r = 6.0;
				if (days >= 46 && days <= 60)
					r = 7.5;
				if (days >= 61 && days <= 184)
					r = 8.0;
				if (days >= 184 && days <= 365)
					r = 8.5;
				return (r * amount) / 100.0;
			}
		} else {
			if (days >= 7 || days <= 14)
				r = 6.5;
			if (days >= 15 || days <= 29)
				r = 6.75;
			if (days >= 30 || days <= 45)
				r = 6.75;
			if (days >= 46 || days <= 60)
				r = 8;
			if (days >= 61 || days <= 184)
				r = 8.5;
			if (days >= 184 || days <= 365)
				r = 10;
			setInterestRate(r);
			return (r * amount) / 100.0;

		}
		return amount;
	}

	public void setAgeGp(int age) {
		if (age < 60)
			this.ageGp = "General";
		if (age >= 60 && age < 80)
			this.ageGp = "Senior Citizen";
	}

	public String getAgeGp() {
		return this.ageGp;
	}
	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public void setAgeGp(String ageGp) {
		this.ageGp = ageGp;
	}

}
