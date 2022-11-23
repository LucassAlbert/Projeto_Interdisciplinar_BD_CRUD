package loja.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import loja.Produto;
import loja.factory.ConnectionFactory;

public class ProdutoDAO 
{
	/*
	 * CRUD
	 * C: CREATE
	 * R: READ
	 * U: UPDATE
	 * D: DELETE
	 * 
	 */
	public void Create(Produto produto) 
	{
		String sql 		 = "INSERT INTO `heroku_433dc25ad0e292e`.`produto` (`idproduto`, `Nome`, `preco`, `codigo`, `data`) VALUES (?, ?, ?, ?, ?);";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try 
		{
			//Criar uma conexão com o banco de dados 
			conn = ConnectionFactory.createConnectioToMySql();
			
			//Criamos uma PreparedStatemenr, para executar uma query
			pstm = conn.prepareStatement(sql);
			pstm.setInt   (1, produto.get_ID());
			pstm.setString(2, produto.getNome());
			pstm.setFloat (3, produto.getPreco());
			pstm.setInt   (4, produto.getCodigoProduto());
			pstm.setDate  (5, new Date(0));
			//pstm.setDate  (4,  produto.getDataDeFab().getTime());
			
			//Executar query
			pstm.execute();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			//Fechar as conexoes
			try 
			{
				if(pstm != null) {		pstm.close();	}
				if(conn != null) {		conn.close();	}
					
			} catch (Exception e2) {		e2.printStackTrace();		}
		}
	}
	
	public void Update(Produto produto, String value) 
	{
		String sql 		 = "UPDATE `heroku_433dc25ad0e292e`.`produto` SET `idproduto` = ?, `Nome` = ?, `preco` = ?, `codigo` = ? WHERE (`idproduto` = ?);";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try 
		{
			//Criar uma conexão com o banco de dados 
			conn = ConnectionFactory.createConnectioToMySql();
			
			//Criamos uma PreparedStatemenr, para executar uma query
			pstm = conn.prepareStatement(sql);
			pstm.setInt   (1, produto.get_ID());
			pstm.setString(2, produto.getNome());
			pstm.setFloat (3, produto.getPreco());
			pstm.setInt   (4, produto.getCodigoProduto());
			pstm.setString  (5,value);
			
			//Executar query
			pstm.execute();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			//Fechar as conexoes
			try 
			{
				if(pstm != null) {		pstm.close();	}
				if(conn != null) {		conn.close();	}
					
			} catch (Exception e2) {		e2.printStackTrace();		}
		}
	}

	public void Read(Produto produto, String value) 
	{
		String sql 	  		   = "UPDATE `heroku_433dc25ad0e292e`.`produto` SET `idproduto` = ?, `Nome` = ?, `preco` = ?, `codigo` = ? WHERE (`idproduto` = ?);";
		
		Connection conn 	   = null;
		PreparedStatement pstm = null;
		
		try 
		{
			//Criar uma conexão com o banco de dados 
			conn = ConnectionFactory.createConnectioToMySql();
			
			//Criamos uma PreparedStatemenr, para executar uma query
			pstm = conn.prepareStatement(sql);
			pstm.setInt   (1, produto.get_ID());
			pstm.setString(2, produto.getNome());
			pstm.setFloat (3, produto.getPreco());
			pstm.setInt   (4, produto.getCodigoProduto());
			pstm.setString (5,value);
			
			//Executar query
			pstm.execute();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			//Fechar as conexoes
			try 
			{
				if(pstm != null) {		pstm.close();	}
				if(conn != null) {		conn.close();	}
					
			} catch (Exception e2) {		e2.printStackTrace();		}
		}
	}
	public void delete(int value) 
	{
		
		String sql = "DELETE FROM `heroku_433dc25ad0e292e`.`produto` WHERE (`idproduto` = ?);";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try 
		{
			//Criar uma conexão com o banco de dados 
			conn = ConnectionFactory.createConnectioToMySql();
			
			//Criamos uma PreparedStatemenr, para executar uma query
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, String.valueOf(value));
			
			//Executar query
			pstm.execute();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			//Fechar as conexoes
			try 
			{
				if(pstm != null) {		pstm.close();	}
				if(conn != null) {		conn.close();	}
					
			} catch (Exception e2) {		e2.printStackTrace();		}
		}
	}
}
