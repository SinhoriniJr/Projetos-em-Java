package Lista_construtores_Heranca;

public class Fogao extends Eletrodomestico {

	double capacidadeBocas;

	public Fogao(String modelo, String fabricante, double kwDia, double capacidadeBocas) {
		super(modelo, fabricante, kwDia);
		this.capacidadeBocas = capacidadeBocas;
	}

	public Fogao() {
		super();
	}

	public double getCapacidaBocas() {
		return capacidadeBocas;
	}

	public void setCapacidaBocas(double capacidaBocas) {
		this.capacidadeBocas = capacidaBocas;
	}

}
