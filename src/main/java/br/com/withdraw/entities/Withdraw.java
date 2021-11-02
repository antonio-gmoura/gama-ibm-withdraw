package br.com.withdraw.entities;

import javax.persistence.Entity;

@Entity
public class Withdraw extends SuperEntity {

	private Double value;

	public Withdraw() {
		super();
	}
	
	public Withdraw(Double value) {
		super();
		this.value = value;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
}
