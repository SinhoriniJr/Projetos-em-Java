package Lista_construtores_Heranca;

public class Cozinha {

	public static void main(String[] args) {
		
		Geladeira gl = new Geladeira("Frost Free", "Bastemp", 3, 443);
		Fogao fg = new Fogao("Super Qunete", "Eletrolux" , 7, 6 );
		Lava_Louca ll = new Lava_Louca ("LL14X" , "Eletrolux", 4,46);
		Micro_ondas mc = new Micro_ondas("SP67LSUK", "Panasonic", 3,43);
		Forno_eletrico fe = new Forno_eletrico("Forninho","Mondial", 3,35);
		double consumoMensal = gl.calcularConsumo()
							+ fg.calcularConsumo()
							+ ll.calcularConsumo()
							
							+ mc.calcularConsumo()
							+ fe.calcularConsumo();
		System.out.println("Consumo mensal da cozinha é: " +consumoMensal);
		
		double consumoPeriodo = gl.calcularConsumo(10)
							  +  fg.calcularConsumo(10)
							  +  ll.calcularConsumo(10)
							  +  mc.calcularConsumo(10)
							  +  fe.calcularConsumo(10);
		System.out.println("Consumo no periodo de 10 dias da cozinha é: " +consumoPeriodo);

	}

}
