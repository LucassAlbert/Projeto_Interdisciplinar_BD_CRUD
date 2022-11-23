package loja.factory;
//CURSO https://www.youtube.com/watch?v=-2Qgpe7T5tc
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory 
{
	//Usuario
	private static final String DBUSERNAME = "root";
	//Senha
	private static final String DBPASSWORD = "pass";
	//Link
	private static final String DBURL = "jdbc:mysql:";

	// Metodo publico estático de conexão com banco de dados
	public static Connection createConnectioToMySql() throws Exception 
	{
		// Faz com que a classe seja carregada pela JVM
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Cria a conexão com banco de dados
		try 
		{
			Connection connection = DriverManager.getConnection(DBURL, DBUSERNAME, DBPASSWORD);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("");
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
