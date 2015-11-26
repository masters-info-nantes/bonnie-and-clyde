package com.mia.banque.model.impl;

import java.util.List;
import java.util.ArrayList;
import com.mia.banque.model.*;


public class Compte implements ICompte{
	private String Numero;

	private List<IOperation> listOperation;

	public String getNumero() {
		return this.Numero;
	}
	
	public void setNumero(String newVal) {
		this.Numero = newVal;
	}


	public List<IOperation> getOperations() {
		return this.listOperation;
	}
	
	public void setOperations(List<IOperation> newVal) {
		this.listOperation = newVal;
	}
	

}