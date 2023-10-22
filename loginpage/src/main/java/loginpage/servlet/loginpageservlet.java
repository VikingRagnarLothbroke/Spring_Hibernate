
package loginpage.servlet;
import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Servlet implementation class loginpageservlet
 */
@WebServlet("/loginpage")
public class loginpageservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginpageservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 response.getWriter().println("Hello");
	  /*	response.setContentType("text/html");
		//response.sendRedirect("./Successful.html");
		
		PrintWriter pw=response.getWriter();
		String str1=request.getParameter("uname");
		String str2=request.getParameter("mail");
		String str3=request.getParameter("pwd");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/springjdbc","root", "Mahesh@26");
		
		String qry="insert into logintable values(?,?,?)";
		PreparedStatement stmt1=con.prepareStatement(qry);
		stmt1.setString(1, str1);
		stmt1.setString(2, str2);
		stmt1.setString(3, str3);
		
		int i=stmt1.executeUpdate();
		if(i>=1) {
			pw.println("<h1>SUCCESSFULLY REGISTERED</h1>");
			pw.println("<h1> <a href=\"./login.html\">LOGIN</a></h1>");
		}
		
		con.close();
		} 
		catch(Exception e) {
			System.out.println(e);
		}
		String str=request.getParameter("pname");
		pw.println("LOGIN PAGE CREATION");
		pw.println(str1);
		pw.println(str2);
		pw.println(str3);*/
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          
		
		
		//pw.println("THIS IS MY FIRST SERVLET PROGRAM");
	}

}
