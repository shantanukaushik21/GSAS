package com.gsas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gsas.model.SchemeVO;
import com.gsas.utility.DBUtility;

public class SchemeDaoImpl implements SchemeDao{

	@Override
	public void storeScheme(SchemeVO scheme) {
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement sequenceStatement = connection.prepareStatement("values(next value for scheme_seq)");
			ResultSet rs = sequenceStatement.executeQuery();
			long seq = 0;
			if(rs.next()) {
				seq = rs.getLong(1);
			} 
			if(seq == 0) {
				//Need to throw an error
				System.out.println("Error in sequence number");
			}
			//Add into the profession table
			PreparedStatement preparedStatement = connection.prepareStatement("insert into profession values(?,?)");
			preparedStatement.setLong(1,scheme.getSchemeEligibilityVO().getProfessionVO().getProfessionId());//profession id
			preparedStatement.setString(2, scheme.getSchemeEligibilityVO().getProfessionVO().getProfessionName());
			preparedStatement.executeUpdate();
			
			//Add into Income group
			preparedStatement = connection.prepareStatement("insert into income_group values(?,?)");
			preparedStatement.setLong(1, scheme.getSchemeEligibilityVO().getIncomeGroupVO().getIncomeGroupId());//Income group ID
			preparedStatement.setString(2, scheme.getSchemeEligibilityVO().getIncomeGroupVO().getIncomeGroupName());
			preparedStatement.executeUpdate();
			
			//Add into eligibility table
			preparedStatement = connection.prepareStatement("insert into scheme_eligibility values(?,?,?,?,?,?)");
			preparedStatement.setLong(1, x);//scheme eligibility ID
			preparedStatement.setInt(2, scheme.getSchemeEligibilityVO().getMinAge());
			preparedStatement.setInt(3, scheme.getSchemeEligibilityVO().getMinAge());
			preparedStatement.setLong(4, x);//income_group_ref
			preparedStatement.setString(5, scheme.getSchemeEligibilityVO().getGender());
			preparedStatement.setLong(6, x);//profession_ref
			preparedStatement.executeUpdate();
			
			//Add into Ministry
			preparedStatement = connection.prepareStatement("insert into ministry values(?,?)");
			preparedStatement.setLong(1, x);//ministry ID
			preparedStatement.setString(2, scheme.getMinistryVO().getMinistryName());
			preparedStatement.executeUpdate();
			
			//Add into Sector
			preparedStatement = connection.prepareStatement("insert into sector values(?,?)");
			preparedStatement.setLong(1, x);//sector ID
			preparedStatement.setString(2, scheme.getSectorVO().getSectorName());
			preparedStatement.executeUpdate();
			
			//Add into Scheme Table
			preparedStatement = connection.prepareStatement("insert into scheme values(?,?,?,?,?,?,?,?,?,?)");
			preparedStatement.setLong(1, seq);//scheme id
			preparedStatement.setString(2, scheme.getName());
			preparedStatement.setString(3, scheme.getSummary());
			preparedStatement.setString(4, scheme.getDescription());
			preparedStatement.setString(5, scheme.getImagePath());
			preparedStatement.setLong(6, x);//ministry ref
			preparedStatement.setLong(7, x);//sector ref
			preparedStatement.setDate(8, java.sql.Date.valueOf(scheme.getStartDate());
			preparedStatement.setLong(9, x);//scheme Eligibility ref
			preparedStatement.setBoolean(10, scheme.isStatus());
			preparedStatement.executeUpdate();
			preparedStatement.close();
			connection.close();

		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
