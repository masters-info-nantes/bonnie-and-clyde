package com.mia.banque.model;

import java.util.List;

public interface ICompte {
	public String getNumero();
	public void setNumero(String newVal);
	public IOperation getOperation();
	public void setOperation(IOperation newVal);

}