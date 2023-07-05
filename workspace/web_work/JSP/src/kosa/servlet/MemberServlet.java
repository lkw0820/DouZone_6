package kosa.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/MemberServlet")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String userName=request.getParameter("userName");
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		String email=request.getParameter("email_front")+"@"+request.getParameter("site");
		//String site=request.getParameter("site");
		String phone=request.getParameter("phone");
		String mail=request.getParameter("mail");
		String interests=request.getParameter("Interests");
		request.setAttribute("userName", userName);
		request.setAttribute("id", id);
		request.setAttribute("pw", pw);
		request.setAttribute("email", email);
		request.setAttribute("phone", phone);
		request.setAttribute("mail", mail);
		request.setAttribute("interests", interests);
		
		RequestDispatcher re = request.getRequestDispatcher("/mission/result2.jsp");
		re.forward(request, response);
		
	}

}
