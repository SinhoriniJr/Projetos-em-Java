package Lista_construtores_Heranca;

public class Lavadora_Roupas extends Eletrodomestico {

	double capacidadeQuilos;

	public Lavadora_Roupas(String modelo, String fabricante, double kwDia, double capacidadeQuilos) {
		super(modelo, fabricante, kwDia);
		this.capacidadeQuilos = capacidadeQuilos;
	}

	public Lavadora_Roupas() {
		super();

	}

	public double getCapacidadeQuilos() {
		return capacidadeQuilos;
	}

	public void setCapacidadeQuilos(double capacidadeQuilos) {
		this.capacidadeQuilos = capacidadeQuilos;
	}

}
