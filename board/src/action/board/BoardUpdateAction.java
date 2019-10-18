package action.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import dao.BoardDao;
import models.Board;
import util.Script;

public class BoardUpdateAction implements Action {
@Override
public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//1. id title content 받기
	if(request.getParameter("id")==null || request.getParameter("id").equals(""))
		return;
	
	int id =Integer.parseInt(request.getParameter("id"));
	String title=request.getParameter("title");
	String content = request.getParameter("content");
	
	Board board = new Board();
	board.setId(id);
	board.setTitle(title);
	board.setContent(content);
	

	//2. 3건을 board에 담기
	
	//3. dao접근 -> 업데이트 수행
	BoardDao dao =new BoardDao();
	int result=dao.update(board);
	
	

	//4.정상이면 ->detail.jsp
	if(result==1) {
		response.sendRedirect("/board/BoardController?cmd=detail&id="+board.getId());
	}else {
		Script.back(response);
	}
}
}
