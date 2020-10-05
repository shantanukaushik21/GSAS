package com.gsas.model;

import java.time.LocalDate;

public class CitizenDetailsVO {
	
	private long citizenDetailsId;
	private String firstName;
	private String middleName;
	private String LastName;
	private LocalDate dateOfBirth;
	private String gender;
	private String email;
	private long phone;
	private AddressVO addressVO;
	private String incomeGroup;
	private String profession;
	private long adharNumber;
	private String pancardNumber;
	private LoginVO loginVO;
	
	public CitizenDetailsVO() {
		super();
	}

	public CitizenDetailsVO(long citizenDetailsId, String firstName, String middleName, String lastName,
			LocalDate dateOfBirth, String gender, String email, long phone, AddressVO addressVO, String incomeGroup,
			String profession, long adharNumber, String pancardNumber, LoginVO loginVO) {
		super();
		this.citizenDetailsId = citizenDetailsId;
		this.firstName = firstName;
		this.middleName = middleName;
		LastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.addressVO = addressVO;
		this.incomeGroup = incomeGroup;
		this.profession = profession;
		this.adharNumber = adharNumber;
		this.pancardNumber = pancardNumber;
		this.loginVO = loginVO;
	}

	public long getCitizenDetailsId() {
		return citizenDetailsId;
	}

	public void setCitizenDetailsId(long citizenDetailsId) {
		this.citizenDetailsId = citizenDetailsId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public AddressVO getAddressVO() {
		return addressVO;
	}

	public void setAddressVO(AddressVO addressVO) {
		this.addressVO = addressVO;
	}

	public String getIncomeGroup() {
		return incomeGroup;
	}

	public void setIncomeGroup(String incomeGroup) {
		this.incomeGroup = incomeGroup;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public long getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(long adharNumber) {
		this.adharNumber = adharNumber;
	}

	public String getPancardNumber() {
		return pancardNumber;
	}

	public void setPancardNumber(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

	public LoginVO getCitizenVO() {
		return loginVO;
	}

	public void setCitizenVO(LoginVO loginVO) {
		this.loginVO = loginVO;
	}

	@Override
	public String toString() {
		return "CitizenDetailsVO [citizenDetailsId=" + citizenDetailsId + ", firstName=" + firstName + ", middleName="
				+ middleName + ", LastName=" + LastName + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender
				+ ", email=" + email + ", phone=" + phone + ", addressVO=" + addressVO + ", incomeGroup=" + incomeGroup
				+ ", profession=" + profession + ", adharNumber=" + adharNumber + ", pancardNumber=" + pancardNumber
				+ ", loginVO=" + loginVO + "]";
	}


	
}
