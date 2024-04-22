package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Router
 */

@WebServlet({"/login"})
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
     System.out.println("Login attivo");
    }
    
    

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getSession().setAttribute("logged", null);
		resp.sendRedirect("home");
		
	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if(request.getParameter("username")!=null && request.getParameter("password") != null) {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			if(username.equals("test") && password.equals("test")) {
				request.getSession().setAttribute("logged", "test");
				response.sendRedirect("home");
			}
		}
			
	}

}
