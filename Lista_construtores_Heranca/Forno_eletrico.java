package Lista_construtores_Heranca;

public class Forno_eletrico extends Eletrodomestico {

	private double capacidadLitros;

	public Forno_eletrico(String modelo, String fabricante, double kwDia, double capacidadLitros) {
		super(modelo, fabricante, kwDia);
		this.capacidadLitros = capacidadLitros;
	}

	public double getCapacidadLitros() {
		return capacidadLitros;
	}

	public void setCapacidadLitros(double capacidadLitros) {
		this.capacidadLitros = capacidadLitros;
	}

	public double calcularConsumo() {
		return (this.getKwDia() * 30) + this.calcularDesperdicio();
	}

	public double calcularConsumo(int dias) {
		return super.calcularConsumo(dias) + this.calcularDesperdicio(dias);
	}

	private double calcularDesperdicio() {
		return this.getKwDia() * 30 * 0.25;
	}

	private double calcularDesperdicio(int dias) {
		return super.calcularConsumo(dias) * 0.25;
	}

}
