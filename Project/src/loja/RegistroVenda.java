package loja;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import java.util.ArrayList;
import java.util.Calendar;



public class RegistroVenda implements java.io.Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8750229004907802921L;
	ArrayList<Venda> vendas = new ArrayList<Venda>();

	public static void main(String[] args) 
	{
		RegistroVenda regVenda = new RegistroVenda();
		
		File f = new File("Registro.txt");
		
		if (f.isFile() && f.canRead())
		{
			try{ 
				
				FileInputStream fi = new FileInputStream(new File("Registro.txt"));
				ObjectInputStream oi = new ObjectInputStream(fi);
				
				regVenda = (RegistroVenda) oi.readObject();
				oi.close();
				fi.close();  
				
	           }
			catch(Exception e)
				{
		        	   System.out.println("Ocorreu um erro");
		        	   e.printStackTrace();
				}   
		}	
		//regVenda.insereVendas(new Venda("8457"   , 50, 2020,0,17));
		//regVenda.removeVenda("894584");
		
		//regVenda.removeVenda("5010", regVenda);
		regVenda.salvar(regVenda);
		
		regVenda.vendas.forEach((n)->{System.out.println("Cdodigo = "+n.getCodigo());});
		
	}
	

	/**
	 * Insere uma nova Venda na lista
	 * @param venda
	 */
	public void insereVendas(Venda novaVenda )
	{
		vendas.add(novaVenda);
		
	}
	
	
	public void editVenda(RegistroVenda reg, String cod, String codigo, float valor, int ano, int mes, int dia)
	{
		for(int i = 0; i < reg.vendas.size(); i++ ) 
		{
			 if(reg.vendas.get(i).getCodigo() == cod) 
			 {
				 reg.vendas.get(i).setCodigo(codigo);
				 reg.vendas.get(i).setValor(valor);
				 reg.vendas.get(i).setData(dia,mes,ano);	
					
			 }
		} 
		
		
	}
	
	public void salvar(RegistroVenda reg) 
	{
		try{ 
			
			FileOutputStream registro_file = new FileOutputStream(new File("Registro.txt"));
			ObjectOutputStream registro_obj = new ObjectOutputStream(registro_file);
			
			registro_obj.writeObject(reg);
			registro_obj.close();
			registro_file.close();   
			
			System.out.println("Salvo em disco!!");
			
           }
		catch(Exception e)
			{
	        	   System.out.println("Ocorreu um erro");
	        	   e.printStackTrace();
			} 
	}
	
	
	public void carregar(RegistroVenda reg) 
	{

		File f = new File("Registro.txt");
		
		if (f.isFile() && f.canRead())
		{
			try{ 
				
				FileInputStream fi = new FileInputStream(new File("Registro.txt"));
				ObjectInputStream oi = new ObjectInputStream(fi);
				
				reg = (RegistroVenda) oi.readObject();
				oi.close();
				fi.close();  
				
	           }
			catch(Exception e)
				{
		        	   System.out.println("Ocorreu um erro");
		        	   e.printStackTrace();
				}  
		}
	}
	
	
	
	
	/**
	 * Retorna o valor medio das vendas
	 * @return
	 */
	public float valorMedio() 
	{
		int soma = 0;
		
		for(int i = 0; i < vendas.size(); i++ ) 
		{
			soma += vendas.get(i).getValor();
		}
		
		return (float) soma/vendas.size();
	}
	
	
	
	/**
	 * Retorna o valor total das vendas
	 * @return
	 */
	public float tostalVendas() 
	{
		float total = 0;
		
		for(int i = 0; i < vendas.size(); i++ ) 
		{
			total += vendas.get(i).getValor();
		}
		
		return total;
	}
	
	/**
	 *Encontrar o objeto Venda de maior valor
	 */
	public Venda maiorVenda() 
	{
		Venda maior = new Venda();
		
		
		for(int i = 0; i < vendas.size(); i++ ) 
		{
			if(maior.getValor() < vendas.get(i).getValor()) 
			{
				maior.setCodigo(vendas.get(i).getCodigo());
				maior.setValor(vendas.get(i).getValor());  
				maior.setData(
							      vendas.get(i).getData().get(Calendar.DAY_OF_MONTH),
							      vendas.get(i).getData().get(Calendar.MONTH),
							      vendas.get(i).getData().get(Calendar.YEAR)
							 	);
			}
				
		}
		
		return maior;
	}
	
	

}