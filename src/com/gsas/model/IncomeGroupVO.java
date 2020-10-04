package com.gsas.model;

public class IncomeGroupVO {
	
	private long incomeGroupId;
	private String incomeGroupName;
	public IncomeGroupVO() {
		super();
	}
	public IncomeGroupVO(long incomeGroupId, String incomeGroupName) {
		super();
		this.incomeGroupId = incomeGroupId;
		this.incomeGroupName = incomeGroupName;
	}
	public long getIncomeGroupId() {
		return incomeGroupId;
	}
	public void setIncomeGroupId(long incomeGroupId) {
		this.incomeGroupId = incomeGroupId;
	}
	public String getIncomeGroupName() {
		return incomeGroupName;
	}
	public void setIncomeGroupName(String incomeGroupName) {
		this.incomeGroupName = incomeGroupName;
	}
	@Override
	public String toString() {
		return "IncomeGroupVO [incomeGroupId=" + incomeGroupId + ", incomeGroupName=" + incomeGroupName + "]";
	}
	
}
