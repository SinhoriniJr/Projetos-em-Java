package Hospital;

import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		
		
		
		FilaAtendimento atendimento = new FilaAtendimento();
		String strNumeroDaFila;
		String strNumeroClassificacao;
		int escolha = 1;
		do {
			System.out.println("Digite 1 para ver a lista. \nDigite 2 para adicionar um novo paciente"
					+ "\nDigite 3 para chamar o proximo paciente. \nDigite 0 para sair da lista.");
			escolha = sc.nextInt();
			sc.nextLine();
			
			switch(escolha) {
			case 1:
				atendimento.getExibirFila();
				break;
				
			case 2:
				
				System.out.println("Digite o nome:");
				String nome = sc.nextLine();
				
				
				
				System.out.println("Digite 1 para Normal e 2 para Preferencial:");
				strNumeroDaFila = sc.nextLine();// nextLine foi usado para não ter problema na horá de entrada de dados por usar nextInt depois de um nextLine.
				
				int numeroDaFila = -1; //Número inválido para que não entre no if.
				
				if(strNumeroDaFila.equals("1") || strNumeroDaFila.equals("2")) {
					numeroDaFila = Integer.parseInt(strNumeroDaFila);// Conversão da String de um número para um int
				}else {
					System.out.println("Digite uma opção válida.");
					break;
				}		
				
				TipoAtendimento tipoAtendimento = null;
			
				if(numeroDaFila == 1) {
					tipoAtendimento = TipoAtendimento.NORMAL;
				} else {
					tipoAtendimento = TipoAtendimento.PREFERENCIAL;
				}
							
				System.out.println("Digite a classificação o Paciente");
				System.out.println(" 1 - Vermelho "
							   + "\n 2 - Laranja "
							   + "\n 3 - Amarelo "
							   + "\n 4 - Verde "
							   + "\n 5 - Azul ");
				
				strNumeroClassificacao = sc.nextLine();			
				
				int numeroDaClassificacao = -1; // Numero Inválido para que não entre no if.
				
				if(strNumeroClassificacao.equals("1") || strNumeroClassificacao.equals("2") || strNumeroClassificacao.equals("3") || strNumeroClassificacao.equals("4") || strNumeroClassificacao.equals("5")) {
					numeroDaClassificacao = Integer.parseInt(strNumeroClassificacao);// Conversão da String de um número para um int
				}else {
					System.out.println("Digite uma opção válida.");
					break;
				}
				
				TipoClassificacao tipoClassificacao = null;
				
				switch (numeroDaClassificacao) {
				
				case 1:
					tipoClassificacao = TipoClassificacao.VERMELHO;
					
					break;
				case 2: 
					tipoClassificacao = TipoClassificacao.LARANJA;
						
					break;
				case 3: 
					tipoClassificacao = TipoClassificacao.AMARELO;
					
					break;
				case 4: 
					tipoClassificacao = TipoClassificacao.VERDE;
						
					break;
				case 5: 
					tipoClassificacao = TipoClassificacao.AZUL;
					
					break;
				}					
				Paciente paciente = new Paciente(nome, tipoAtendimento, tipoClassificacao);
				atendimento.addFila(paciente);
				atendimento.addClassificacao(paciente);
				System.out.println();
				System.out.println("Paciente " + paciente.getNome() + " adicionado na fila " + paciente.getAtendimento()+ " na classificação " +paciente.getClassificacao());
						
				break;
				
			case 3:
				
				atendimento.chamarPaciente();
				
				break;
			
			case 0: 
				break;
				
			default:
				System.out.println("Opção inválida.");
				break;
					
			}
			
			
		}while(escolha != 0);
		
		sc.close();
	}

}
