package com.gsas.dao;

import com.gsas.model.SchemeVO;

public interface SchemeDao {
	public void storeScheme(SchemeVO scheme);
	public void editScheme(SchemeVO scheme);
	public SchemeVO getSchemeDetails(Long schemeId);
	public SchemeVO[] getAllScheme();
}
