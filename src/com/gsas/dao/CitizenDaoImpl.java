package com.gsas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gsas.model.CitizenDetailsVO;
import com.gsas.utility.DBUtility;

public class CitizenDaoImpl implements CitizenDao {

	@Override
	public void storeCitizen(CitizenDetailsVO citizen) {
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement sequenceStatement = connection.prepareStatement("values(next value for citizen_seq)");
			ResultSet rs = sequenceStatement.executeQuery();
			long seq = 0;
			if(rs.next()) {
				seq = rs.getLong(1);
			} 
			if(seq == 0) {
				//Need to throw an error
				System.out.println("Error in sequence number");
			}
			//citizen_credential
			PreparedStatement preparedStatement = connection.prepareStatement("insert into citizen_credential values(?,?,?)");
			preparedStatement.setLong(1, seq);
			preparedStatement.setString(2, citizen.getCitizenVO().getUserName());
			preparedStatement.setString(3, citizen.getCitizenVO().getPassword());
			preparedStatement.executeUpdate();
			
			//citizen_address
			preparedStatement = connection.prepareStatement("insert into citizen_address values(?,?,?,?,?)");
			preparedStatement.setLong(1, seq);
			preparedStatement.setString(2, citizen.getAddressVO().getStreet());
			preparedStatement.setString(3, citizen.getAddressVO().getCity());
			preparedStatement.setString(4, citizen.getAddressVO().getState());
			preparedStatement.setInt(5, citizen.getAddressVO().getPincode());
			preparedStatement.executeUpdate();
			
			//citizen_details
			preparedStatement = 
					connection.prepareStatement("insert into citizen_details values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			preparedStatement.setLong(1, seq);
			preparedStatement.setString(2, citizen.getFirstName());
			preparedStatement.setString(3, citizen.getMiddleName());
			preparedStatement.setString(4, citizen.getLastName());
			preparedStatement.setDate(5, java.sql.Date.valueOf(citizen.getDateOfBirth()));
			preparedStatement.setString(6, citizen.getGender());
			preparedStatement.setString(7, citizen.getEmail());
			preparedStatement.setLong(8, citizen.getPhone());
			preparedStatement.setLong(9, seq); //address_ref FK (citizen_address)
			preparedStatement.setString(10, citizen.getIncome());
			preparedStatement.setString(11, citizen.getProfession());
			preparedStatement.setLong(12, citizen.getAdharNumber());
			preparedStatement.setString(13, citizen.getPancardNumber());
			preparedStatement.setLong(14, seq); //citizen_ref FK (citizen_credential)
			preparedStatement.executeUpdate();
			preparedStatement.close();
			connection.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
