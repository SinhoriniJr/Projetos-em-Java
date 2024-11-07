package Lista_Construtores_heranca_2;

public class FerramentaManual extends Ferramenta{
	private String tipo;

	public FerramentaManual(String modelo, String fabricante, double peso, int porcentualDesgasteHora, String tipo) {
		super(modelo, fabricante, peso, porcentualDesgasteHora);
		this.tipo = tipo;
	}

	public FerramentaManual() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

}
