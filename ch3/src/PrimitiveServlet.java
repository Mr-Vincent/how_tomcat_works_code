

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class PrimitiveServlet implements Servlet {

  public void init(ServletConfig config) throws ServletException {
    System.out.println("init");
  }

  public void service(ServletRequest request, ServletResponse response)
    throws ServletException, IOException {
    System.out.println("from service");
    System.out.println("requset protocal:" +request.getProtocol());
    System.out.println("requset host:" +request.getRemoteHost());
    PrintWriter out = response.getWriter();
    String OKMessage = "HTTP/1.1 200 OK\r\n" +
            "Content-Type: text/html\r\n";
    out.println(OKMessage);
    out.println("Hello. Roses are red.");
    out.print("Violets are blue.");
  }

  public void destroy() {
    System.out.println("destroy");
  }

  public String getServletInfo() {
    return null;
  }
  public ServletConfig getServletConfig() {
    return null;
  }

}
