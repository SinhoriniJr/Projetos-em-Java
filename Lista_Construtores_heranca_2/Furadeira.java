package Lista_Construtores_heranca_2;

public class Furadeira extends FerramentaEletrica{

	public Furadeira(String modelo, String fabricante, double peso, int porcentualDesgasteHora, int rotacao,
			double potencia, double tensao) {
		super(modelo, fabricante, peso, porcentualDesgasteHora, rotacao, potencia, tensao);
	}

	public Furadeira() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
