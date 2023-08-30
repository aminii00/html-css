package sec01.ex01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/date1")
public class Date1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			                                    throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String start = request.getParameter("start");
		String end = request.getParameter("end");
		System.out.println(start);
		System.out.println(end);
		request.setAttribute("start", start);
		request.setAttribute("end", end);
		RequestDispatcher dispatch = request.getRequestDispatcher("/test01/date1.jsp");
		dispatch.forward(request, response);
	}

}
