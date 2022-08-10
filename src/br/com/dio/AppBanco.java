package br.com.dio;

public class AppBanco {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Deivison");
		
		Conta corrente = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);
		
		corrente.depositar(100);
		corrente.transferir(100, poupanca);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		corrente.sacar(50);
	}
}
