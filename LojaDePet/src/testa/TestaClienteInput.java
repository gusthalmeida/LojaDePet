package testa;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import classes.Cliente;

public class TestaClienteInput {

	public static void main(String[] args) {
		//Variáveis
		String nomeCliente, nomePet, tipoPet, telefone, endereco;
		
		//Entradas
		nomeCliente = JOptionPane.showInputDialog(null, "Digite o nome do cliente: ", "Pet Shop", JOptionPane.INFORMATION_MESSAGE);
		nomePet = JOptionPane.showInputDialog(null, "Digite o nome do pet: ", "Pet Shop", JOptionPane.INFORMATION_MESSAGE);
		tipoPet = JOptionPane.showInputDialog(null, "Digite o tipo do pet: ", "Pet Shop", JOptionPane.INFORMATION_MESSAGE);
		telefone = JOptionPane.showInputDialog(null, "Digite o telefone do cliente: ", "Pet Shop", JOptionPane.INFORMATION_MESSAGE);
		endereco = JOptionPane.showInputDialog(null, "Digite o endereço do cliente: ", "Pet Shop", JOptionPane.INFORMATION_MESSAGE);
		
		//Objeto do tipo "Cliente"
		Cliente cliente = new Cliente(nomeCliente, nomePet, tipoPet, telefone, endereco);
		
		//Saída
		JOptionPane.showMessageDialog(null, cliente.mostrarDados(), "Dados do Cliente", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/imagem/petshop.png"));
	}

}
