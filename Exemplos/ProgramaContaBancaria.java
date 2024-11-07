package Exemplos;

import java.util.ArrayList;

public class ProgramaContaBancaria {

	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente();

		cc1.setBanco("Banco do Brasil");
		cc1.setAgencia(1);
		cc1.setNumero(123);
		cc1.setTitular("Milton");
		cc1.setSaldo(1000);
		cc1.setLimite(100);

		double saldoAtual = cc1.depositar(500);

		System.out.println("Novo saldo - Deposito: " + saldoAtual);
		saldoAtual = cc1.sacar(1000);
		if (saldoAtual != -1) {
			System.out.println("Novo saldo - Saque: " + saldoAtual);
		} else {
			System.out.println("O valor do saque excede a limite da conta");

		}

		ContaPoupanca cp1 = new ContaPoupanca();
		cp1.setBanco("Caixa Economica");
		cp1.setAgencia(1);
		cp1.setNumero(321);
		cp1.setTitular("Milton");
		cp1.setSaldo(300);

		double valor = cp1.depositar(200);

		System.out.println("Saldo da conta poupança é: " + valor);

		if (cp1.sacar(300)) {
			System.out.println("Novo saldo - Saque: " + cp1.getSaldo());
		} else {
			System.out.println("O valor do saque excede a limite da conta");
		}
		
		ContaCorrente c1 = new ContaCorrente("BB", 1, 123, "Adriano", 1000, 100);
		ContaCorrente c2 = new ContaCorrente("Caixa", 2, 213, "Melo", 2000, 20);
		ContaCorrente c3 = new ContaCorrente("BB", 1, 321, "Sara", 3000, 300);
		ContaCorrente c4 = new ContaCorrente("Bradesco", 4,1234, "Maria", 4000, 400);
		
		ArrayList<ContaCorrente> lista = new ArrayList<>();
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);
		
		for (ContaCorrente c : lista) {
			System.out.println(c);
			System.out.println(" \n ----------- \n");
		}
		
	}
}
