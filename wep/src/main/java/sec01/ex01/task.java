package sec01.ex01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/task")
public class task extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public task() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			                                    throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		String user_pw2 = request.getParameter("user_pw2");
		String user_name = request.getParameter("user_name");
		String user_birth = request.getParameter("user_birth");
		String user_tel = request.getParameter("user_tel");
		String user_mail = request.getParameter("user_mail");
		String user_addr = request.getParameter("user_addr");
		
		request.setAttribute("user_id", user_id);
		request.setAttribute("user_pw", user_pw);
		request.setAttribute("user_pw2", user_pw2);
		request.setAttribute("user_name", user_name);
		request.setAttribute("user_birth", user_birth);
		request.setAttribute("user_tel", user_tel);
		request.setAttribute("user_mail", user_mail);
		request.setAttribute("user_addr", user_addr);
		
		RequestDispatcher dispatch = request.getRequestDispatcher("/test01/task.jsp");
		dispatch.forward(request, response);
	}

}
