package com.mia.banque.model.impl;

import java.util.List;
import java.util.ArrayList;
import com.mia.banque.model.*;


public class Banque implements IBanque{

	private List<IClient> listClient;


	public List<IClient> getClients() {
		return this.listClient;
	}
	
	public void setClients(List<IClient> newVal) {
		this.listClient = newVal;
	}
	

}