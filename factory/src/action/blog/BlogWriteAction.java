package action.blog;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;

public class BlogWriteAction implements Action {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.상세보기를 위한 데이터
				String content ="내용입니다";
				
				//2.상세보기 페이지로 이동
				String url = "write.jsp";
				request.setAttribute("name", content);
				
				RequestDispatcher dis = request.getRequestDispatcher(url);
				dis.forward(request, response);
		
	}
}
