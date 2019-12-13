package serveltsproject;

import java.io.IOException;
import java.io.PrintWriter;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;


import javax.servlet.*;
import javax.servlet.http.*;

public class Task extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=windows-1256";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Task</title></head>");
        out.println("<body>");
        String name=request.getParameter("firstName");
        String geneder=request.getParameter("geneder");
        String x="";
        if(geneder.equals("Male")){
            x="Mr ";
        }
        else if(geneder.equals("Female")){
            x="Mrs ";
        }
        String date=request.getParameter("birthDate"); 
        /*Date date1;
        try {
            date1 = new SimpleDateFormat("MM/dd/yyyy").parse(date);
           
        } catch (ParseException e) {
        }*/
        
       
        out.println("<p>Welcome "+x+name+""+date+".</p>");
        out.println("</body></html>");
        out.close();
    }
}
