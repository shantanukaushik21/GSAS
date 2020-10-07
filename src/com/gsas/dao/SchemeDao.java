package com.gsas.dao;

import java.util.List;

import com.gsas.exception.SchemeNotFoundException;
import com.gsas.model.SchemeVO;

public interface SchemeDao {
	public void storeScheme(SchemeVO scheme);
	public void editScheme(SchemeVO scheme);
	public SchemeVO getSchemeDetails(Long schemeId) throws SchemeNotFoundException;
	public List<SchemeVO> getAllScheme();
}
