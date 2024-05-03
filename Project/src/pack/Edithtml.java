package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Edithtml
 */
@WebServlet("/Edithtml")
public class Edithtml extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Edithtml() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	        out.println("<h1>DATABASE<hr></h1>");  
	        String d=request.getParameter("id");  
	        int id=Integer.parseInt(d);  
	          
	        Requirements e=Register.getEmployeeById(id); 
	        out.print("<html>");  
	        out.print("<head>");  
	        out.print("<title>DATABASE</title>"); 
	        out.println("<style >");
	        out.println("body{");
	       out.println("background-image:url('cloud.jpg');");
	       out.println("background-size:cover;");
	       out.println(" background-repeat: no-repeat;");
	       out.println("background-size: 100% 100%;");
	       out.println("background-attachment:fixed;}");
	       out.println("</style >");
	        out.print("</head>");  
	        out.print("<body>");  
	         
	        out.print("<form action='Edit' method='post'>");  
	        out.print("<table>");  
	        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+e.getId()+"'/></td></tr>");  
	        out.print("<tr><td>Username:</td><td><input type='text' name='username' value='"+e.getUsername()+"'/></td></tr>");  
	        out.print("<tr><td>Userid:</td><td><input type='text' name='userid' value='"+e.getUserid()+"'/></td></tr>");
	        out.print("<tr><td>Mobile:</td><td><input type='text' name='mobile' value='"+e.getMobile()+"'/></td></tr>");  
	        out.print("<tr><td>Email:</td><td><input type='email' name='email' value='"+e.getEmail()+"'/></td></tr>"); 
	        out.print("<tr><td>password:</td><td><input type='text' name='password' value='"+e.getPassword()+"'/></td></tr>");  
	        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
	        out.print("</table>");  
	        out.print("</form>"); 
	        out.print("</body>");   
	        out.print("</html>");  
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
