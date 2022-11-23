package loja;
import java.util.Calendar;

public class Produto 
{
	private int 	 _ID				;
	private String   _nome				;
	private float    _preco				;
	private int      _codigoProduto     ; 
	private Calendar _dataDeFabricacao	;
	
	
	public Produto(int _ID, String _nome, float _preco,int _codigoProduto /*, int ano, int mes, int dia */ ) 
	{
		super();
		this.set_ID(_ID)	 ;
		this._nome  		= _nome	 ;
		this._preco 		= _preco ;
		this._codigoProduto = _codigoProduto;
		
		this._dataDeFabricacao = Calendar.getInstance()		   ;
		//this._dataDeFabricacao.set(Calendar.YEAR, ano)		   ;
		//this._dataDeFabricacao.set(Calendar.MONTH, mes)		   ;
		//this._dataDeFabricacao.set(Calendar.DAY_OF_MONTH, dia) ;
	} 

	
	
	public String getNome()			   	{		return _nome;				}
	public void setNome(String _nome)   {		this._nome = _nome;			}
	
	
	public float getPreco() 			{		return _preco;				}
	public void setPreco(float _preco)	{		this._preco = _preco;		}

  
	public int getCodigoProduto() 				         {  	return _codigoProduto;					}
	public void setCodigoProduto(int  _codigoProduto)	 {		this._codigoProduto = _codigoProduto;	}
	

	public Calendar getDataDeFab() 	                     {		return _dataDeFabricacao;						}
	public void setDataDeFab(Calendar _dataDeFabricacao) {		this._dataDeFabricacao = _dataDeFabricacao;		}



	public int get_ID()			{	return _ID;			}
	public void set_ID(int _ID) {	this._ID = _ID; 	}
	
	
}
