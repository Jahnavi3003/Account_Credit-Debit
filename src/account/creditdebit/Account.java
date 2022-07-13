package account.creditdebit;

import java.util.Scanner;

public class Account {

	
	static Scanner input = new Scanner(System.in);

	int Acc_bal = 0;

	public void debit() {
		System.out.println("Enter the amount to debit :- ");
		int debit_amt = input.nextInt();

		if (debit_amt <= Acc_bal) {
			Acc_bal -= debit_amt;
			System.out.println(" Total account balance :- " + Acc_bal);
		} else {
			System.out.println(" Total account balance :- " + Acc_bal);
			System.out.println(" Debit Amount exceeded account balance ");
		}
	}

	public void credit() {

		System.out.println("Enter the amount to  credit :- ");
		int credit_amt = input.nextInt();

		Acc_bal += credit_amt;
		System.out.println(" Your total account balance :- " + Acc_bal);

	}
	
	
	public static void main(String[] args) {
		System.out.println(" Welcome To Accounts----Credit and Debit Operations");

	    Account Op = new Account();
		Op.credit();
		Op.debit();
}
}

