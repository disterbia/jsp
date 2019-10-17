package action.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;

public class BoardWriteFormAction implements Action {
@Override
public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.sendRedirect("writeForm.jsp");
	
}
}
