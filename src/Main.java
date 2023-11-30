import javax.servlet.Servlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/customer")
public class Main extends HttpServlet {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}