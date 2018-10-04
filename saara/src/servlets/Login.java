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
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");

		try {
			if (BD.Usuarios.cadastrado(email)) {
				Usuario usuario = BD.Usuarios.getUsuario(email);
				if (senha.equals(usuario.getSenha())) {
					// TODO: redirecionar login para pagina inicial
					response.sendRedirect("sucesso.html");
				} else
					response.sendRedirect("login.html");
				// TODO: quando a senha não for valida, notificar usuario
			} else
				response.sendRedirect("login.html");
			// TODO: quando o email não estiver correto, notificar usuario

		} catch (Exception e) {
			response.sendRedirect("erro.html");
		}
	}

}
