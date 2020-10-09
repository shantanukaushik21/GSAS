package com.gsas.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.gsas.model.BankVO;
import com.gsas.model.CitizenDetailsVO;
import com.gsas.model.DocumentVO;
import com.gsas.model.LoginVO;
import com.gsas.model.SchemeApplicantDocumentsVO;
import com.gsas.model.SchemeApplicantVO;
import com.gsas.model.SchemeEligibilityVO;
import com.gsas.model.SchemeVO;
import com.gsas.service.CitizenService;
import com.gsas.service.SchemeService;
import com.gsas.utility.LayerType;
import com.gsas.utility.ObjectFactory;



/**
 * Servlet implementation class ApplySchemeServlet
 */
@WebServlet("/ApplySchemeServlet")
public class ApplySchemeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ApplySchemeServlet() {
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				
				SchemeService schemeService = (SchemeService) ObjectFactory.getInstance(LayerType.SCHEME_SERVICE);
				CitizenService citizenService = (CitizenService) ObjectFactory.getInstance(LayerType.CITIZEN_SERVICE);
				HttpSession session = request.getSession();
				RequestDispatcher requestDispatcher = null;
				
				LoginVO loginVO = (LoginVO) session.getAttribute("citizenVO");
				if(loginVO != null) {
					
					SchemeApplicantDocumentsVO schemeApplicantDocuments = null;
					SchemeApplicantVO schemeApplicant = new SchemeApplicantVO();
					SchemeEligibilityVO citizenEligibilityDetails = new SchemeEligibilityVO();
					SchemeVO schemeVO = schemeService.getSchemeDetails(Long.parseLong(request.getParameter("schemeId"))); // get scheme from schemeID
					SchemeEligibilityVO schemeEligibilityVO = schemeVO.getSchemeEligibilityVO(); //get Eligibility of that scheme
					CitizenDetailsVO citizenDetails = citizenService.getCitizenDetails(loginVO.getLoginId()); //get citizenDetails from citizenId
					
				
							
					//creating object for eligibility details of citizen
					String gender = request.getParameter("gender").trim(); // set gender from the form 
					int age = request.getParameter("age");// get age from form
					List<SchemeApplicantDocumentsVO> documents = (List<SchemeApplicantDocumentsVO>)request.getParameter("List");
					BankVO bank = new BankVO(request.getParameter("bank").trim());// get the bank the citizen uses 
					Boolean status = schemeService.validate(schemeEligibilityVO, citizenDetails, gender, age);
					
					//schemeApplicant Object
					schemeApplicant.setSchemeVO(schemeVO);
					schemeApplicant.setLoginVO(loginVO);
					schemeApplicant.setBankVO(bank);
					schemeApplicant.setAccountNumber(request.getParameter("account_number"));
					schemeApplicant.setTypeOfAccount(request.getParameter("type_of_account"));
					schemeApplicant.setIfsc(request.getParameter("ifsc"));
					schemeApplicant.setBranch(request.getParameter("branch"));
					schemeApplicant.setApplicantDocumentsList(documents);
					schemeApplicant.setApprovedStatus(status);
					schemeApplicant.setReason("Your request is processing.");
					
					if(status == true) {
						schemeApplicantDocuments = new SchemeApplicantDocumentsVO();
						List<SchemeApplicantDocumentsVO> docList = new ArrayList<>();
						for(SchemeApplicantDocumentsVO items : documents) {			// traverse document list
						schemeApplicantDocuments.setDocumentVO(new DocumentVO(Long.parseLong(request.getParameter("docId"))));
						schemeApplicantDocuments.setDocumentPath(request.getParameter("docPath"));
						docList.add(schemeApplicantDocuments);
						}
						schemeApplicant = schemeService.validate(schemeVO, bank, docList, schemeApplicant);
						if(schemeApplicant.isApprovedStatus()){   //check if status = true after doc and bank validation.
							schemeService.addSchemeApplication(schemeApplicant, docList); // fill scheme_applicant table with status=true
						} //and add document path in scheme_applicant_document table
						else {
							schemeService.addSchemeApplication(schemeApplicant);

						}
					}
					else {
						schemeApplicant.setReason("Sorry! You are not eligible for this scheme.");
						schemeService.addSchemeApplication(schemeApplicant);

					}
					requestDispatcher = request.getRequestDispatcher("ApplySchemes.jsp");
					request.setAttribute("err",schemeApplicant.getReason());
					requestDispatcher.forward(request, response);		
				}
				
				else {
					requestDispatcher = request.getRequestDispatcher("citizenLogin.jsp");
					request.setAttribute("err","Sorry, You are not Authorized to view this Page");
					requestDispatcher.forward(request, response);
				
				}

	}

}
