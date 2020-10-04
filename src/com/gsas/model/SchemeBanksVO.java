package com.gsas.model;

public class SchemeBanksVO {
	
	private long schemeBankId;
	private SchemeVO schemeVO;
	private BankVO bankVO;
	public SchemeBanksVO() {
		super();
	}
	public SchemeBanksVO(long schemeBankId, SchemeVO schemeVO, BankVO bankVO) {
		super();
		this.schemeBankId = schemeBankId;
		this.schemeVO = schemeVO;
		this.bankVO = bankVO;
	}
	
	public SchemeVO getSchemeVO() {
		return schemeVO;
	}
	public void setSchemeVO(SchemeVO schemeVO) {
		this.schemeVO = schemeVO;
	}
	public BankVO getBankVO() {
		return bankVO;
	}
	public void setBankVO(BankVO bankVO) {
		this.bankVO = bankVO;
	}
	public long getSchemeBankId() {
		return schemeBankId;
	}
	public void setSchemeBankId(long schemeBankId) {
		this.schemeBankId = schemeBankId;
	}
	@Override
	public String toString() {
		return "SchemeBanksVO [schemeBankId=" + schemeBankId + ", schemeVO=" + schemeVO + ", bankVO=" + bankVO + "]";
	}
	
}
