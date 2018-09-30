package com.kata.model;

import java.util.HashMap;
import java.util.Map;

public class Bank {

	private String nom;
	private Map<Integer, Account> accounts;

	public Bank(String nom) {
		this.nom = nom;
		this.accounts = new HashMap<>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Map<Integer, Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Map<Integer, Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Bank bank = (Bank) o;

		return nom != null ? nom.equals(bank.nom) : bank.nom == null;
	}

	@Override
	public int hashCode() {
		return nom != null ? nom.hashCode() : 0;
	}

	@Override
	public String toString() {
		return "Bank{" +
				"nom='" + nom + '\'' +
				", accounts=" + accounts +
				'}';
	}
}
