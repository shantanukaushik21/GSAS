package com.gsas.service;

import com.gsas.dao.CitizenDao;
import com.gsas.exception.AuthenticationException;
import com.gsas.exception.CitizenNotFoundException;
import com.gsas.model.CitizenDetailsVO;
import com.gsas.model.LoginVO;
import com.gsas.utility.CitizenFactory;
import com.gsas.utility.LayerType;

public class CitizenServiceImpl implements CitizenService {
	private CitizenDao citizenDao = null;
	
	
	public CitizenServiceImpl() {
		citizenDao = (CitizenDao) CitizenFactory.getInstance(LayerType.DAO);
	}

	@Override
	public void registerCitizen(CitizenDetailsVO citizenDetailsVO) {
		citizenDao.registerCitizen(citizenDetailsVO);
	}
	
	@Override
	public LoginVO Authenticate(String userName, String password) throws AuthenticationException {
		LoginVO loginVO = citizenDao.Authenticate(userName, password);
		if(loginVO == null) {
			throw new AuthenticationException("Sorry something went wrong");
		}
		return loginVO;
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
