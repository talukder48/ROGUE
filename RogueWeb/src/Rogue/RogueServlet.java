package Rogue;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pkg.jbnames.JBNames;
import pkg.middle.Delegator;

@WebServlet("/RogueServlet")
public class RogueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public RogueServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Delegator d= new Delegator();				
				Map<String, String> map=new HashMap<String, String>();
				map.put("JBName",JBNames.___ServiceSessionBN);
				d.Delegation(map);				
			/*PrintWriter out = response.getWriter();
			out.print("<html><body>"
					+ "<h1>"
					+ "I  have sucessfully completed it"
					+ "</h1>"
					+ "<b>Respons from HelloWorld Servlet"
			 		+ ""
			 		+ ""
			 		+ "</b></body></html>");
			 out.close();*/
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
}
