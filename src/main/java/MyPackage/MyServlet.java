package MyPackage;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		RequestDispatcher dispatcher = request.getRequestDispatcher("MyServlet2?name=" + name + "&pass=" + password);
		
		
		HttpSession session = request.getSession();
		String name = request.getParameter("name");
		String password = request.getParameter("pass");
		
		
		
		
//		dispatcher.forward(request, response);
		
		request.setAttribute("Name", name);
		request.setAttribute("Password", password);
		
		
		session.setAttribute("Name", name);
		session.setAttribute("Password", password);
		RequestDispatcher dispatcher1 = request.getRequestDispatcher("MyServlet2");
		dispatcher1.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
