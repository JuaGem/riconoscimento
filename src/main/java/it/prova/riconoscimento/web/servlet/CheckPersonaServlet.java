package it.prova.riconoscimento.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.riconoscimento.model.Persona;

/**
 * Servlet implementation class CheckPersonaServlet
 */
@WebServlet("/CheckPersonaServlet")
public class CheckPersonaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CheckPersonaServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nomeParameter = request.getParameter("nomeInput");
		String cognomeParameter = request.getParameter("cognomeInput");
		
	    RequestDispatcher rd = null;
	    if(nomeParameter != null && cognomeParameter != null && !nomeParameter.isEmpty() && !cognomeParameter.isEmpty() &&
	    		nomeParameter.equalsIgnoreCase("Giovanni") && cognomeParameter.equalsIgnoreCase("Gemini")) {
	    	request.setAttribute("esito_attribute", new Persona(nomeParameter, cognomeParameter));
	    	rd = request.getRequestDispatcher("personaTrovata.jsp");
	    	
	    } else {
	    	rd = request.getRequestDispatcher("personaNonTrovata.jsp");
	    }
	    	
	    rd.forward(request, response);
	    
	}

}
