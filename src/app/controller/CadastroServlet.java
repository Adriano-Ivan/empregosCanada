package app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.entities.Candidato;

@WebServlet("/cadastrar")
public class CadastroServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomeParametro = req.getParameter("nome");
		String nascimentoParametro = req.getParameter("dataNascimento");
		String idiomaNativoParametro = req.getParameter("idiomaNativo");
		String[] habilidadesParametro = req.getParameterValues("habilidadesEmLinguagens");
		
		System.out.println(nascimentoParametro);
		System.out.println(nomeParametro);
		
		if(nomeParametro == null || nomeParametro.trim() == "" || nascimentoParametro == null || 
				nascimentoParametro.trim() == ""
				|| idiomaNativoParametro == null || habilidadesParametro == null) {
			//resp.sendRedirect(this.getServletContext().getContextPath());
			RequestDispatcher d = req.getRequestDispatcher("cadastro.jsp");
			d.forward(req, resp);
		} else {
			Candidato c = new Candidato(nomeParametro, idiomaNativoParametro, nascimentoParametro,
					habilidadesParametro);
			req.setAttribute("candidatoAttr", c);
			RequestDispatcher d = req.getRequestDispatcher("exibicao.jsp");
			d.forward(req, resp);
		}
	}
}
