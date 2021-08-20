package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		request.getRequestDispatcher("link.html").include(request,response);
		if(pass.equals("admin@123"))
		{
			 out.print("You are successfully logged in!");  
	            out.print("<br>Welcome, "+name);  
	              Cookie ck= new Cookie("uname",name);
	              
	              response.addCookie(ck);
		}
		else
		{
			 out.print("sorry, username or password error!");  
	            request.getRequestDispatcher("login.html").include(request, response);  
		}
		
		
		
	}

}
