package Data_Hora;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TempoVida {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Solicita a data e hora de nascimento do usuário
	        System.out.println("Digite sua data e hora de nascimento no formato dd/MM/yyyy HH:mm:ss:");
	        String dataHoraNascimentoStr = scanner.nextLine();

	        // Define o formato de data e hora
	        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	        LocalDateTime dataHoraNascimento = LocalDateTime.parse(dataHoraNascimentoStr, formato);

	        // Obtém a data e hora atual
	        LocalDateTime dataHoraAtual = LocalDateTime.now();

	        // Calcula a duração entre a data e hora de nascimento e a data e hora atual
	        Duration duracao = Duration.between(dataHoraNascimento, dataHoraAtual);
	        
	        // Obtém o total de horas, minutos e segundos
	        long horas = duracao.toHours();
	        long minutos = duracao.toMinutes();
	        long segundos = duracao.getSeconds();

	        // Exibe o tempo total de vida em horas, minutos e segundos
	        System.out.println("Você já viveu:");
	        System.out.println(horas + " horas");
	        System.out.println(minutos + " minutos");
	        System.out.println(segundos + " segundos");
	        scanner.close();

	}

}
