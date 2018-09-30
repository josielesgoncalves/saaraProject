package bd;

import bd.core.*;
import bd.daos.*;

public class BD {
	public static final MeuPreparedStatement COMANDO;
	public static final Usuarios Usuarios;

	static {
		Usuarios usuarios = null;
		MeuPreparedStatement comando = null;

		try {
			// comando = new MeuPreparedStatement (
			// "com.microsoft.sqlserver.jdbc.SQLServerDriver",
			// "jdbc:sqlserver://FS5:1433;databasename=poo201849",
			// "poo201849", "Opkvs8");

			String driverName = "com.mysql.jdbc.Driver";
			String username = "root";
			String password = "Jo$i220792";

			comando = new MeuPreparedStatement(driverName, "jdbc:mysql://127.0.0.1:3306/projetod", username, password);

			usuarios = new Usuarios();
		} catch (Exception erro) {
			System.err.println("Problemas de conexao com o BD");
			System.exit(0);
		}
		COMANDO = comando;
		Usuarios = usuarios;
	}

}
