package Lista_Construtores_heranca_2;

public class FerramentaEletrica extends Ferramenta {
	private int rotacao;
	private double potencia;
	private double tensao;

	public FerramentaEletrica(String modelo, String fabricante, double peso, int porcentualDesgasteHora, int rotacao,
			double potencia, double tensao) {
		super(modelo, fabricante, peso, porcentualDesgasteHora);
		this.rotacao = rotacao;
		this.potencia = potencia;
		this.tensao = tensao;
	}

	public FerramentaEletrica() {
		super();

	}

	public int getRotacao() {
		return rotacao;
	}

	public void setRotacao(int rotacao) {
		this.rotacao = rotacao;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public double getTensao() {
		return tensao;
	}

	public void setTensao(double tensao) {
		this.tensao = tensao;
	}
}
