package Lista_construtores_Heranca;

public class Lava_Louca extends Eletrodomestico {

	double capacidadeLitros;

	public Lava_Louca(String modelo, String fabricante, double kwDia, double capacidadeLitros) {
		super(modelo, fabricante, kwDia);
		this.capacidadeLitros = capacidadeLitros;
	}

	public Lava_Louca() {
		super();
	}

	public double getCapacidadeLitros() {
		return capacidadeLitros;
	}

	public void setCapacidadeLitros(double capacidadeLitros) {
		this.capacidadeLitros = capacidadeLitros;
	}

}
