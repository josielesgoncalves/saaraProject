package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bd.BD;
import bd.dbo.Usuario;

/**
 * Servlet implementation class Cadastro
 */
@WebServlet("/Cadastro")
public class Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Cadastro() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// doGet(request, response);
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		String confimarSenha = request.getParameter("confimarSenha");

		try {
			if (senha.equals(confimarSenha)) {
				Usuario usuario = new Usuario(nome, email, senha);

				if (!BD.Usuarios.cadastrado(email)) {
					BD.Usuarios.inserir(usuario);					
				}
				response.sendRedirect("sucesso.html");
				//TODO: redirecionar usuario para o login ou home?
			}
			// TODO: antes de dar submit, falar pro usuario se senhas matches e se email j�
			// nao est� sendo usado
		} catch (Exception e) {
			response.sendRedirect("erro.html");
		}

	}

}
