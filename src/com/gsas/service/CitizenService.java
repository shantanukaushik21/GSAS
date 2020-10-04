package com.gsas.service;

import com.gsas.exception.AuthenticationException;
import com.gsas.exception.CitizenNotFoundException;
import com.gsas.model.CitizenDetailsVO;
import com.gsas.model.CitizenVO;

public interface CitizenService {
	public void registerCitizen(CitizenDetailsVO citizenDetailsVO);
	public CitizenVO Authenticate(String userName,String password) throws AuthenticationException;
	public CitizenDetailsVO getCitizenDetails(long citizenId) throws CitizenNotFoundException;
	public void updateCitizenDetails(CitizenDetailsVO citizenDetailsVO);
}
