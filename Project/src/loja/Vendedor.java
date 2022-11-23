package loja;

public class Vendedor implements java.io.Serializable
{
	
	private static final long serialVersionUID = 1450297841564455600L;
	
	private String  _nome	 ;
	private String  _CPF	 ;
	private Gerente _gerente ;
	
	public Vendedor(String _nome, String _CPF, Gerente _gerente) 
	{
		super();
		this._nome 	  =   _nome		 ;
		this._CPF 	  =   _CPF	 	 ;
		this._gerente =   _gerente 	 ;
	}
	
	public String getNome()			  		 {		return _nome;				}
	public void setNome(String _nome) 		 {		this._nome = _nome;			}

	
	public String getCPF() 		 			 {		return _CPF;				}
	public void setCPF(String _CPF) 		 {		this._CPF = _CPF;			}
	
	public Gerente getGerente() 			 {		return _gerente;			}
	public void setGerente(Gerente _gerente) {		this._gerente = _gerente;	}
	
}
