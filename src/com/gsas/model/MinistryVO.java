package com.gsas.model;

public class MinistryVO {
	
	private long ministryId;
	private String ministryName;
	public MinistryVO() {
		super();
	}
	public MinistryVO(long ministryId, String ministryName) {
		super();
		this.ministryId = ministryId;
		this.ministryName = ministryName;
	}
	public long getMinistryId() {
		return ministryId;
	}
	public void setMinistryId(long ministryId) {
		this.ministryId = ministryId;
	}
	public String getMinistryName() {
		return ministryName;
	}
	public void setMinistryName(String ministryName) {
		this.ministryName = ministryName;
	}
	@Override
	public String toString() {
		return "MinistryVO [ministryId=" + ministryId + ", ministryName=" + ministryName + "]";
	}
	
}
