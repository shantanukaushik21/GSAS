package com.gsas.utility;

import com.gsas.dao.CitizenDaoImpl;
import com.gsas.service.CitizenServiceImpl;

public class CitizenFactory {

	public static Object getInstance(LayerType type) {
		
		switch(type) {
		case DAO : return new CitizenDaoImpl();
		case SERVICE : return new CitizenServiceImpl();
		}
		return null;
	}

}
