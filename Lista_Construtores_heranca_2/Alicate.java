package Lista_Construtores_heranca_2;

public class Alicate extends FerramentaManual{
	private double  tamanhoPolegada;

	public Alicate(double tamanhoPolegada) {
		super();
		this.tamanhoPolegada = tamanhoPolegada;
	}

	public Alicate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getTamanhoPolegada() {
		return tamanhoPolegada;
	}

	public void setTamanhoPolegada(double tamanhoPolegada) {
		this.tamanhoPolegada = tamanhoPolegada;
	}
	

}
