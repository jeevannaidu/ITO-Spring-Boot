package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		//request attributes
		String name =  request.getParameter("name");
		request.setAttribute("name", name);

		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		//request attributes
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		if(name.equals("Jeevan") && password.equals("8998")) {
			request.setAttribute("name", name);
			request.setAttribute("password", password);
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request,response);

		}else {
			request.setAttribute("error", "Invalid Credential");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
		}
	}

}
