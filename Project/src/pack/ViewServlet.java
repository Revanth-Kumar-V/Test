package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewServlet() {
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
	       
	        out.println("<html>");  
	        out.println("<head>");  
	        out.println("<title>DATA BASE</title>");
	        out.println("<style >");
	         out.println("body{");
	       out.println("background-image:url('view.jpg');");
	       out.println("background-size:cover;");
	       out.println(" background-repeat: no-repeat;");
	       out.println("background-size: 100% 100%;");
	       out.println("background-attachment:fixed;}");
	       out.println("</style >");
	        out.println("</head>");  
	          
	        List<Requirements> list=Register.getAllEmployees();  
	        out.println("<body>"); 
	        out.println("<marquee direction=\"left\"><font size=\"8\" color=#000080 face=\"palatino\"> MABSQUARE DATA BASE PAGE FROM MY SQL</marquee><hr>"); 
	        out.print("<table align=\"center\" border='1' ' ");  
	        out.print("<tr><th>Id</th><th>Username</th><th>Userid</th><th>Mobile</th><th>Email</th><th>Password</th></th><th>Edit</th><th>Delete</th><th>Status</th></tr>");  
	        for( Requirements e:list){  
	         out.print("<tr><td>"+e.getId()+"</td><td>"+e.getUsername()+"</td><td>"+e.getUserid()+"</td><td>"+e.getMobile()+"</td><td>"+e.getEmail()+"</td><td>"+e.getPassword()+"</td><td><a href='Edithtml?id="+e.getId()+"'>edit</a></td><td><a href='Delete?id="+e.getId()+"'>delete</a></td><td><a href='Approval?id="+e.getId()+"'>"+e.getStatus()+"</a></td></tr>");  
	        }  
	        out.print("</table>"); 
	        out.println("</body>"); 
	        out.println("</html>");  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
