package action.board;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import dao.BoardDao;
import models.Board;

public class BoardListAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1~4 DAO파일에 위임
		BoardDao dao = new BoardDao();
		ArrayList<Board> boards= dao.findByAll();
		
		//5.결과를 가지고 해당 페이지로 이동
		request.setAttribute("boards",boards);
		RequestDispatcher dis = request.getRequestDispatcher("list.jsp");
		dis.forward(request,response);
	}

}
