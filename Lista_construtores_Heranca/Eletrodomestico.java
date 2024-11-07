package Lista_construtores_Heranca;

public class Eletrodomestico {

	String modelo;
	String fabricante;
	double kwDia;

	public Eletrodomestico(String modelo, String fabricante, double kwDia) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.kwDia = kwDia;
	}

	public Eletrodomestico() {
		super();
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getKwDia() {
		return kwDia;
	}

	public void setKw(double kw) {
		this.kwDia = kw;
	}

	public double calcularConsumo() {
		return this.getKwDia() * 30;
	}

	public double calcularConsumo(int dias) {
		return this.getKwDia() * dias;
	}

}
