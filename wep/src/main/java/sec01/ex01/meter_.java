package sec01.ex01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/meter_")
public class meter_ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String user_top = request.getParameter("top");
		String user_pants = request.getParameter("pants");
		String user_shoes = request.getParameter("shoes");
		
		request.setAttribute("top", user_top);
		request.setAttribute("pants", user_pants);
		request.setAttribute("shoes", user_shoes);
		
		RequestDispatcher dispatch = request.getRequestDispatcher("/test01/meter_.jsp");
		dispatch.forward(request, response);
	}

}
