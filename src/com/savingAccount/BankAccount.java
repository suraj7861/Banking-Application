package com.savingAccount;

public class BankAccount {

	public static void main(String[] args) {
		System.out.println("Welcome to Banking Application");
		//object creation
		SavingAccount saver1 = new SavingAccount(2000.00);
		SavingAccount saver2 = new SavingAccount(3000.00);
		
		//calculate monthly interest rate
		SavingAccount.setAnnualInterestRate(4.00);
		//saver 1
		saver1.calculateMonthlyInterestRate();
		System.out.println("Monthly bank balance for saver1 is: " + saver1 );
		//saver 2
		saver2.calculateMonthlyInterestRate();
		System.out.println("Monthly bank balance for saver1 is: " + saver1 );
		
		//calculate monthly interest rate
		SavingAccount.setAnnualInterestRate(5.00);
		//saver 1
		saver1.calculateMonthlyInterestRate();
		System.out.println("Monthly bank balance for saver1 is: " + saver1 );
		//saver 2
		saver2.calculateMonthlyInterestRate();
		System.out.println("Monthly bank balance for saver1 is: " + saver1 );

	}

}
