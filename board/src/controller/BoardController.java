package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.board.BoardFactory;


@WebServlet("/BoardController")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public BoardController() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET접근입니다");
		request.setCharacterEncoding("UTF-8");
		
		//http://localhost:8000/board/BoardController?cmd=list
		String cmd= request.getParameter("cmd"); //cmd =list
		
		if(cmd==null||cmd=="") 
			cmd="list";
		
		Action action =BoardFactory.getAction(cmd);
		
		if(action!=null)
		action.execute(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST접근입니다.");
		doGet(request, response);
	}

}
