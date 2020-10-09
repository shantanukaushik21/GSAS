package com.gsas.service;

import java.util.List;


import com.gsas.dao.SchemeDao;
import com.gsas.exception.DatabaseException;
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
	public void addScheme(SchemeVO scheme) throws DatabaseException {
		schemeDao.addScheme(scheme);

	}

	@Override
	public void updateScheme(SchemeVO scheme) throws DatabaseException {
		schemeDao.editScheme(scheme);

	}

	@Override
	public SchemeVO getSchemeDetails(Long schemeId) throws SchemeNotFoundException, DatabaseException {
		// TODO Auto-generated method stub
		SchemeVO schemeVO;
		try {
			schemeVO = schemeDao.getSchemeDetails(schemeId);
		} catch (SchemeNotFoundException e) {
			throw new SchemeNotFoundException(e.getMessage());
		} catch (DatabaseException e) {
			throw new DatabaseException(e.getMessage());
		}
		if(schemeVO == null)
			throw new SchemeNotFoundException("Sorry Something went wrong");
		return schemeVO;
	}

	@Override
	public List<SchemeVO> getAllScheme() throws SchemeNotFoundException, DatabaseException {
		// TODO Auto-generated method stub
		List<SchemeVO> schemeList;
		try {
			schemeList = schemeDao.getAllScheme();
		} catch (SchemeNotFoundException e) {
			throw new SchemeNotFoundException(e.getMessage());
		} catch (DatabaseException e) {
			throw new DatabaseException(e.getMessage());
		}
		return schemeList;
	}

}
