package com.gsas.model;

import java.time.LocalDate;

public class SchemeVO {
	
	private long schemeId;
	private String summary;
	private String description;
	private String imagePath;
	private MinistryVO ministryVO;
	private SectorVO sectorVO;
	private LocalDate startDate;
	private SchemeEligibilityVO schemeEligibilityVO;
	private boolean status;
	public SchemeVO() {
		super();
	}
	public SchemeVO(long schemeId, String summary, String description, String imagePath, MinistryVO ministryVO,
			SectorVO sectorVO, LocalDate startDate, SchemeEligibilityVO schemeEligibilityVO, boolean status) {
		super();
		this.schemeId = schemeId;
		this.summary = summary;
		this.description = description;
		this.imagePath = imagePath;
		this.ministryVO = ministryVO;
		this.sectorVO = sectorVO;
		this.startDate = startDate;
		this.schemeEligibilityVO = schemeEligibilityVO;
		this.status = status;
	}
	public long getSchemeId() {
		return schemeId;
	}
	public void setSchemeId(long schemeId) {
		this.schemeId = schemeId;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public MinistryVO getMinistryVO() {
		return ministryVO;
	}
	public void setMinistryVO(MinistryVO ministryVO) {
		this.ministryVO = ministryVO;
	}
	public SectorVO getSectorVO() {
		return sectorVO;
	}
	public void setSectorVO(SectorVO sectorVO) {
		this.sectorVO = sectorVO;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public SchemeEligibilityVO getSchemeEligibilityVO() {
		return schemeEligibilityVO;
	}
	public void setSchemeEligibilityVO(SchemeEligibilityVO schemeEligibilityVO) {
		this.schemeEligibilityVO = schemeEligibilityVO;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "SchemeVO [schemeId=" + schemeId + ", summary=" + summary + ", description=" + description
				+ ", imagePath=" + imagePath + ", ministryVO=" + ministryVO + ", sectorVO=" + sectorVO + ", startDate="
				+ startDate + ", schemeEligibilityVO=" + schemeEligibilityVO + ", status=" + status + "]";
	}
	
}
