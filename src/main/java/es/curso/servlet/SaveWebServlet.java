package es.curso.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.curso.entity.Web;
import es.curso.service.DatabaseService;

@WebServlet("/save-web.html")
public class SaveWebServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("name");
		String url = request.getParameter("url");
		String description = request.getParameter("description");
		
		Web web = new Web(nombre, url, description);
		DatabaseService.insertWeb(web);
		response.sendRedirect("webForm.jsp");
	
	}

}
