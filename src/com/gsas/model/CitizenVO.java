package com.gsas.model;

public class CitizenVO {
	
	private long citizenId;
	private String userName;
	private String password;
	
	public CitizenVO() {
		super();
	}

	public CitizenVO(long citizenId, String userName, String password) {
		super();
		this.citizenId = citizenId;
		this.userName = userName;
		this.password = password;
	}

	public long getCitizenId() {
		return citizenId;
	}

	public void setCitizenId(long citizenId) {
		this.citizenId = citizenId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "CitizenVO [citizenId=" + citizenId + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
}
