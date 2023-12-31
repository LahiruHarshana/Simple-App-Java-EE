import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/customer")
public class Main extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Customer Saved");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("phone");
        String address = req.getParameter("address");
        resp.getWriter().println("Customer Saved");

        resp.getWriter().println("<h1>name: " + name + "</h1>");
        resp.getWriter().println("<h1>email: " + email + "</h1>");
        resp.getWriter().println("<h1>phone: " + password + "</h1>");
        resp.getWriter().println("<h1>address: " + address + "</h1>");

    }
}