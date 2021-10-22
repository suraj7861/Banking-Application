package com.savingAccount;

public class SavingAccount {
	//variable declaration
	static double annualInterestRate;
	private double savingBalance;
	
	//constructor 
	public SavingAccount(double savingBalance) {
		super();
		this.savingBalance = savingBalance;
	}

	public double getSavingBalance() {
		return savingBalance;
	}
	
	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingAccount.annualInterestRate = annualInterestRate;
	}

	//method calculate Monthly InterestRate
	public double calculateMonthlyInterestRate() {
		double interestRate = (savingBalance * annualInterestRate)/12;
		savingBalance = savingBalance + interestRate;
		System.out.println("Monthly interest rate :"+ interestRate);
		return interestRate;
	}
	
	


	
	

}
