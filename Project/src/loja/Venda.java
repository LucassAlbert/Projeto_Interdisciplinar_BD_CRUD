package loja;
import java.util.ArrayList;
import java.util.Calendar;

public class Venda implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;
	
	private int 	 _ID	 	 ;
	private Vendedor _vendedor   ; 
    private Calendar _dataCompra ;
    public static ArrayList<Produto>_produtos  = new ArrayList<Produto>();

    public Venda(int _id, Vendedor _vendedor, int ano, int mes, int dia) 
	{
		super();
		this._ID       = _id	   ;
		this._vendedor = _vendedor ;	
		
		this._dataCompra = Calendar.getInstance()		 ;
		this._dataCompra.set(Calendar.YEAR, ano)		 ;
		this._dataCompra.set(Calendar.MONTH, mes)		 ;
		this._dataCompra.set(Calendar.DAY_OF_MONTH, dia) ;  
    
	}
    public Vendedor getVendedor()                   {  return _vendedor;                    }
    public void 	setVendedor(Vendedor _vendedor) {  this._vendedor = _vendedor;          }
  
    public Calendar getDataCompra() 				    {	 return _dataCompra;		  		  }
    public void 	setDataCompra(Calendar _dataCompra) {	 this._dataCompra = _dataCompra;	  }

    public ArrayList<Produto> getProduto()             {  return _produtos;                    }
    public void    AddProduto(Produto _nameProduto)    {  this._produtos.add(_nameProduto);    }
    public void    RemoveProduto(Produto _nameProduto) {  this._produtos.remove(_nameProduto); }
    
	public int  get_ID()		{	return _ID;		}
	public void set_ID(int _ID) {	this._ID = _ID; }
	
}
