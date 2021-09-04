package classes;

public class Cliente {
	
	//Atributos
	public String nomeCliente, nomePet, tipoPet, telefone, endereco;
	
	
	//Construtor
	public Cliente(String nomeCliente, String nomePet, String tipoPet, String telefone, String endereco) {
		this.nomeCliente = nomeCliente;
		this.nomePet = nomePet;
		this.tipoPet = tipoPet;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	//Método
	public String mostrarDados() {
		return "Nome do Cliente: " + nomeCliente + "\nNome do Pet: " + nomePet + "\nTipo do Pet: " + tipoPet + "\nTelefone: " + telefone + "\nEndereço: " + endereco;
	}
	
}
	
	

