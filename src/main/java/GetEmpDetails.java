

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import dao.*;



@WebServlet("/getEmpDetails")
public class GetEmpDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public GetEmpDetails() {
        super();
        
        // TODO Auto-generated constructor stub
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter pw =response.getWriter();
	
		System.out.println("30");
		request.setAttribute("empDetails",empDao.getAllEmployeeDetails());
		System.out.println("32");
		RequestDispatcher rd=request.getRequestDispatcher("showEmpDetails.jsp");
		System.out.println("34");
		rd.forward(request, response);
		
		
		
	}

	

}
