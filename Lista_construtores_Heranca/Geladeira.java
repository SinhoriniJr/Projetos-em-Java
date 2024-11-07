package Lista_construtores_Heranca;

public class Geladeira extends Eletrodomestico {

	double capacidadeLitros;

	public Geladeira(String modelo, String fabricante, double kwDia, double capacidadeLitros) {
		super(modelo, fabricante, kwDia);
		this.capacidadeLitros = capacidadeLitros;
	}

	public Geladeira() {
		super();

	}

	public double getCapacidadeLitros() {
		return capacidadeLitros;
	}

	public void setCapacidadeLitros(double capacidadeLitros) {
		this.capacidadeLitros = capacidadeLitros;
	}

}
