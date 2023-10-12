

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Questao8
 */
@WebServlet("/Questao8")
public class Questao8 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Aluno aluno1 = new Aluno("Ana", 25);
		Aluno aluno2 = new Aluno("Jonas", 24);
		Aluno aluno3 = new Aluno("Marta", 30);
		List<Aluno> listaAlunos = new ArrayList<Aluno>();		
		listaAlunos.add(aluno1);
		listaAlunos.add(aluno2);
		listaAlunos.add(aluno3);
		
		request.setAttribute("alunos", listaAlunos);
		RequestDispatcher rd = request.getRequestDispatcher("tela3.jsp");
		rd.forward(request, response);
	}

}
