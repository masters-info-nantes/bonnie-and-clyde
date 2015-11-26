package com.mia.banque.model;

import java.util.List;

public interface ICompte {
	public String getNumero();
	public void setNumero(String newVal);

	public List<IOperation> getOperations();
	public void setOperations(List<IOperation> newVal);

}