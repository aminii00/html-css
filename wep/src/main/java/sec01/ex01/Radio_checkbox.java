package sec01.ex01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Radio-checkbox")
public class Radio_checkbox extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String subject = request.getParameter("subject");
		String[] mailings = request.getParameterValues("mailing");
		System.out.println(subject+"\t");
		for (int i=0; i<mailings.length; i++) {
			if (mailings[i] == null) {continue;}
			else {
				System.out.print(mailings[i] + "\t");
			}
		}
		request.setAttribute("subject", subject);
		request.setAttribute("mailings", mailings);
		
		RequestDispatcher dispath = request.getRequestDispatcher("/test01/radio-checkbox.jsp");
		dispath.forward(request, response);
	}

}
