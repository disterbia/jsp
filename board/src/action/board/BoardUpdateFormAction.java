package action.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import dao.BoardDao;
import models.Board;

public class BoardUpdateFormAction implements Action {
@Override
public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//1.id받기
	if(request.getParameter("id")==null || request.getParameter("id").equals(""))
		return;
	
	int id =Integer.parseInt(request.getParameter("id"));
	
	//2.id를통해서 dao접근 -> Board 객체를 받아야 함.
	BoardDao dao = new BoardDao();
	Board board = dao.findById(id);
	
	//3. request에 담기
	request.setAttribute("board", board);
	
	//4.updateForm.jp로 전달
	RequestDispatcher dis = request.getRequestDispatcher("updateForm.jsp");
	dis.forward(request, response); //리퀘스트를 톰캣으로 전달
}
}
