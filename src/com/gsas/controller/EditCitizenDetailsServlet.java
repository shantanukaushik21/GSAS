package com.gsas.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gsas.exception.CitizenNotFoundException;
import com.gsas.model.CitizenDetailsVO;
import com.gsas.model.CitizenVO;
import com.gsas.service.CitizenService;
import com.gsas.utility.CitizenFactory;

/**
 * Servlet implementation class EditCitizenDetailsServlet
 */
@WebServlet("/EditCitizenDetailsServlet")
public class EditCitizenDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public EditCitizenDetailsServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CitizenService citizenService = (CitizenService) CitizenFactory.getInstance("service");
		RequestDispatcher requestDispatcher = null;
		HttpSession session = request.getSession();
		CitizenVO citizenVO = (CitizenVO) session.getAttribute("citizenVO");

			try {
				if(citizenVO != null) {		//Citizen must be Logged In in order to perform Edit Operation
					CitizenDetailsVO citizenDetailsVO = citizenService.getCitizenDetails(citizenVO.getCitizenId());
					request.setAttribute("citizenDetailsVO", citizenDetailsVO);
					
					requestDispatcher = request.getRequestDispatcher("editCitizenDetails.jsp");
					requestDispatcher.forward(request, response);
				}
				
			} catch (CitizenNotFoundException e) {
				requestDispatcher = request.getRequestDispatcher("citizenLogin.jsp");
				request.setAttribute("err", e.getMessage());
				requestDispatcher.forward(request, response);
			}
		
	}

}
