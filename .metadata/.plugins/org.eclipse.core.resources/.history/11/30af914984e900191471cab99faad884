package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.blog.BlogFactory;

//http://localhost:8000/factory/blog
@WebServlet("/blog")
public class BlogController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public BlogController() {
        super();
    
    }

    //http://localhost:8000/factory/blog?cmd=view
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		if(cmd==null) {
			response.sendRedirect("index.jsp");
			return;
		}
		
		//팩토리에게 위임
		Action action =BlogFactory.getAction(cmd);
		action.excute(request, response); //동적바인딩
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
