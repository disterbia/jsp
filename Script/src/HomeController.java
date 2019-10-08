

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8000/Script/HomeController
@WebServlet("/HomeController") //naming 규칙 
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public HomeController() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Get ��û");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Post ��û");
		PrintWriter out =response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1> Hellow World</h1>");
		out.println("</body>");
		out.println("<html>");
		out.println("</html>");
		out.flush();
	}

}
