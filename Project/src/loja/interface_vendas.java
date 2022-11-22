package loja;


import java.awt.EventQueue;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.table.TableColumn;

import org.w3c.dom.Text;

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


public class interface_vendas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	
	
	static RegistroVenda reg = new RegistroVenda();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		
		reg.carregar(reg);//Puxar arquivo salvo txt
		
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
		tabbedPane.addTab("INCLUIR", null, Incluir_pn, null);
		Incluir_pn.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INCLUIR VENDA");
		lblNewLabel.setBounds(202, 11, 400, 77);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Incluir_pn.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(263, 114, 86, 38);
		Incluir_pn.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(359, 117, 156, 33);
		Incluir_pn.add(textField);
		textField.setColumns(10);
		
		JLabel valor_txt = new JLabel("VALOR");
		valor_txt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		valor_txt.setBounds(263, 178, 86, 38);
		Incluir_pn.add(valor_txt);
		
		JLabel valor_txt_1 = new JLabel("DATA");
		valor_txt_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		valor_txt_1.setBounds(263, 244, 86, 38);
		Incluir_pn.add(valor_txt_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(359, 178, 156, 33);
		Incluir_pn.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(345, 244, 33, 33);
		Incluir_pn.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(388, 244, 33, 33);
		Incluir_pn.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(433, 244, 82, 33);
		Incluir_pn.add(textField_4);
		
		JButton btnCriar = new JButton("CRIAR");
		btnCriar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				//Acao aqui
						
				JOptionPane.showMessageDialog(null, "VENDA INCLUIDA COM SUCESSO!");
			}
		});
		btnCriar.setBounds(250, 316, 145, 52);
		Incluir_pn.add(btnCriar);
		
		JButton btnSalvar_1 = new JButton("SALVAR");
		btnSalvar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				reg.salvar(reg);
				JOptionPane.showMessageDialog(null, "ARQUIVO SALVO COM SUCESSO!");
			}
		});
		btnSalvar_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSalvar_1.setBounds(433, 316, 145, 52);
		Incluir_pn.add(btnSalvar_1);
		
		JPanel editar_pn = new JPanel();
		tabbedPane.addTab("EDITAR", null, editar_pn, null);
		editar_pn.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("CODIGO ");
		lblNewLabel_1_1.setBounds(231, 137, 80, 25);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		editar_pn.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("EDITAR VENDA");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNewLabel_2.setBounds(189, 8, 400, 77);
		editar_pn.add(lblNewLabel_2);
		
		textField_5 = new JTextField();
		textField_5.setBounds(307, 137, 130, 26);
		editar_pn.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("NOVO CODIGO ");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(231, 195, 146, 25);
		editar_pn.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("NOVO VALOR ");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(231, 231, 146, 25);
		editar_pn.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("NOVA DATA");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_2.setBounds(231, 269, 116, 25);
		editar_pn.add(lblNewLabel_1_1_1_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(370, 195, 130, 26);
		editar_pn.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(354, 231, 146, 26);
		editar_pn.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(342, 267, 35, 26);
		editar_pn.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(390, 268, 35, 26);
		editar_pn.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(435, 267, 65, 26);
		editar_pn.add(textField_10);
		
		JButton btnEditar = new JButton("OK");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "VENDA EDITADA COM SUCESSO!");
			}
		});
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnEditar.setBounds(232, 342, 145, 52);
		editar_pn.add(btnEditar);
		
		JButton btnSalvar = new JButton("SALVAR ");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				reg.salvar(reg);
				JOptionPane.showMessageDialog(null, "ARQUIVO SALVO COM SUCESSO!");
			}
		});
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSalvar.setBounds(390, 342, 145, 52);
		editar_pn.add(btnSalvar);
		
		JPanel apagar_pn = new JPanel();
		tabbedPane.addTab("APAGAR", null, apagar_pn, null);
		apagar_pn.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("APAGAR VENDA");
		lblNewLabel_2_1.setBounds(225, 11, 361, 61);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		apagar_pn.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("CODIGO ");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(225, 107, 86, 38);
		apagar_pn.add(lblNewLabel_1_2);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(309, 117, 130, 26);
		apagar_pn.add(textField_11);
		
		JButton btnEditar_1 = new JButton("OK");
		btnEditar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "VENDA APAGADA COM SUCESSO!");
			}
		});
		btnEditar_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnEditar_1.setBounds(225, 181, 145, 52);
		apagar_pn.add(btnEditar_1);
		
		JButton btnEditar_1_1 = new JButton("SALVAR");
		btnEditar_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				reg.salvar(reg);
				JOptionPane.showMessageDialog(null, "ARQUIVO SALVO COM SUCESSO!");
			}
		});
		btnEditar_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnEditar_1_1.setBounds(391, 181, 145, 52);
		apagar_pn.add(btnEditar_1_1);
		
		JPanel listar_pn = new JPanel();
		tabbedPane.addTab("LISTAR", null, listar_pn, null);
		TableColumn a = new TableColumn();
		listar_pn.setLayout(null);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("LISTAR VENDA");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNewLabel_2_1_1.setBounds(209, 11, 361, 61);
		listar_pn.add(lblNewLabel_2_1_1);
		
		JButton btnEditar_1_2 = new JButton("LISTAR");
		btnEditar_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		btnEditar_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnEditar_1_2.setBounds(295, 100, 145, 52);
		listar_pn.add(btnEditar_1_2);
		
		
		
	}
}
