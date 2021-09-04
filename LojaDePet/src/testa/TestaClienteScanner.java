package testa;

import java.util.Scanner;

import classes.Cliente;

public class TestaClienteScanner {

	public static void main(String[] args) {
		//Variáveis
		String nomeCliente, nomePet, tipoPet, telefone, endereco;
		
		
		//Objeto da classe scanner
		Scanner entrada = new Scanner(System.in);
		
		//Entradas
		System.out.print("Digite o nome do cliente: ");
		nomeCliente = entrada.nextLine();
		
		System.out.print("Digite o nome do pet: ");
		nomePet = entrada.nextLine();
		
		System.out.print("Digite o tipo do pet: ");
		tipoPet = entrada.nextLine();
		
		System.out.print("Digite o telefone do cliente: ");
		telefone = entrada.nextLine();
		
		System.out.print("Digite o endereço do cliente: ");
		endereco = entrada.nextLine();
		
		//Sa�da
		Cliente cliente = new Cliente(nomeCliente, nomePet, tipoPet, telefone, endereco);
		System.out.println(cliente.mostrarDados());
	}

}
