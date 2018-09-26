package bd;

import bd.core.*;
import bd.daos.*;

public class BD 
{
    public static final MeuPreparedStatement COMANDO;
    public static final Usuarios Usuarios;

    static
    {
        Usuarios usuarios  = null; 
        MeuPreparedStatement comando = null;
	    
        try
        {
            comando = new MeuPreparedStatement (	            
	        "com.microsoft.sqlserver.jdbc.SQLServerDriver",
	        "jdbc:sqlserver://FS5:1433;databasename=poo201849",
	        "poo201849", "Opkvs8");

	    usuarios = new Usuarios ();
        }
        catch (Exception erro)
        {
        	System.err.println ("Problemas de conexao com o BD");
	    	System.exit(0);
        }
        COMANDO = comando;
        Usuarios  = usuarios;
	}
	
}
