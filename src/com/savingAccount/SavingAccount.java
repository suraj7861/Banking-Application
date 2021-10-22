package com.savingAccount;

public class SavingAccount {

	public static void main(String[] args) {
		System.out.println("Welcome to Banking Application");
		//object creation
		SavingBalance saver1 = new SavingBalance(2000.00);
		SavingBalance saver2 = new SavingBalance(3000.00);
		
		//calculate monthly interest rate
		saver1.calculateMonthlyInterestRate();
		saver2.calculateMonthlyInterestRate();
		
		//print
		System.out.println("saver 1 :"+saver1);
		System.out.println("Saver 2: "+saver2);
		
		

	}

}
