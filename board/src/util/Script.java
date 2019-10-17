package util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class Script {
	public static void back(HttpServletResponse response) {
		PrintWriter out;
		try {
			out = response.getWriter();
			out.println("<scripte>");
			out.println("history.back");
			out.println("</scripte>");
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
