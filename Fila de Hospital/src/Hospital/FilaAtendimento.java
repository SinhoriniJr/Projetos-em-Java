package Hospital;

import java.util.LinkedList;
import java.util.Queue;

public class FilaAtendimento {

		private Queue <Paciente> filaPreferencial = new LinkedList<Paciente>();
		private Queue <Paciente> filaNormal = new LinkedList<Paciente>();
		private Queue <Paciente> classVermelho = new LinkedList<Paciente>();
		private Queue <Paciente> classLaranja = new LinkedList<Paciente>();
		private Queue <Paciente> classAmarelo = new LinkedList<Paciente>();
		private Queue <Paciente> classVerde = new LinkedList<Paciente>();
		private Queue <Paciente> classAzul = new LinkedList<Paciente>();
		
		public void addFila (Paciente paciente) {
			
			if(paciente.getAtendimento() == TipoAtendimento.PREFERENCIAL ) {
				filaPreferencial.add(paciente);
			}else {
				filaNormal.add(paciente);
			}
		}
		public void addClassificacao(Paciente paciente) {
			
			if(paciente.getClassificacao() == TipoClassificacao.VERMELHO) {
				classVermelho.add(paciente);
			} else if (paciente.getClassificacao() == TipoClassificacao.LARANJA) {
				classLaranja.add(paciente);
			} else  if (paciente.getClassificacao() == TipoClassificacao.AMARELO) {
				classAmarelo.add(paciente);
			} else if (paciente.getClassificacao() == TipoClassificacao.VERDE) {
				classVerde.add(paciente);
			} else {
				classAzul.add(paciente);
			}
			
		}
		public void chamarPaciente() {
			
			// removendo paciente da classificação Vermelho
			
			if(!classVermelho.isEmpty()) {
				classVermelho.poll();
				
				// removendo paciente da classificação Laranja
				
			}else if(!classLaranja.isEmpty()) {
				classLaranja.poll();
			
				// removendo paciente da classificação Amarelo
				
			}else if(!classAmarelo.isEmpty() ) {
				
				
				
				if (!classAmarelo.isEmpty() || !filaNormal.isEmpty())
					classAmarelo.poll();
					filaNormal.poll();
				// removendo paciente da fila preferencial e da classificação verde
				
				if(!filaPreferencial.isEmpty() || !classVerde.isEmpty()) {
					
					classVerde.poll();
					// removendo paciente da fila preferencial e da classificação Azul
					
					if(!filaPreferencial.isEmpty() || !classAzul.isEmpty()) {
						
						
						filaPreferencial.poll();
							
						classAzul.poll();
					}
									
				}				
			} else // removendo paciente da fila normal e da classificação verde
				
				if(!filaNormal.isEmpty() || !classVerde.isEmpty()){
					
					classVerde.isEmpty();
					
					// removendo paciente da fila normal e da classificação azul
					
					if(!filaNormal.isEmpty() || !classAzul.isEmpty()){
						
						classAzul.poll();
						filaNormal.poll();
					}		
				
			} else {
				
				System.out.println("Todas as filas estão vazias.");
			}
		}
		
		public void getExibirFila() {
			
			System.out.println("\n Classificação Vermelho : ");
			for(Paciente paciente: classVermelho ) {
				System.out.println(paciente.getNome());
			}
			System.out.println("\n Classificação Laranja : ");
			for(Paciente paciente: classLaranja) {
				System.out.println(paciente.getNome());
			}
			System.out.println("\n Classificação Amarelo: ");
			for(Paciente paciente: classAmarelo) {
				System.out.println(paciente.getNome());
			}
			System.out.println("\n Classificação Verde: ");
			for(Paciente paciente: classVerde) {
				System.out.println(paciente.getNome());
			}
			System.out.println("\n Classificação Azul: ");
			for(Paciente paciente: classAzul) {
				System.out.println(paciente.getNome());
			}
			
			System.out.println("\nFila Preferencial: ");
			for(Paciente paciente: filaPreferencial) {
				System.out.println(paciente.getNome());
			}
			System.out.println("\n Fila Normal: ");
			for(Paciente paciente: filaNormal) {
				System.out.println(paciente.getNome());
			}
			System.out.println();
		}

	}


