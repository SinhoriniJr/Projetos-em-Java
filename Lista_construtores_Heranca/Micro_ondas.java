package Lista_construtores_Heranca;

public class Micro_ondas extends Eletrodomestico {

	double capacidadeLitros;

	public Micro_ondas(String modelo, String fabricante, double kwDia, double capacidadeLitros) {
		super(modelo, fabricante, kwDia);
		this.capacidadeLitros = capacidadeLitros;
	}

	public Micro_ondas() {
		super();
	}

	public double getCapacidadeLitros() {
		return capacidadeLitros;
	}

	public void setCapacidadeLitros(double capacidadeLitros) {
		this.capacidadeLitros = capacidadeLitros;
	}

}
