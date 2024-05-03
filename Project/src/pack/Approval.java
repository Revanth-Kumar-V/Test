package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class Approval
 */
@WebServlet("/Approval")
public class Approval extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Approval() {
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
		PrintWriter pw = response.getWriter();
		
		

		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mabsquare","root","root");
			    int id=Integer.parseInt(request.getParameter("id"));
	            PreparedStatement pt=(PreparedStatement) con.prepareStatement("update Project1 set status='approval' where id ="+id);  
	            int i=pt.executeUpdate();
	           if(i>0)
	           {
	        	   pw.println("<script type=\"text/javascript\">");
			 	   pw.println("alert('Approved Sucessfully....');");
			 	   pw.println("location='Emailservlet';");
			 	   pw.println("</script>"); 
	           }
	           else
	           {
	        	   pw.println("<script type=\"text/javascript\">");
			 	   pw.println("alert('Approved UnSucessfully....');");
			 	   pw.println("location='Approve.html';");
			 	   pw.println("</script>"); 

	           }
	           
	                
	             
	        }
	        catch(Exception e)
	        {
	        	e.printStackTrace();
	        } 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
