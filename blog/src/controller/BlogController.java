package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.User;

//http://localhost:8000/blog/BlogController  크롬 주소창에서 치면 다 get방식 접근 
//http://IP주소:포트/프로젝트명(컨택스트패스)/서블릿어노테이션
//http://localhost:8000/blog/BlogController?cmd=list
//http://IP주소:포트/프로젝트명(컨택스트패스)/서블릿어노테이션?쿼리스트링
@WebServlet("/BlogController")
public class BlogController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BlogController() {
        super();
     
    }
    //list,login,join,detail
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		System.out.println("cmd:"+cmd);
		
		//http://localhost:8000/blog/BlogController
		if(cmd==null) {
			response.sendRedirect("index.jsp");
		}else if(cmd.equals("list")) {
			response.sendRedirect("list.jsp");
		}else if (cmd.equals("login")) {
			response.sendRedirect("login.jsp");
		}else if (cmd.equals("join")) {
			response.sendRedirect("join.jsp");
		}else if (cmd.equals("detail")) {
			//User객체를 가져가는법
			
			User u = new User(1,"ssar","ssar@nate.com","1234");
			
			
			request.setAttribute("user", u);
			RequestDispatcher dis = request.getRequestDispatcher("detail.jsp");
			dis.forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
