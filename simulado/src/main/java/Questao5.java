

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Questao5
 */
@WebServlet("/Questao5")
public class Questao5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int dia = Integer.parseInt(request.getParameter("dia"));
		int mes = Integer.parseInt(request.getParameter("mes"));
		int ano = Integer.parseInt(request.getParameter("ano"));
		String pais = request.getParameter("pais");
		
		
		response.setContentType("text/html");
		PrintWriter saida = response.getWriter();
		
		String nome_mes = "";
		
		if(mes == 1) {
			nome_mes = "janeiro";
		}
		else if(mes==2) {
			nome_mes = "fevereiro";
		}
		else if(mes==3) {
			nome_mes = "março";
		}
		else if(mes==4) {
			nome_mes = "abril";
		}
		else if(mes==5) {
			nome_mes = "maio";
		}
		else if(mes==6) {
			nome_mes = "junho";
		}
		else if(mes==7) {
			nome_mes = "julho";
		}
		else if(mes==8) {
			nome_mes = "agosto";
		}
		else if(mes==9) {
			nome_mes = "setembro";
		}
		else if(mes==10) {
			nome_mes = "outubro";
		}
		else if(mes==11) {
			nome_mes = "novembro";
		}
		else if(mes==12) {
			nome_mes = "dezembro";
		}
		
		
		if(pais.equals("brasil")) {
			saida.print(dia+"/"+nome_mes+"/"+ano);
		}
		else {
			saida.print(nome_mes+"/"+dia+"/"+ano);
		}
		
	}

}
