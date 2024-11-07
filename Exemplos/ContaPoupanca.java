package Exemplos;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String banco, int agencia, int numero, String titular, double saldo) {
		super(banco, agencia, numero, titular, saldo);
	}

	public ContaPoupanca() {
		super();
		
	}

	// Ações - Metodos
	public boolean sacar(double valor) {
		boolean retorno = false;
		if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			retorno = true;
		}
		return retorno;
	}

}
