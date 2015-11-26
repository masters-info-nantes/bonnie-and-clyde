package com.mia.banque.model.impl;

import java.util.List;
import java.util.ArrayList;
import com.mia.banque.model.*;


public class Banque implements IBanque{
	private List<IClient> listClient;

	public List<IClient> getClient() {
		return this.listClient;
	}
	
	public void setClient(List<IClient> newVal) {
		this.listClient = newVal;
	}
	

}