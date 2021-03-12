package isetj.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Coffeeservlets
 */
@WebServlet("/Coffeeservlets")
public class Coffeeservlets extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Coffeeservlets() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String choix=request.getParameter("ghada");
		request.setAttribute("ghada", choix);
		String req=request.getParameter("remarque");
		request.setAttribute("remarque", req);
		response.getWriter().println("<img src=\"C:\\Users\\GHADA\\Desktop\\coffee.jpg\" width=\"500\" height=\"250\" /> <br><br>");
	    response.getWriter().println("Merci de nous avoir fait parvenir la remarque suivant concernat <b>"+choix+"</b><br><br>");
	    response.getWriter().println(req);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
