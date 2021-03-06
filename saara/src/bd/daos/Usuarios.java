package bd.daos;

import java.sql.*;
import bd.*;
import bd.core.*;
import bd.dbo.*;

public class Usuarios {
	public boolean cadastrado(String email) throws Exception {
		boolean retorno = false;

		try {
			String sql;
			sql = "SELECT * FROM USUARIO WHERE EMAIL = ?";

			BD.COMANDO.prepareStatement(sql);

			BD.COMANDO.setString(1, email);

			MeuResultSet resultado = (MeuResultSet) BD.COMANDO.executeQuery();

			retorno = resultado.first();

		} catch (SQLException erro) {
			throw new Exception("Erro ao procurar usuario");
		}

		return retorno;
	}

	public void inserir(Usuario usuario) throws Exception {
		if (usuario == null)
			throw new Exception("Usuario nao fornecido");

		try {
			String sql;

			sql = "INSERT INTO USUARIO(NOME, EMAIL, SENHA) VALUES (?, ?, ?);";

			BD.COMANDO.prepareStatement(sql);

			BD.COMANDO.setString(1, usuario.getNome());
			BD.COMANDO.setString(2, usuario.getEmail());
			BD.COMANDO.setString(3, usuario.getSenha());

			BD.COMANDO.executeUpdate();
			BD.COMANDO.commit();
		} catch (SQLException erro) {
			throw new Exception("Erro ao inserir usuario");
		}
	}

	public void excluir(String email) throws Exception {
		if (!cadastrado(email))
			throw new Exception("Nao cadastrado");

		try {
			String sql;

			sql = "DELETE FROM USUARIO WHERE EMAIL=?";

			BD.COMANDO.prepareStatement(sql);

			BD.COMANDO.setString(1, email);

			BD.COMANDO.executeUpdate();
			BD.COMANDO.commit();
		} catch (SQLException erro) {
			throw new Exception("Erro ao excluir usuario");
		}
	}

	public void alterar(Usuario usuario) throws Exception {
		if (usuario == null)
			throw new Exception("Usuario nao fornecido");

		if (!cadastrado(usuario.getEmail()))
			throw new Exception("Nao cadastrado");

		try {
			String sql;

			sql = "UPDATE USUARIO " + "SET NOME=? " + "SET SENHA=? " + "WHERE EMAIL= ?";

			BD.COMANDO.prepareStatement(sql);

			BD.COMANDO.setString(1, usuario.getNome());
			BD.COMANDO.setString(2, usuario.getSenha());
			BD.COMANDO.setString(3, usuario.getEmail());

			BD.COMANDO.executeUpdate();
			BD.COMANDO.commit();
		} catch (SQLException erro) {
			throw new Exception("Erro ao atualizar dados de usuario");
		}
	}

	public Usuario getUsuario(String email) throws Exception {
		Usuario usuario = null;

		try {
			String sql;

			sql = "SELECT * " + "FROM USUARIO " + "WHERE EMAIL = ?";

			BD.COMANDO.prepareStatement(sql);

			BD.COMANDO.setString(1, email);

			MeuResultSet resultado = (MeuResultSet) BD.COMANDO.executeQuery();

			if (!resultado.first())
				throw new Exception("Nao cadastrado");

			usuario = new Usuario(resultado.getString("NOME"), resultado.getString("EMAIL"),
					resultado.getString("SENHA"));
		} catch (SQLException erro) {
			throw new Exception("Erro ao procurar usuario");
		}

		return usuario;
	}

	public MeuResultSet getUsuarios() throws Exception {
		MeuResultSet resultado = null;

		try {
			String sql;

			sql = "SELECT * " + "FROM USUARIO";

			BD.COMANDO.prepareStatement(sql);

			resultado = (MeuResultSet) BD.COMANDO.executeQuery();
		} catch (SQLException erro) {
			throw new Exception("Erro ao recuperar usuarios");
		}

		return resultado;
	}
}
