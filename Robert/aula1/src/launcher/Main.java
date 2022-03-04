package launcher;

import aula1.Cliente;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Edilene");
		cliente.setEndereco("Rua abc");
		
		System.out.println("Nome do Cliente: " + cliente.getNome());
		System.out.println("Endereço do Cliente: " + cliente.getEndereco());
	}

}
