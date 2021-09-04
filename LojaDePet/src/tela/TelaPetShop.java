package tela;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import classes.Cliente;

public class TelaPetShop extends JFrame {
	public JLabel nomePet, nomeCliente, endereco, telefone, tipoPet;
	public JTextField jtfNome, jtfPet, jtfEndereco, jtfTelefone, jtfTipoPet;
	public JButton jbCadastrar;
	
	//Construtor
	public TelaPetShop(String title){
		super(title);
		setSize(600, 300);
		setLayout(null);
		getContentPane().setBackground(Color.cyan);
		iniciarComponentes();
		criarEventos();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void iniciarComponentes() {
		nomeCliente = new JLabel("Digite o nome do cliente");
		nomePet = new JLabel("Digite o nome do pet");
		endereco = new JLabel("Digite o endereço do cliente");
		telefone = new JLabel("Digite o telefone do cliente");
		tipoPet = new JLabel("Digite o tipo do pet");
		jtfNome = new JTextField();
		jtfPet = new JTextField();
		jtfEndereco = new JTextField();
		jtfTelefone = new JTextField();
		jtfTipoPet = new JTextField();
		jbCadastrar = new JButton("Cadastrar");
		
		add(nomeCliente);
		add(nomePet);
		add(endereco);
		add(telefone);
		add(tipoPet);
		add(jtfNome);
		add(jtfPet);
		add(jtfEndereco);
		add(jtfTelefone);
		add(jtfTipoPet);
		add(jbCadastrar);
		
		nomeCliente.setBounds(20, 20, 300, 20); // coluna, linha, largura, altura
		jtfNome.setBounds(20, 40, 250, 20);;
		nomePet.setBounds(20, 60, 300, 20);
		jtfPet.setBounds(20, 80, 250, 20);
		telefone.setBounds(20, 100, 300, 20);
		jtfTelefone.setBounds(20, 120, 250, 20);
		endereco.setBounds(20, 140, 300, 20);
		jtfEndereco.setBounds(20, 160, 250, 20);
		tipoPet.setBounds(20, 180, 250, 20);
		jtfTipoPet.setBounds(20, 200, 250, 20);
		jbCadastrar.setBounds(350, 80, 150, 100);
		
	}

	private void criarEventos() {
		jbCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nomeCliente = jtfNome.getText();
				String nomePet = jtfPet.getText();
				String telefone = jtfTelefone.getText();
				String endereco = jtfEndereco.getText();
				String tipoPet = jtfTipoPet.getText();
				Cliente cliente = new Cliente(nomeCliente, nomePet, tipoPet, telefone, endereco);
				JOptionPane.showMessageDialog(null, cliente.mostrarDados());
				
			}
		});
		
	}
	
	
	
	
}
