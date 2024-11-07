package Exemplos;

public class Conta {

	// Caracteristicas Atributos

	private String banco;
	private int agencia;
	private int numero;
	private String titular;
	private double saldo;
	
	// Construtores 
	
	public Conta(String banco, int agencia, int numero, String titular, double saldo) {
		super();
		this.banco = banco;
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Conta() {
		super();
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// Ações - Metodos

	public double depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);

		return this.getSaldo();
	}

	@Override
	public String toString() {
		return "Banco" + this.banco + 
				", \n agencia = " + this.agencia + 
				", \n numero = " + this.numero + 
				", \n titular = " + this.titular+ 
				", \n saldo = " + this.saldo;
	}
	

}
