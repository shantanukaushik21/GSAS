package com.gsas.service;

import com.gsas.dao.CitizenDao;
import com.gsas.model.CitizenDetailsVO;
import com.gsas.utility.CitizenFactory;
import com.gsas.utility.LayerType;

public class CitizenServiceImpl implements CitizenService {

	private CitizenDao dao = null;
	
	public CitizenServiceImpl() {
		dao = (CitizenDao) CitizenFactory.getInstance(LayerType.DAO);
	}
	
	@Override
	public void storeCitizenService(CitizenDetailsVO citizen) {
		dao.storeCitizen(citizen);
	}
	
}
