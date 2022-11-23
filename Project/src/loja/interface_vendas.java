package loja;

import java.awt.EventQueue;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.table.TableColumn;

import org.w3c.dom.Text;

import loja.dao.ProdutoDAO;

import javax.swing.JTabbedPane;

import java.awt.Button;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;


public class interface_vendas extends JFrame 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField textCreateID;
	private JTextField textCreateNome;
	private JTextField textCreateDate_D;
	private JTextField textCreateDate_M;
	private JTextField textCreateDate_A;
	private JTextField textDeleteID;
	private JTextField textReadID;
	private JTextField textCreatePreco;
	private JTextField textCreateCodigo;
	private JTextField textUpdateID;
	private JTextField textUpdateNome;
	private JTextField textUpdatePreco;
	private JTextField textUpdateCodigo;
	private JTextField textUpdateDia_D;
	private JTextField textUpdateDia_M;
	private JTextField textUpdateDia_A;
	private JTextField textUpdateNovoID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					interface_vendas frame = new interface_vendas();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public interface_vendas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 847, 617);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 823, 569);
		contentPane.add(tabbedPane);
		
		JPanel Incluir_pn = new JPanel();
		tabbedPane.addTab("CREATE", null, Incluir_pn, null);
		Incluir_pn.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INCLUIR PRODUTO");
		lblNewLabel.setBounds(176, 10, 435, 77);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Incluir_pn.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(252, 114, 86, 38);
		Incluir_pn.add(lblNewLabel_1);
		
		textCreateID = new JTextField();
		textCreateID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textCreateID.setBounds(348, 117, 156, 33);
		Incluir_pn.add(textCreateID);
		textCreateID.setColumns(10);
		
		JLabel valor_txt = new JLabel("NOME");
		valor_txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		valor_txt.setBounds(252, 159, 86, 38);
		Incluir_pn.add(valor_txt);
		
		JLabel valor_txt_1 = new JLabel("DATA");
		valor_txt_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		valor_txt_1.setBounds(252, 307, 65, 38);
		Incluir_pn.add(valor_txt_1);
		
		textCreateNome = new JTextField();
		textCreateNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textCreateNome.setColumns(10);
		textCreateNome.setBounds(348, 162, 156, 33);
		Incluir_pn.add(textCreateNome);
		
		textCreateDate_D = new JTextField();
		textCreateDate_D.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textCreateDate_D.setColumns(10);
		textCreateDate_D.setBounds(348, 307, 33, 33);
		Incluir_pn.add(textCreateDate_D);
		
		textCreateDate_M = new JTextField();
		textCreateDate_M.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textCreateDate_M.setColumns(10);
		textCreateDate_M.setBounds(391, 307, 33, 33);
		Incluir_pn.add(textCreateDate_M);
		
		textCreateDate_A = new JTextField();
		textCreateDate_A.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textCreateDate_A.setColumns(10);
		textCreateDate_A.setBounds(436, 307, 68, 33);
		Incluir_pn.add(textCreateDate_A);
		
		JButton btnSalvar_1 = new JButton("CRIAR");
		btnSalvar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(null, "ID: "+ textCreateID.getText()+"\nNOME: "+ textCreateNome.getText());
				try 
				{
					ProdutoDAO produtoDAO = new ProdutoDAO();
					
					Produto produto = new Produto(
													Integer.parseInt(textCreateID.getText()), 		// ID
													textCreateNome.getText(),						// Nome
													Float.parseFloat(textCreatePreco.getText()),	// Preco
													Integer.parseInt(textCreateCodigo.getText())	// Codigo
													//Integer.parseInt(textCreateDate_D.getText()),	// Dia
													//Integer.parseInt(textCreateDate_M.getText()),	// Mes
													//Integer.parseInt(textCreateDate_A.getText()) 	// Ano
												 );	 
					 
					produtoDAO.Create(produto);
					JOptionPane.showMessageDialog(null, "PRODUTO SALVO COM SUCESSO!");
				} 
				catch (Exception e2) 
				{
					JOptionPane.showMessageDialog(null, "Algo deu errado!");
				}
				
			}
		});
		btnSalvar_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSalvar_1.setBounds(316, 379, 145, 52);
		Incluir_pn.add(btnSalvar_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("PRECO");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_2.setBounds(252, 207, 86, 38);
		Incluir_pn.add(lblNewLabel_1_2_2);
		
		textCreatePreco = new JTextField();
		textCreatePreco.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textCreatePreco.setColumns(10);
		textCreatePreco.setBounds(345, 211, 159, 33);
		Incluir_pn.add(textCreatePreco);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("CODIGO ");
		lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_2_1.setBounds(252, 255, 86, 38);
		Incluir_pn.add(lblNewLabel_1_2_2_1);
		
		textCreateCodigo = new JTextField();
		textCreateCodigo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textCreateCodigo.setColumns(10);
		textCreateCodigo.setBounds(345, 259, 159, 33);
		Incluir_pn.add(textCreateCodigo);
		
		JPanel editar_pn = new JPanel();
		tabbedPane.addTab("UPDATE", null, editar_pn, null);
		editar_pn.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("ATUALIZAR PRODUTO");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNewLabel_2.setBounds(124, 10, 583, 77);
		editar_pn.add(lblNewLabel_2);
		
		JButton btnEditar = new JButton("ATUALIZAR");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try 
				{
					ProdutoDAO produtoDAO = new ProdutoDAO();
					
					Produto produto = new Produto(
													Integer.parseInt(textUpdateID.getText()), 		// ID
													textUpdateNome.getText(),						// Nome
													Float.parseFloat(textUpdatePreco.getText()),	// Preco
													Integer.parseInt(textUpdateCodigo.getText())	// Codigo
												 );	 
					 
					produtoDAO.Update(produto, textUpdateNovoID.getText() );
					JOptionPane.showMessageDialog(null, "PRODUTO ATUALIZADO COM SUCESSO!");
				} 
				catch (Exception e2) 
				{
					JOptionPane.showMessageDialog(null, "ALGO DEU ERRADO!");
				}
			}
		});
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnEditar.setBounds(271, 437, 177, 52);
		editar_pn.add(btnEditar);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(230, 181, 86, 38);
		editar_pn.add(lblNewLabel_1_1);
		
		textUpdateID = new JTextField();
		textUpdateID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textUpdateID.setColumns(10);
		textUpdateID.setBounds(326, 184, 156, 33);
		editar_pn.add(textUpdateID);
		
		JLabel valor_txt_2 = new JLabel("NOME");
		valor_txt_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		valor_txt_2.setBounds(230, 226, 86, 38);
		editar_pn.add(valor_txt_2);
		
		textUpdateNome = new JTextField();
		textUpdateNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textUpdateNome.setColumns(10);
		textUpdateNome.setBounds(326, 229, 156, 33);
		editar_pn.add(textUpdateNome);
		
		JLabel lblNewLabel_1_2_2_2 = new JLabel("PRECO");
		lblNewLabel_1_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_2_2.setBounds(230, 274, 86, 38);
		editar_pn.add(lblNewLabel_1_2_2_2);
		
		textUpdatePreco = new JTextField();
		textUpdatePreco.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textUpdatePreco.setColumns(10);
		textUpdatePreco.setBounds(323, 278, 159, 33);
		editar_pn.add(textUpdatePreco);
		
		JLabel lblNewLabel_1_2_2_1_1 = new JLabel("CODIGO ");
		lblNewLabel_1_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_2_1_1.setBounds(230, 322, 86, 38);
		editar_pn.add(lblNewLabel_1_2_2_1_1);
		
		textUpdateCodigo = new JTextField();
		textUpdateCodigo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textUpdateCodigo.setColumns(10);
		textUpdateCodigo.setBounds(323, 326, 159, 33);
		editar_pn.add(textUpdateCodigo);
		
		JLabel valor_txt_1_1 = new JLabel("DATA");
		valor_txt_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		valor_txt_1_1.setBounds(230, 374, 65, 38);
		editar_pn.add(valor_txt_1_1);
		
		textUpdateDia_D = new JTextField();
		textUpdateDia_D.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textUpdateDia_D.setColumns(10);
		textUpdateDia_D.setBounds(326, 374, 33, 33);
		editar_pn.add(textUpdateDia_D);
		
		textUpdateDia_M = new JTextField();
		textUpdateDia_M.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textUpdateDia_M.setColumns(10);
		textUpdateDia_M.setBounds(369, 374, 33, 33);
		editar_pn.add(textUpdateDia_M);
		
		textUpdateDia_A = new JTextField();
		textUpdateDia_A.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textUpdateDia_A.setColumns(10);
		textUpdateDia_A.setBounds(414, 374, 68, 33);
		editar_pn.add(textUpdateDia_A);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("NOVO ID");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(230, 117, 86, 38);
		editar_pn.add(lblNewLabel_1_1_1);
		
		textUpdateNovoID = new JTextField();
		textUpdateNovoID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textUpdateNovoID.setColumns(10);
		textUpdateNovoID.setBounds(326, 120, 156, 33);
		editar_pn.add(textUpdateNovoID);
		
		JPanel apagar_pn = new JPanel();
		tabbedPane.addTab("DELETE", null, apagar_pn, null);
		apagar_pn.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("DELETAR PRODUTO");
		lblNewLabel_2_1.setBounds(121, 10, 525, 61);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		apagar_pn.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("ID");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(261, 97, 32, 38);
		apagar_pn.add(lblNewLabel_1_2);
		
		textDeleteID = new JTextField();
		textDeleteID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textDeleteID.setColumns(10);
		textDeleteID.setBounds(303, 108, 130, 26);
		apagar_pn.add(textDeleteID);
		
		JButton btnEditar_1 = new JButton("DELETAR");
		btnEditar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try 
				{
					ProdutoDAO produtoDAO = new ProdutoDAO();
					 
					produtoDAO.delete(Integer.parseInt(textDeleteID.getText()));
					JOptionPane.showMessageDialog(null, "PRODUTO DELETADO COM SUCESSO!");
				} 
				catch (Exception e2) 
				{
					JOptionPane.showMessageDialog(null, "ALGO DEU ERRADO!");
				}
				textDeleteID.setText("Olá");
			}
		});
		btnEditar_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnEditar_1.setBounds(272, 159, 145, 52);
		apagar_pn.add(btnEditar_1);
		
		JPanel listar_pn = new JPanel();
		tabbedPane.addTab("READ", null, listar_pn, null);
		TableColumn a = new TableColumn();
		listar_pn.setLayout(null);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("LISTAR VENDA");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNewLabel_2_1_1.setBounds(209, 11, 361, 61);
		listar_pn.add(lblNewLabel_2_1_1);
		
		JButton btnEditar_1_2 = new JButton("MOSTRAR");
		btnEditar_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		btnEditar_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnEditar_1_2.setBounds(285, 171, 145, 52);
		listar_pn.add(btnEditar_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("ID");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1.setBounds(267, 98, 31, 38);
		listar_pn.add(lblNewLabel_1_2_1);
		
		textReadID = new JTextField();
		textReadID.setColumns(10);
		textReadID.setBounds(308, 109, 130, 26);
		listar_pn.add(textReadID);
		
		
		
	}
}
