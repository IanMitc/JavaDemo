import javax.servlet.*;
import java.io.IOException;

public class MyServlet implements Servlet {

    ServletConfig config;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = servletConfig;
        System.out.println("creating object...");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servicing...");
    }


    @Override
    public void destroy() {
        System.out.println("going to destroy servlet object...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public String getServletInfo() {
        return "this servlet created by admin";
    }
}
