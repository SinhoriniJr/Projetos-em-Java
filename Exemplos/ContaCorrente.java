package Exemplos;

public class ContaCorrente extends Conta {

	private double limite;

	// Construtores

	public ContaCorrente(String banco, int agencia, int numero, String titular, double saldo, double limite) {
		super(banco, agencia, numero, titular, saldo);
		this.limite = limite;
	}

	public ContaCorrente() {
		super();
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	// Ações - Metodos
	public double sacar(double valor) {
		double novoValor = -1;
		if (this.getSaldo() >= valor) {
			novoValor = this.getSaldo() - valor;
			this.setSaldo(novoValor);

		}
		if (this.getSaldo() + this.getLimite() >= valor) {
			novoValor = this.getSaldo() + this.getLimite() - valor;
			this.setSaldo(novoValor);

		}
		return novoValor;
	}

	@Override
	public String toString() {
		return "ContaCorrente " + "\n" +super.toString()+
				 "\nlimite = " + limite ;
	}
	
}
