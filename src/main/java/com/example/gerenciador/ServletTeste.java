package com.example.gerenciador;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/teste")
public class ServletTeste extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException  {
       PrintWriter out =  resp.getWriter();
       out.println("<html>");
        out.println("<body>");
        out.println("um outro teste de sla...");
        out.println("</body>");
        out.println("</html>");
    }
}
