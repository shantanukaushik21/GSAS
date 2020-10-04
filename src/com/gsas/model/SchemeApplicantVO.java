package com.gsas.model;

public class SchemeApplicantVO {
	
	private long schemeApplicantId;
	private SchemeVO schemeVO;
	private CitizenVO citizenVO;
	private BankVO bankVO;
	private long accountNumber;
	private String TypeOfAccount;
	private String ifsc;
	private String branch;
	private boolean approvedStatus;
	private String reason;
	public SchemeApplicantVO() {
		super();
	}
	public SchemeApplicantVO(long schemeApplicantId, SchemeVO schemeVO, CitizenVO citizenVO, BankVO bankVO,
			long accountNumber, String typeOfAccount, String ifsc, String branch, boolean approvedStatus,
			String reason) {
		super();
		this.schemeApplicantId = schemeApplicantId;
		this.schemeVO = schemeVO;
		this.citizenVO = citizenVO;
		this.bankVO = bankVO;
		this.accountNumber = accountNumber;
		TypeOfAccount = typeOfAccount;
		this.ifsc = ifsc;
		this.branch = branch;
		this.approvedStatus = approvedStatus;
		this.reason = reason;
	}
	public long getSchemeApplicantId() {
		return schemeApplicantId;
	}
	public void setSchemeApplicantId(long schemeApplicantId) {
		this.schemeApplicantId = schemeApplicantId;
	}
	public SchemeVO getSchemeVO() {
		return schemeVO;
	}
	public void setSchemeVO(SchemeVO schemeVO) {
		this.schemeVO = schemeVO;
	}
	public CitizenVO getCitizenVO() {
		return citizenVO;
	}
	public void setCitizenVO(CitizenVO citizenVO) {
		this.citizenVO = citizenVO;
	}
	public BankVO getBankVO() {
		return bankVO;
	}
	public void setBankVO(BankVO bankVO) {
		this.bankVO = bankVO;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getTypeOfAccount() {
		return TypeOfAccount;
	}
	public void setTypeOfAccount(String typeOfAccount) {
		TypeOfAccount = typeOfAccount;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public boolean isApprovedStatus() {
		return approvedStatus;
	}
	public void setApprovedStatus(boolean approvedStatus) {
		this.approvedStatus = approvedStatus;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "SchemeApplicantVO [schemeApplicantId=" + schemeApplicantId + ", schemeVO=" + schemeVO + ", citizenVO="
				+ citizenVO + ", bankVO=" + bankVO + ", accountNumber=" + accountNumber + ", TypeOfAccount="
				+ TypeOfAccount + ", ifsc=" + ifsc + ", branch=" + branch + ", approvedStatus=" + approvedStatus
				+ ", reason=" + reason + "]";
	}
	
}
