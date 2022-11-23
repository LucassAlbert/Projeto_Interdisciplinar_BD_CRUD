package loja;

import java.util.ArrayList;

public class Gerente 
{
	private String   _nome	;
	private String   _CPF		;

	private ArrayList<Vendedor> _vendedor = new ArrayList<Vendedor>();
	
	public Gerente(String _nome, String _CPF) 
	{
		super();
		this._nome    =   _nome		;
		this._CPF     =   _CPF	 	;
	}
 
	public String getNome()			   		{		return _nome;					    }
	public void setNome(String _nome) {		this._nome = _nome;				}

	
	public String getCPF() 		 				{		return _CPF;					    }
	public void setCPF(String _CPF) 	{		this._CPF = _CPF;				  }


	public ArrayList<Vendedor> getVendedor() 	  {		return _vendedor;				          }
	public void setVendedor(Vendedor _vendedor) {		this._vendedor.add(_vendedor);   	}	

}
