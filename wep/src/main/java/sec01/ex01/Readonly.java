package sec01.ex01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Readonly")
public class Readonly extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String user_id = request.getParameter("user_id");
		String time = request.getParameter("time");
		request.setAttribute("user_id", user_id);
		request.setAttribute("time", time);
		RequestDispatcher dispatch = request.getRequestDispatcher("/test01/readonly.jsp");
		dispatch.forward(request, response);
	}

}
