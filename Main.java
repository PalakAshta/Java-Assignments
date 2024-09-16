package CalculateInterest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Select the saving account
		double amount = 100000;
		int age = 65;
		String account = "FD";
		switch (account) {
		case "FD":
			// code block
			int days = 91;
			Account acc1 = new FDAccount(amount, age, days);
			System.out.println(acc1.calculateInterest(amount));
			break;
		case "RD":
			// code block
			int months = 16;
			int monthyAmount = 100000;
			Account acc2 = new RDAccount(amount, age, months, monthyAmount);
			System.out.println(acc2.calculateInterest(amount));
			break;
		case "SB":
			// code block
			String accType = "Normal";
			Account acc3 = new SBAccount(amount, age, accType);
			System.out.println(acc3.calculateInterest(amount));
			break;
		default:
			System.out.println("No account Selected ");
			// code block
		}

	}

}
