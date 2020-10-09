package com.gsas.service;

import java.util.List;

import com.gsas.exception.DatabaseException;
import com.gsas.exception.SchemeNotFoundException;
import com.gsas.model.SchemeVO;

public interface SchemeService {
	
	public void addScheme(SchemeVO scheme) throws DatabaseException;
	public void updateScheme(SchemeVO scheme) throws DatabaseException;
	public SchemeVO getSchemeDetails(Long schemeId) throws SchemeNotFoundException, DatabaseException;
	public List<SchemeVO> getAllScheme() throws SchemeNotFoundException, DatabaseException;

}
