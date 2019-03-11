package es.curso.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.curso.entity.Web;
import es.curso.service.DatabaseService;

/**
 * Servlet implementation class ListWebsServlet
 */
@WebServlet("/list-webs.html")
public class ListWebsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Web> listWebs = DatabaseService.listWebs();
		request.setAttribute("webs", listWebs);
		request.getRequestDispatcher("/WEB-INF/jsp/webList.jsp").forward(request, response);
	}

}
