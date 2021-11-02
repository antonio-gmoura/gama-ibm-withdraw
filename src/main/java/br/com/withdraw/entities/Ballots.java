package br.com.withdraw.entities;

import javax.persistence.Entity;

@Entity
public class Ballots extends SuperEntity {
	
	private Double value;
	private int quantity;
	
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
