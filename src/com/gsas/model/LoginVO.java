package com.gsas.model;

public class LoginVO {
	
	private long citizenId;
	private String userName;
	private String password;
	private boolean isEmployee;
	
	public LoginVO() {
		super();
	}
	public LoginVO(long citizenId, String userName, String password, boolean isEmployee) {
		super();
		this.citizenId = citizenId;
		this.userName = userName;
		this.password = password;
		this.isEmployee = isEmployee;
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
	public boolean isEmployee() {
		return isEmployee;
	}
	public void setEmployee(boolean isEmployee) {
		this.isEmployee = isEmployee;
	}
	@Override
	public String toString() {
		return "CitizenVO [citizenId=" + citizenId + ", userName=" + userName + ", password=" + password
				+ ", isEmployee=" + isEmployee + "]";
	}

	
}
