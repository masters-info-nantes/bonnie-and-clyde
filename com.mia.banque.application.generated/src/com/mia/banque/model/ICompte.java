package com.mia.banque.model;

import java.util.List;

public interface ICompte {
	public String getNumero();
	public void setNumero(String newVal);
	public List<IOperation> getOperation();
	public void setOperation(List<IOperation> newVal);

}