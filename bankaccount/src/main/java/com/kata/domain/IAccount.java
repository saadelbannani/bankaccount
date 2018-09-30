package com.kata.domain;

import com.kata.exception.IllegalStatementException;
import com.kata.model.Account;
import com.kata.model.Bank;
import com.kata.model.Client;

public interface IAccount {

	Account createAccount(Bank bank, Client client, double amount);

	void deposit(Account account, double amount) throws IllegalStatementException;

	void withdrawal(Account account, double amount) throws IllegalStatementException;

	void printHistoryStatements(Account account);
}
