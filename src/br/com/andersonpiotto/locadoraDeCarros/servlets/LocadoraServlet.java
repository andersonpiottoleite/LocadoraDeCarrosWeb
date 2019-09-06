package br.com.andersonpiotto.locadoraDeCarros.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.andersonpiotto.locadoraDeCarros.dao.ConnectionFactory;
import br.com.andersonpiotto.locadoraDeCarros.dao.LocadoraDAO;
import br.com.andersonpiotto.locadoraDeCarros.model.Locadora;

/**
 * Classe responsavel por fazer o papel do controller da <code>Locadora</code>.
 * 
 * @author Anderson Piotto
 * @version 1.0.0
 */

@WebServlet("/adicionaLocadora")
public class LocadoraServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest resquest, HttpServletResponse response)
			throws ServletException, IOException {
		
		Locadora locadora = new Locadora();
		
		locadora.setNome("LOCAL VEICULOS");
		
		LocadoraDAO dao = new LocadoraDAO(ConnectionFactory.getEntityManager());
		
		dao.adicionaLocadora(locadora);
		
		
		// o idel é criar uma página jsp para não misturar codigo html com a classe java, pegar os parametros da requisição, etc.
		// não deu tempo de criar a pagina.
		PrintWriter writer = response.getWriter();
		
		writer.print("<html>");
		writer.print("<title> Resposta </title>");
		writer.print("<body>");
		writer.print("<h1>Locadora adicionda!</h1>");
		writer.print("<p>" + locadora.getNome() + "</p>");
		writer.print("</body>");
		writer.print("</html>");
		
		// para inserir, usar a url:
		//http://localhost:8080/LocadoraDeCarrosWeb/adicionaLocadora

	}

}
