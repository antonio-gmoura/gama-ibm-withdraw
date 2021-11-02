package br.com.withdraw.entities;

import javax.persistence.Entity;

@Entity
public class Account extends SuperEntity {
	
	private String numberAccount;

	public String getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(String numberAccount) {
		this.numberAccount = numberAccount;
	}
	
}
