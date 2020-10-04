package com.gsas.model;

public class SchemeEligibilityVO {
	
	private long schemeEligibilityId;
	private int minAge;
	private int maxAge;
	private IncomeGroupVO incomeGroupVO;
	private String gender;
	private ProfessionVO professionVO;
	public SchemeEligibilityVO() {
		super();
	}
	public SchemeEligibilityVO(long schemeEligibilityId, int minAge, int maxAge, IncomeGroupVO incomeGroupVO,
			String gender, ProfessionVO professionVO) {
		super();
		this.schemeEligibilityId = schemeEligibilityId;
		this.minAge = minAge;
		this.maxAge = maxAge;
		this.incomeGroupVO = incomeGroupVO;
		this.gender = gender;
		this.professionVO = professionVO;
	}
	public long getSchemeEligibilityId() {
		return schemeEligibilityId;
	}
	public void setSchemeEligibilityId(long schemeEligibilityId) {
		this.schemeEligibilityId = schemeEligibilityId;
	}
	public int getMinAge() {
		return minAge;
	}
	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}
	public int getMaxAge() {
		return maxAge;
	}
	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}
	public IncomeGroupVO getIncomeGroupVO() {
		return incomeGroupVO;
	}
	public void setIncomeGroupVO(IncomeGroupVO incomeGroupVO) {
		this.incomeGroupVO = incomeGroupVO;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public ProfessionVO getProfessionVO() {
		return professionVO;
	}
	public void setProfessionVO(ProfessionVO professionVO) {
		this.professionVO = professionVO;
	}
	@Override
	public String toString() {
		return "SchemeEligibilityVO [schemeEligibilityId=" + schemeEligibilityId + ", minAge=" + minAge + ", maxAge="
				+ maxAge + ", incomeGroupVO=" + incomeGroupVO + ", gender=" + gender + ", professionVO=" + professionVO
				+ "]";
	}
	
}
