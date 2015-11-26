package com.mia.banque.model.impl;

import java.util.List;
import java.util.ArrayList;
import com.mia.banque.model.*;


public class Client implements IClient{
	private String Nom;
	private String Prenom;
	private String Adresse;
	private List<ICompte> listCompte;

	public String getNom() {
		return this.Nom;
	}
	
	public void setNom(String newVal) {
		this.Nom = newVal;
	}

	public String getPrenom() {
		return this.Prenom;
	}
	
	public void setPrenom(String newVal) {
		this.Prenom = newVal;
	}

	public String getAdresse() {
		return this.Adresse;
	}
	
	public void setAdresse(String newVal) {
		this.Adresse = newVal;
	}

	public List<ICompte> getCompte() {
		return this.listCompte;
	}
	
	public void setCompte(List<ICompte> newVal) {
		this.listCompte = newVal;
	}
	

}