package com.example.gerenciador;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NovaEmpresaServlet", value = "/NovaEmpresaServlet")
public class NovaEmpresaServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nomeEmpresa = req.getParameter("nome");

        //Instanciando Empresa
        Empresa empresa = new Empresa();
        empresa.setNome(nomeEmpresa);

        //instanciando Banco
        Banco banco = new Banco();
        banco.adiciona(empresa);

        PrintWriter saida = resp.getWriter();
        saida.println("<html><body>Empresa:  "+nomeEmpresa+" Cadastrada com sucesso!</body></html>");

    }
}
