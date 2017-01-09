package com.calculatrice.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.calculatrice.beans.Operation;
import com.calculatrice.beans.Resultat;
import com.calculatrice.service.Calculator;

/**
 * Servlet implementation class CalculeServlet
 */
@WebServlet("/CalculeServlet")
public class CalculeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CalculeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String error = "";
		
		int operande1 = "".equals(request.getParameter("operande1")) ? 0 : Integer.parseInt(request.getParameter("operande1"));
		int operande2 = "".equals(request.getParameter("operande2")) ? 0 : Integer.parseInt(request.getParameter("operande2"));
		String operation = request.getParameter("operation");
		
		Operation opEnum = Operation.valueOf(operation.toUpperCase());
		Resultat resultat = new Resultat();
		resultat.setOperande1(operande1);
		resultat.setOperande2(operande2);
		resultat.setOperation(opEnum);
		
		Calculator calculator = new Calculator();
		try {
			calculator.calcule(resultat);
		} catch (Exception ex) {
			error = ex.getMessage();
		}
		
		request.setAttribute("resultat", resultat);
		request.setAttribute("error", error);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
	}

}
