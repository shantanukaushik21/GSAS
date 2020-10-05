package com.gsas.model;

public class SectorVO {
	
	private long sectorId;
	private String sectorName;
	public SectorVO() {
		super();
	}
	public SectorVO(long sectorId, String sectorName) {
		super();
		this.sectorId = sectorId;
		this.sectorName = sectorName;
	}
	public long getSectorId() {
		return sectorId;
	}
	public void setSectorId(long sectorId) {
		this.sectorId = sectorId;
	}
	public String getSectorName() {
		return sectorName;
	}
	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}
	@Override
	public String toString() {
		return "SectorVO [sectorId=" + sectorId + ", sectorName=" + sectorName + "]";
	}
	
	
}
