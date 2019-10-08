package action.blog;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import models.Member;

public class BlogPostAction implements Action {
@Override
public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	Member member = new Member();
	
	String url="post.jsp";
	
	request.setAttribute("member", member);
	
	RequestDispatcher dis = request.getRequestDispatcher(url);
	dis.forward(request, response);
	
}
}
