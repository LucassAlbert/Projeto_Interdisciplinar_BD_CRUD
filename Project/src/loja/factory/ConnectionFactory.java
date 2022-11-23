package loja.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import loja.Produto;
import loja.dao.ProdutoDAO;

public class ConnectionFactory 
{
	//Usuario
	private static final String USERNAME = "b5eb1be4ab5892";
	//Senha
	private static final String PASS     = "5a6da5db";
	//Link
	private static final String URL 	 = "jdbc:mysql://us-cdbr-east-06.cleardb.net:3306/?user=b5eb1be4ab5892";

	// Metodo publico estático de conexão com banco de dados
	public static Connection createConnectioToMySql() throws Exception 
	{
		// Faz com que a classe seja carregada pela JVM
		Class.forName("com.mysql.jdbc.Driver");
		 
		// Cria a conexão com banco de dados
		Connection connection = DriverManager.getConnection(URL, USERNAME, PASS);
		 
		return connection;
	}

	// Padrão SingleTon de projeto para garantir apenas uma conexão com o DB
	public static void main(String[] args) throws Exception 
	{
		// Recuperar conexão com banco de dados
		Connection con = createConnectioToMySql();
		if (con != null) 
		{
			System.out.println("Conexão obtida com sucesso");
			con.close();
		}
	}
}
