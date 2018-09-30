package com.kata.main;

import com.kata.domain.IAccount;
import com.kata.domain.implementation.AccountImpl;
import com.kata.exception.IllegalStatementException;
import com.kata.model.Account;
import com.kata.model.Bank;
import com.kata.model.Client;

import java.time.LocalDate;

public class Run {

	public static void main(String... args) {
		IAccount accountImpl = new AccountImpl();

		// Bank object
		Bank bank = new Bank("UniBank");

		// Client objects
		Client client1 = new Client("Durand", "Jack", LocalDate.of(1989, 12, 10));
		Client client2 = new Client("Ramires", "Pedro", LocalDate.of(1982, 2, 14));

		// Account objects
		Account account1 = accountImpl.createAccount(bank, client1, 100);
		Account account2 = accountImpl.createAccount(bank, client2, 0);

		// Statement on account
		try {
			accountImpl.deposit(account2, 100);
			accountImpl.withdrawal(account2, 10);
			accountImpl.withdrawal(account2, 1000);

			accountImpl.deposit(account1, 10);
			accountImpl.deposit(account1, 50);
			accountImpl.withdrawal(account1, 100);

		} catch (IllegalStatementException e) {
			System.err.println(e.getMessage());
		}

		// Print history
		System.out.println(account1);
		accountImpl.printHistoryStatements(account1);

		System.out.println(account2);
		accountImpl.printHistoryStatements(account2);
	}
}
