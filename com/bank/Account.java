package com.bank;

public class Account
{
	
	private long accountid;
	private String accountType;
	private double balance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public boolean withdraw(int with) {
		
		if(balance>=with) {
			double availB=balance-with;
			balance=availB;
			if(balance>0) {
				return true;
			}
			return false;
			
		}
		return false;
	}
	
//	settermethod***********************************
	public void setAccountid(long ac) {
		this.accountid = ac;
	}
	

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setBalance(double balance2) {

	}
	
//	gettermethodd************************************

	public long getAccountid() {
		return accountid;
	}

	
	public String getAccountType() {
		return accountType;
	}


	public double getBalance() {
		return balance;
	}


}


