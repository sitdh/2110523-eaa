package com.sitdh.master.eaa.main;

public class A2PointOfSell {
	
	public float cashDeposit;
	
	private B2StaffProfile staff;
	
	protected String[] transaction;
	
	public A2PointOfSell() {
		// TODO: Add constructor
		staff = new B2StaffProfile();
		cashDeposit = 40000.0f;
		transaction = new String[]{"Celery 50g $1", "Carrot 500g $3"};
	}
	
	public void addTransaction() {
		// TODO: Add sell transaction
	}

	public float getCashDeposit() {
		return cashDeposit;
	}

	public void setCashDeposit(float cashDeposit) {
		this.cashDeposit = cashDeposit;
	}

	public B2StaffProfile getStaff() {
		return staff;
	}

	public String[] getTransaction() {
		return transaction;
	}

	public void setTransaction(String[] transaction) {
		this.transaction = transaction;
	}

}
