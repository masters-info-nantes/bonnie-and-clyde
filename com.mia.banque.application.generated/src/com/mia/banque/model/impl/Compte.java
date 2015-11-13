package com.mia.banque.model;

import java.util.List;
import java.util.ArrayList;
import com.mia.banque.model.ICompte;


public class Compte implements ICompte{
	private String Numero;
	private List<Operation> listOperation;

	public String getNumero() {
		return this.Numero;
	}
	
	public void setNumero(String newVal) {
		this.Numero = newVal;
	}

	public List<IOperation> getOperation() {
		return this.listOperation;
	}
	
	public void setOperation(List<IOperation> newVal) {
		this.listOperation = newVal;
	}
	

}