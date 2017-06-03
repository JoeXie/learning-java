/**
 *
 */
package cc.openhome;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Xie
 *
 */
@WebServlet("/hello.view")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse respone)
            throws ServletException, IOException {
        respone.setContentType("text/html;charset=UTF-8");
        PrintWriter out = respone.getWriter();
        String name = request.getParameter("name");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> Hello! " + name + " !</h1>");
        out.println("request time: " + new Date() + "<br>");
        out.println("request IP: " + request.getRemoteAddr());
        Enumeration<String> headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            out.println(headerName + ": " + request.getHeader(headerName) + "<br>");
        }

        out.println("</body>");
        out.println("</html>");
        out.close();
    }

}
