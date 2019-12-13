package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class WelcomeServlet extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=windows-1256";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>WelcomeServlet</title></head>");
        out.println("<body>");
        String name = request.getParameter("firstName");
        String gender = request.getParameter("gender");
        String salutation;
        if (gender.equals("Male")) {
            salutation = "Mr.";
        } else {
            salutation = "Mrs.";
        }
        String date = request.getParameter("date");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date1;
        Date date2 = new Date(System.currentTimeMillis());
        long date2ms = date2.getTime();


        try {
            date1 = formatter.parse(date);
            long millis = date1.getTime();

            long age = date2ms - millis;
            long i = 31536000000L; 


            out.println("<p>Welcome " + salutation + " " + name + "</p>");
            out.println("<p>Your age is " + (age / i) + " years old.</p>");

            out.println("</body></html>");
            out.close();
        } catch (ParseException e) {
        }
    }
}
