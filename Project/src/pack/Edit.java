package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Edit
 */
@WebServlet("/Edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Edit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	          
	        String d1=request.getParameter("id");  
	        int id=Integer.parseInt(d1);  
	        String username=request.getParameter("username");  
	        String userid=request.getParameter("userid");
	        String d=request.getParameter("mobile");  
	        int mobile=Integer.parseInt(d);  
	        String email=request.getParameter("email"); 
	        String password=request.getParameter("password"); 
	          
	        Requirements e=new Requirements();  
	        e.setId(id);  
	        e.setUsername(username);  
	        e.setUserid(userid);
	        e.setMobile(mobile); 
	        e.setEmail(email);  
	        e.setPassword(password); 
	        int status=Register.update(e);  
	        if(status>0){  
	            response.sendRedirect("ViewServlet");  
	        }else{  
	            out.println("Sorry! unable to update record");  
	        }  
	          
	}	  
	//edit servalets2  
	
	
	

}
