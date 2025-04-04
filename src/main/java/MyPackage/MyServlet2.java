package MyPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class MyServlet2
 */
@WebServlet("/MyServlet2")
public class MyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		response.getWriter().append("\t\t\t\tData Transferred Successfully\n\n");
		
		String name = request.getParameter("name");
		String password = request.getParameter("pass");
		
		response.getWriter().append("\nData at servlet 2 : " + name + " " + password);
		
		
		response.getWriter().append("\n\nUsing Request Attribute : ");
		
	String Name = (String) request.getAttribute("Name");
	String Password = (String) request.getAttribute("Password");
	System.out.println(Name);
	
	response.getWriter().append(" "+Name +" " + Password);
	
	
	response.getWriter().append("\n\nUsing Session Attribute  OR  Session management\t: ");
	String Username = (String) session.getAttribute("Name");
	String Pass = (String) session.getAttribute("Password");
	
	response.getWriter().append(" "+Username +" " + Pass);
	
	
		

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
