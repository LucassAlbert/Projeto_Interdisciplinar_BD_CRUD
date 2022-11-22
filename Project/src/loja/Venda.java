package loja;

import java.util.Calendar;

public class Venda implements java.io.Serializable
{

	private static final long serialVersionUID = 1L;
	
	private String codigo;
	private float valor;
	private Calendar data;
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Calendar getData(){		return data;		}
	public void setData(int dia, int mes, int ano) {
		
		this.data  = Calendar.getInstance();
		this.data.set(Calendar.YEAR, ano);
		this.data.set(Calendar.MONTH, mes);
		this.data.set(Calendar.DAY_OF_MONTH, dia);
	}
	
	
	public Venda()
	{
		this.codigo = "";
		this.valor = 0;
		this.data  = Calendar.getInstance();
	}
	
	public Venda(String codigo, float valor, int ano, int mes, int dia)
	{
		super();
		this.codigo = codigo;
		this.valor = valor;
		
		this.data  = Calendar.getInstance();
		this.data.set(Calendar.YEAR, ano);
		this.data.set(Calendar.MONTH, mes);
		this.data.set(Calendar.DAY_OF_MONTH, dia);
		
	}
	
	

}
