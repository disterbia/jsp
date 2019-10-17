package action.board;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import dao.BoardDao;
import util.Script;

public class BoardDeleteAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. id받기
		if(request.getParameter("id")==null || request.getParameter("id").equals(""))
			return;
		
		int id =Integer.parseInt(request.getParameter("id"));
		
		
		//2.dao접근
		BoardDao dao = new BoardDao();
		int result=dao.delete(id);
		
		//list 서블릿 호출
		if(result==1) {
			response.sendRedirect("/board/BoardController");
		}else {
			//뒤로가기(BufferedWriter)
			Script.back(response);
		}
		
	}

}
