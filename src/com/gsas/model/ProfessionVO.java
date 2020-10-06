package com.gsas.model;

public class ProfessionVO {
	
	private long professionId;
	private String professionName;
	public ProfessionVO() {
		super();
	}
	public ProfessionVO(long professionId, String professionName) {
		super();
		this.professionId = professionId;
		this.professionName = professionName;
	}
	public long getProfessionId() {
		return professionId;
	}
	public void setProfessionId(long professionId) {
		this.professionId = professionId;
	}
	public String getProfessionName() {
		return professionName;
	}
	public void setProfessionName(String professionName) {
		this.professionName = professionName;
	}
	@Override
	public String toString() {
		return "ProfessionVO [professionId=" + professionId + ", professionName=" + professionName + "]";
	}
	
}
