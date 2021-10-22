package com.savingAccount;

public class SavingBalance {
	//variable declaration
	static double annualInterestRate;
	private double savingBalance;
	
	//constructor 
	public SavingBalance(double savingBalance) {
		super();
		this.savingBalance = savingBalance;
	}

	public double getSavingBalance() {
		return savingBalance;
	}
	
	
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingBalance.annualInterestRate = annualInterestRate;
	}

	//method calculate Monthly InterestRate
	public double calculateMonthlyInterestRate() {
		double interestRate = (savingBalance * annualInterestRate)/12;
		System.out.println("Monthly interest rate :"+ interestRate);
		return interestRate;
	}
	
	


	
	

}
