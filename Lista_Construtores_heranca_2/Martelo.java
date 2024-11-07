package Lista_Construtores_heranca_2;

public class Martelo extends FerramentaManual {
	private double tamanhoMilimetro;

	public Martelo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Martelo(String modelo, String fabricante, double peso, int porcentualDesgasteHora, String tipo,
			double tamanhoMilimetro) {
		super(modelo, fabricante, peso, porcentualDesgasteHora, tipo);
		this.tamanhoMilimetro = tamanhoMilimetro;
	}

	public double getTamanhoMilimetro() {
		return tamanhoMilimetro;
	}

	public void setTamanhoMilimetro(double tamanhoMilimetro) {
		this.tamanhoMilimetro = tamanhoMilimetro;
	}

	
}
