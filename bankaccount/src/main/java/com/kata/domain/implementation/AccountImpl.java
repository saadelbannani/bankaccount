package com.kata.domain.implementation;

import com.kata.domain.IAccount;
import com.kata.exception.IllegalStatementException;
import com.kata.model.Account;
import com.kata.model.Bank;
import com.kata.model.Client;
import com.kata.model.Statement;
import com.kata.util.StatementType;

import java.time.LocalDate;

public class AccountImpl implements IAccount {

	@Override
	public Account createAccount(Bank bank, Client client, double amount) {
		Account account = new Account(client, amount);
		bank.getAccounts().put(account.getId(), account);
		return account;
	}

	@Override
	public void deposit(Account account, double amount) throws IllegalStatementException {
		if (amount <= 0) {
			account.archiveStatement(new Statement(amount, LocalDate.now(), StatementType.Reject));
			throw new IllegalStatementException("amount to depose must be greater than 0 !");
		}

		account.setAmount(account.getAmount() + amount);
		account.archiveStatement(new Statement(amount, LocalDate.now(), StatementType.Deposit));
	}

	@Override
	public void withdrawal(Account account, double amount) throws IllegalStatementException {
		if (account.getAmount() <= 0 || account.getAmount() < amount) {
			account.archiveStatement(new Statement(amount, LocalDate.now(), StatementType.Reject));
			throw new IllegalStatementException("cannot withdraw : " + amount + " from this account : " + account.getId());
		}

		account.setAmount(account.getAmount() - amount);
		account.archiveStatement(new Statement(amount, LocalDate.now(), StatementType.Withdrawal));
	}

	@Override
	public void printHistoryStatements(Account account) {
		for (Statement statement : account.getStatements()) {
			System.out.println(statement);
		}
	}
}
