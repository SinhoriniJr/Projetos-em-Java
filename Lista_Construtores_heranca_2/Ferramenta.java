package Lista_Construtores_heranca_2;

public class Ferramenta {
	private String modelo;
	private String fabricante;
	private double peso;
	private int porcentualDesgasteHora;
	
	public Ferramenta(String modelo, String fabricante, double peso, int porcentualDesgasteHora) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.peso = peso;
		this.porcentualDesgasteHora = porcentualDesgasteHora;
	}
	
	public Ferramenta() {
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
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getPorcentualDesgasteHora() {
		return porcentualDesgasteHora;
	}
	public void setPorcentualDesgasteHora(int porcentualDesgasteHora) {
		this.porcentualDesgasteHora = porcentualDesgasteHora;
	}
	public double calcularVidaUtil() {
		return (100/this.porcentualDesgasteHora);
	}
	
	public double calcularVidaUtil (String periodo) {
		double retorno = 0;
		if (periodo.toLowerCase().equals("semana")) {
			retorno = this.calcularVidaUtil()/24/7;
		}else {
			retorno = this.calcularVidaUtil()/24;
		}
		return retorno;
	}

}
