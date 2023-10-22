package loginpage.servlet;

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

/**
 * Servlet implementation class DataValidation
 */
public class DataValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DataValidation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		//pw.println("<h1>THIS IS LOGIN PAGE SERVLET</h1>");
		
		String str=request.getParameter("mailID");
		String str2=request.getParameter("pwd1");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/springjdbc","root", "Mahesh@26");
		
		String qry="select * from logintable where EMAILID=?";
		PreparedStatement stmt1=con.prepareStatement(qry);
		stmt1.setString(1,str);
		ResultSet rs=stmt1.executeQuery();
		if(rs.next()) {
			String DbPwd =rs.getString("PASSWORD");
			if(str2.equals(DbPwd)) {
			    //pw.println("<h1>LOGGED IN SUCCESSFULLY</h1>");
				response.sendRedirect("./Successful.html");
			}else {
				pw.println("<h1>ENTER PASSWORD IS INCORRECT</h1>");
			}
		}
		else {
			pw.println("<h1>USER DOESN'T EXISTS</h1>");
		}
		
		//pw.println(str);
		
		
		con.close();
		} 
		catch(Exception e) {
			System.out.println(e);
		}
			
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
