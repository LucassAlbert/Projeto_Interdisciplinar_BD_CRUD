package loja;

public class Cliente 
{
	private String   _nome	  ;
	private String   _CPF	  ;
	private String 	 _contato ;
	private Venda    _venda   ;
 
	public Cliente(String _nome, String _CPF, String _contato) 
	{
		super();
		this._nome    = _nome	 ;
		this._CPF     = _CPF	 ;
		this._contato = _contato ;
	}
	
	public String getNome()			   		{		return _nome;			  }
	public void setNome(String _nome) 		{		this._nome = _nome;		  }

	
	public String getCPF() 		 			{		return _CPF;			  }
	public void setCPF(String _CPF) 		{		this._CPF = _CPF;		  }


	public String getContato() 				{		return _contato;		  }
	public void setContato(String _contato) {		this._contato = _contato; }
	
	
	public Venda getVenda() 			    {		return _venda;			  }
	public void setVenda(Venda _venda)      {		this._venda = _venda;	  }
			
}
