package com.gsas.service;

import com.gsas.dao.CitizenDao;
import com.gsas.exception.AuthenticationException;
import com.gsas.exception.CitizenNotFoundException;
import com.gsas.model.CitizenDetailsVO;
import com.gsas.model.CitizenVO;
import com.gsas.utility.CitizenFactory;

public class CitizenServiceImpl implements CitizenService {
	private CitizenDao citizenDao = null;
	
	
	public CitizenServiceImpl() {
		citizenDao = (CitizenDao) CitizenFactory.getInstance("dao");
	}

	@Override
	public CitizenVO Authenticate(String userName, String password) throws AuthenticationException {
		CitizenVO citizenVO = citizenDao.Authenticate(userName, password);
		if(citizenVO == null) {
			throw new AuthenticationException("Sorry something went wrong");
		}
		return citizenVO;
	}

	@Override
	public CitizenDetailsVO getCitizenDetails(long citizenId) throws CitizenNotFoundException {
		CitizenDetailsVO citizenDetailsVO = citizenDao.getCitizenDetails(citizenId);
		if(citizenDetailsVO == null) {
			throw new CitizenNotFoundException("Sorry something went wrong");
		}
		return citizenDetailsVO;
	}

	@Override
	public void updateCitizenDetails(CitizenDetailsVO citizenDetailsVO) {
		citizenDao.updateCitizenDetails(citizenDetailsVO);
	}

}
