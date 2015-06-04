package Logica;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bd.EventoDao;



@WebServlet("/adicionaEvento")
public class AdicionaEventoServlet extends HttpServlet {
    protected void service(HttpServletRequest request,
                        HttpServletResponse response)
                        throws IOException, ServletException {
        // busca o writer
        PrintWriter out = response.getWriter();
                        
        // buscando os parâmetros no request
        String titulo = request.getParameter("titulo");
        String data = request.getParameter("data");
        String email = request.getParameter("email");
        String descricao = request.getParameter("descricao");
     
      
        
        
        // monta um objeto contato
        Evento evento = new Evento();
        evento.setTitulo(titulo);
        evento.setData(data);
        evento.setEmail(email);
        evento.setDescricao(descricao);
        
        
        
        // salva o evento
        EventoDao dao = new EventoDao();
        dao.adiciona(evento);
        
       
    }
}
