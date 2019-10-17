package action.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import dao.BoardDao;
import models.Board;

public class BoardDetailAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 파라메터 받기 ID
		if(request.getParameter("id")==null || request.getParameter("id").equals(""))
			return;
		
		int id =Integer.parseInt(request.getParameter("id"));
		
		
		//2.Dao에 접근하여 데이터 가져오기
		BoardDao dao = new BoardDao();
		Board board = dao.findById(id);
		
		//3.request에 저장
		request.setAttribute("board", board);
		
		//4.detail.jsp이동
		RequestDispatcher dis = request.getRequestDispatcher("detail.jsp");
		dis.forward(request, response);
	}
	
}
