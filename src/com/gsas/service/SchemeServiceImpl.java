package com.gsas.service;

import java.util.List;

import com.gsas.dao.SchemeDao;
import com.gsas.exception.SchemeNotFoundException;
import com.gsas.model.SchemeVO;
import com.gsas.utility.LayerType;
import com.gsas.utility.ObjectFactory;

public class SchemeServiceImpl implements SchemeService {
	private SchemeDao schemeDao = null;
	
	public SchemeServiceImpl() {
		schemeDao = (SchemeDao) ObjectFactory.getInstance(LayerType.SCHEME_DAO);
		
	}

	@Override
	public void storeScheme(SchemeVO scheme) {
		// TODO Auto-generated method stub
		schemeDao.storeScheme(scheme);

	}

	@Override
	public void editScheme(SchemeVO scheme) {
		// TODO Auto-generated method stub
		schemeDao.editScheme(scheme);

	}

	@Override
	public SchemeVO getSchemeDetails(Long schemeId) throws SchemeNotFoundException {
		// TODO Auto-generated method stub
		SchemeVO schemeVO = schemeDao.getSchemeDetails(schemeId);
		if(schemeVO == null)
			throw new SchemeNotFoundException("Sorry Something went wrong");
		return schemeVO;
	}

	@Override
	public List<SchemeVO> getAllScheme() {
		// TODO Auto-generated method stub
		List<SchemeVO> schemeList = schemeDao.getAllScheme();
		return schemeList;
	}

}
