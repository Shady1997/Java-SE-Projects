package servletproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "WelcomeServlet", urlPatterns = { "/welcome" })
public class WelcomeServlet extends HttpServlet {
    private int i=3; 
    private static final String CONTENT_TYPE = "text/html; charset=UTF-8";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>WelcomeServlet</title></head>");
        out.println("<body>");
        out.println(i+1);
        String name = request.getParameter("firstName");
        out.println("<p> Welcome "+ name +" ,This is the first App.</p>");
        out.println("</body></html>");
        out.close();
    }
}
