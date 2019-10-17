package action.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import dao.BoardDao;
import models.Board;
import util.Script;

public class BoardWriteAction implements Action{
@Override
public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//파라메터 title,content
	String title=request.getParameter("title");
	String content=request.getParameter("content");
	
	Board board = new Board();
	board.setTitle(title);
	board.setContent(content);
	//dao 접근 - insert
	BoardDao dao = new BoardDao();
	 int result= dao.save(board);
	 
	//list 서블릿으로 이동
	if(result==1) {
		response.sendRedirect("/board");
	}else {
		Script.back(response);
	}
}
}
