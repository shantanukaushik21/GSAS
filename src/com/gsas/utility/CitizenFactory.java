package com.gsas.utility;

import com.gsas.dao.CitizenDaoImpl;
import com.gsas.service.CitizenServiceImpl;

public class CitizenFactory {

	public static Object getInstance(String type) {
		
		if(type.equals("dao"))
			return new CitizenDaoImpl();
		else if(type.equals("service"))
			return new CitizenServiceImpl();
		return null;
	}

}
