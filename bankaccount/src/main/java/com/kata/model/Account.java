package com.kata.model;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private int id;
	private Client client;
	private double amount;
	private List<Statement> statements = new ArrayList<>();

	private static int counter = 1;

	public Account(Client client, double amount) {
		this.client = client;
		this.amount = amount;
		this.id = counter;
		counter++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public List<Statement> getStatements() {
		return statements;
	}

	public void setStatements(List<Statement> statements) {
		this.statements = statements;
	}

	public void archiveStatement(Statement statement) {
		getStatements().add(statement);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Account account = (Account) o;

		return id == account.id;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public String toString() {
		return "Account{" +
				"id=" + id +
				", client=" + client +
				", amount=" + amount +
				'}';
	}
}
