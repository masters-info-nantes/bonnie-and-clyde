package com.mia.banque.model.impl;

import java.util.List;
import java.util.ArrayList;
import com.mia.banque.model.*;


public class Operation implements IOperation{
	private String Numero;
	private String Montant;


	public String getNumero() {
		return this.Numero;
	}
	
	public void setNumero(String newVal) {
		this.Numero = newVal;
	}

	public String getMontant() {
		return this.Montant;
	}
	
	public void setMontant(String newVal) {
		this.Montant = newVal;
	}



}