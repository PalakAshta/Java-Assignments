package CalculateInterest;

public abstract class Account {
	private double interestRate;
	private double amount;
	private int age;
	public abstract double calculateInterest(double amount);
    //Constructor 
	public Account(double amount, int age) {
		super();
		this.amount = amount;
		this.age = age;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
