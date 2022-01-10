package Controller;
import java.io.IOException;
import java.io.PrintWriter;

import Model.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login {
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			try{
			   String username = request.getParameter("txtUsername");
			   String password = request.getParameter("txtPassword");
			   User loginModel = new User();
			   if(loginModel.LoginValid(username, password)){
			      response.sendRedirect("NewFile.jsp");
			   }else{
			      request.setAttribute("error", "Username and Password invalid !");
			      RequestDispatcher dis = request.getRequestDispatcher("Layer.jsp");
			      dis.forward(request, response);
			    }
			  }finally{
			      out.close();
			  }
			 }
}
