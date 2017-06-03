package cc.openhome;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Xie on 2017.5.28.
 */
@WebServlet("/servlet/path.view")
public class PathServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Pattern</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("request.getRequestURL(): "+request.getRequestURL()+"<br>");
        out.println("request.getContextPath(): "+request.getContextPath()+"<br>");
        out.println("request.getServletPath(): "+request.getServletPath()+"<br>");
        out.println("request.getPathInfo(): "+request.getPathInfo());
        out.println("</body>");
        out.println("</html>");
        out.close();
    }


}
