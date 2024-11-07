package Lista_Construtores_heranca_2;

public class Serrote extends FerramentaManual {
	private double tamanhoPolegada;
	private int qtdDentes;
	
	public Serrote(String modelo, String fabricante, double peso, int porcentualDesgasteHora, String tipo,
			double tamanhoPolegada, int qtdDentes) {
		super(modelo, fabricante, peso, porcentualDesgasteHora, tipo);
		this.tamanhoPolegada = tamanhoPolegada;
		this.qtdDentes = qtdDentes;
	}

	public Serrote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getTamanhoPolegada() {
		return tamanhoPolegada;
	}

	public void setTamanhoPolegada(double tamanhoPolegada) {
		this.tamanhoPolegada = tamanhoPolegada;
	}

	public int getQtdDentes() {
		return qtdDentes;
	}

	public void setQtdDentes(int qtdDentes) {
		this.qtdDentes = qtdDentes;
	}
	

}
