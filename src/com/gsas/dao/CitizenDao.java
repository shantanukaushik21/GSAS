package com.gsas.dao;

import com.gsas.exception.AuthenticationException;
import com.gsas.exception.CitizenNotFoundException;
import com.gsas.model.CitizenDetailsVO;
import com.gsas.model.CitizenVO;

public interface CitizenDao {
	
	public void registerCitizen(CitizenDetailsVO citizenDetailsVO);
	public CitizenVO Authenticate(String userName,String password) throws AuthenticationException;
	public CitizenDetailsVO getCitizenDetails(long citizenId) throws CitizenNotFoundException;
	public void updateCitizenDetails(CitizenDetailsVO citizenDetailsVO);

}
