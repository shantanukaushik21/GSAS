package com.gsas.model;

public class BankVO {
	
	private long bankId;
	private String bankName;
	
	public BankVO() {
		super();
	}
	
	public BankVO(long bankId, String bankName) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
	}

	public long getBankId() {
		return bankId;
	}

	public void setBankId(long bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "BankVO [bankId=" + bankId + ", bankName=" + bankName + "]";
	}
	
	
}
