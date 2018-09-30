package com.kata.model;

import java.time.LocalDate;

public class Client {

	private int id;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;

	private static int counter = 1;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Client(String nom, String prenom, LocalDate dateNaissance) {
		this.id = counter;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;

		counter++;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Client client = (Client) o;

		return id == client.id;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public String toString() {
		return "Client{" +
				"id='" + id + '\'' +
				", nom='" + nom + '\'' +
				", prenom='" + prenom + '\'' +
				", dateNaissance=" + dateNaissance +
				'}';
	}
}
