package com.kata.model;

import com.kata.util.StatementType;

import java.time.LocalDate;

public class Statement {

	private double amount;
	private LocalDate dateStatement;
	private StatementType statementType;

	public Statement(double amount, LocalDate dateStatement, StatementType statementType) {
		this.amount = amount;
		this.dateStatement = dateStatement;
		this.statementType = statementType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getDateStatement() {
		return dateStatement;
	}

	public void setDateStatement(LocalDate dateStatement) {
		this.dateStatement = dateStatement;
	}

	public StatementType getStatementType() {
		return statementType;
	}

	public void setStatementType(StatementType statementType) {
		this.statementType = statementType;
	}

	@Override
	public String toString() {
		return "Statement{" +
				"amount=" + amount +
				", dateStatement=" + dateStatement +
				", statementType=" + statementType +
				'}';
	}
}
