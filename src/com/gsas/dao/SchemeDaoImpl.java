package com.gsas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.gsas.model.BankVO;
import com.gsas.model.DocumentVO;
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
//			//Add into the profession table
//			PreparedStatement preparedStatement = connection.prepareStatement("insert into profession values(?,?)");
//			preparedStatement.setLong(1,scheme.getSchemeEligibilityVO().getProfessionVO().getProfessionId());//profession id
//			preparedStatement.setString(2, scheme.getSchemeEligibilityVO().getProfessionVO().getProfessionName());
//			preparedStatement.executeUpdate();
//			
//			//Add into Income group
//			preparedStatement = connection.prepareStatement("insert into income_group values(?,?)");
//			preparedStatement.setLong(1, scheme.getSchemeEligibilityVO().getIncomeGroupVO().getIncomeGroupId());//Income group ID
//			preparedStatement.setString(2, scheme.getSchemeEligibilityVO().getIncomeGroupVO().getIncomeGroupName());
//			preparedStatement.executeUpdate();
//			
			//Add into eligibility table
			PreparedStatement preparedStatement = connection.prepareStatement("insert into scheme_eligibility values(?,?,?,?,?,?)");
			preparedStatement.setLong(1, seq);//scheme eligibility ID
			preparedStatement.setInt(2, scheme.getSchemeEligibilityVO().getMaxAge());
			preparedStatement.setInt(3, scheme.getSchemeEligibilityVO().getMinAge());
			preparedStatement.setLong(4, scheme.getSchemeEligibilityVO().getIncomeGroupVO().getIncomeGroupId());//income_group_ref
			preparedStatement.setString(5, scheme.getSchemeEligibilityVO().getGender());
			preparedStatement.setLong(6, scheme.getSchemeEligibilityVO().getProfessionVO().getProfessionId());//profession_ref
			preparedStatement.executeUpdate();
			
//			//Add into Ministry
//			preparedStatement = connection.prepareStatement("insert into ministry values(?,?)");
//			preparedStatement.setLong(1, x);//ministry ID
//			preparedStatement.setString(2, scheme.getMinistryVO().getMinistryName());
//			preparedStatement.executeUpdate();
//			
//			//Add into Sector
//			preparedStatement = connection.prepareStatement("insert into sector values(?,?)");
//			preparedStatement.setLong(1, x);//sector ID
//			preparedStatement.setString(2, scheme.getSectorVO().getSectorName());
//			preparedStatement.executeUpdate();
			
			//Add into Scheme Table
			preparedStatement = connection.prepareStatement("insert into scheme values(?,?,?,?,?,?,?,?,?,?)");
			preparedStatement.setLong(1, seq);//scheme id
			preparedStatement.setString(2, scheme.getSchemeName());
			preparedStatement.setString(3, scheme.getSummary());
			preparedStatement.setString(4, scheme.getDescription());
			preparedStatement.setString(5, scheme.getImagePath());
			preparedStatement.setLong(6, scheme.getMinistryVO().getMinistryId());//ministry ref
			preparedStatement.setLong(7, scheme.getSectorVO().getSectorId());//sector ref
			preparedStatement.setDate(8, java.sql.Date.valueOf(scheme.getStartDate()));
			preparedStatement.setLong(9, scheme.getSchemeEligibilityVO().getSchemeEligibilityId());//scheme Eligibility ref
			preparedStatement.setBoolean(10, scheme.isStatus());
			preparedStatement.executeUpdate();
			
			
			
			List<DocumentVO> docList=scheme.getDocumentList();
			for(DocumentVO doc : docList ) {
				preparedStatement = connection.prepareStatement("insert into scheme_documents values(?,?,?)");
				preparedStatement.setLong(1, seq);
				preparedStatement.setLong(2, scheme.getSchemeId());
				preparedStatement.setLong(3, doc.getDocumentId());
				preparedStatement.executeUpdate();
			}
			List<BankVO> bankList=scheme.getBankList();
			for(BankVO bank : bankList) {
				preparedStatement = connection.prepareStatement("insert into scheme_banks values(?,?,?)");
				preparedStatement.setLong(1, seq);
				preparedStatement.setLong(2, scheme.getSchemeId());
				preparedStatement.setLong(3, bank.getBankId());
				preparedStatement.executeUpdate();
			}
			
			
			preparedStatement.close();
			connection.close();

		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void editScheme(SchemeVO scheme) {
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("update scheme_eligibility set min_age=?, max_age=?, income_group_ref=?, gender=?, profession_ref=? where scheme_eligibility_id=?");
			preparedStatement.setInt(1, scheme.getSchemeEligibilityVO().getMinAge());
			preparedStatement.setInt(2, scheme.getSchemeEligibilityVO().getMaxAge());
			preparedStatement.setLong(3, scheme.getSchemeEligibilityVO().getIncomeGroupVO().getIncomeGroupId());
			preparedStatement.setString(4, scheme.getSchemeEligibilityVO().getGender());
			preparedStatement.setLong(5, scheme.getSchemeEligibilityVO().getProfessionVO().getProfessionId());
			preparedStatement.setLong(6, scheme.getSchemeId());
			
			preparedStatement = connection.prepareStatement("update scheme set name=?, summary=?, description=?, image_path=?, ministry_ref=?, sector_ref=?, start_date=?, scheme_eligibility_ref=?, status=? where scheme_id=?");
			preparedStatement.setString(1, scheme.getSchemeName());
			preparedStatement.setString(2, scheme.getSummary());
			preparedStatement.setString(3, scheme.getDescription());
			preparedStatement.setString(4, scheme.getImagePath());
			preparedStatement.setLong(5, scheme.getMinistryVO().getMinistryId());
			preparedStatement.setLong(6, scheme.getSectorVO().getSectorId());
			preparedStatement.setDate(7, java.sql.Date.valueOf(scheme.getStartDate()));
			preparedStatement.setLong(8, scheme.getSchemeEligibilityVO().getSchemeEligibilityId());
			preparedStatement.setBoolean(9, scheme.isStatus());
			preparedStatement.setLong(10, scheme.getSchemeId());
			preparedStatement.executeUpdate();
			
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
			
			preparedStatement = connection.prepareStatement("delete FROM scheme_documents_id where scheme_ref=?");
			preparedStatement.setLong(1, scheme.getSchemeId());
			preparedStatement.executeUpdate();
			
			List<DocumentVO> docList=scheme.getDocumentList();
			for(DocumentVO doc : docList ) {
				preparedStatement = connection.prepareStatement("insert into scheme_documents values(?,?,?)");
				preparedStatement.setLong(1, seq);
				preparedStatement.setLong(2, scheme.getSchemeId());
				preparedStatement.setLong(3, doc.getDocumentId());
				preparedStatement.executeUpdate();
			}
			
			preparedStatement = connection.prepareStatement("delete FROM scheme_bank where scheme_ref=?");
			preparedStatement.setLong(1, scheme.getSchemeId());
			preparedStatement.executeUpdate();
			
			List<BankVO> bankList=scheme.getBankList();
			for(BankVO bank : bankList) {
				preparedStatement = connection.prepareStatement("insert into scheme_banks values(?,?,?)");
				preparedStatement.setLong(1, seq);
				preparedStatement.setLong(2, scheme.getSchemeId());
				preparedStatement.setLong(3, bank.getBankId());
				preparedStatement.executeUpdate();
			}
			
			
			preparedStatement.close();
			connection.close();
			
			
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public SchemeVO getSchemeDetails(Long schemeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SchemeVO[] getAllScheme() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
