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
		System.out.println("Calculate Monthly bank balance for saver1 ");
		saver1.calculateMonthlyInterestRate();
		System.out.println("Monthly bank balance for saver1 is: " + saver1 );
		System.out.println("------------------------------------------------");
		//saver 2
		System.out.println("Calculate Monthly bank balance for saver2 ");
		saver2.calculateMonthlyInterestRate();
		System.out.println("Monthly bank balance for saver2 is: " + saver2 );
		System.out.println("------------------------------------------------");
		
		//calculate monthly interest rate
		SavingAccount.setAnnualInterestRate(5.00);
		//saver 1
		System.out.println("Calculate Monthly bank balance for saver1 ");
		saver1.calculateMonthlyInterestRate();
		System.out.println("Monthly bank balance for saver1 is: " + saver1 );
		System.out.println("------------------------------------------------");
		//saver 2
		System.out.println("Calculate Monthly bank balance for saver2 ");
		saver2.calculateMonthlyInterestRate();
		System.out.println("Monthly bank balance for saver2 is: " + saver2 );

	}

}
