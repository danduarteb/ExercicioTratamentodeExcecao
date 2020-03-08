package model.entities;

import model.exceptions.ModelException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	public void withdraw(Double amount) throws ModelException {
		if(balance - amount < 0) {
			throw new ModelException("Not enough balance");
		}
		if(amount > withDrawLimit) {
			throw new ModelException("The amount exceeds withdraw limit");
		}
		this.balance -= amount;
		System.out.println("New balance: " + String.format("%.2f", this.balance));
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}
	
	

}
