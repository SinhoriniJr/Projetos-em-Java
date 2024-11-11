package Data_Hora;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class HoraVoo {

	public static void main(String[] args) {
		  // Define o horário de partida em Paris
        LocalDateTime partidaParis = LocalDateTime.of(2024, 11, 11, 19, 0);

        // Aplica o fuso horário de Paris
        ZonedDateTime partidaParisZoned = partidaParis.atZone(ZoneId.of("Europe/Paris"));

        // Define o horário de chegada em São Paulo
        LocalDateTime chegadaSaoPaulo = LocalDateTime.of(2024, 11, 12, 1, 20);

        // Aplica o fuso horário de São Paulo
        ZonedDateTime chegadaSaoPauloZoned = chegadaSaoPaulo.atZone(ZoneId.of("America/Sao_Paulo"));

        // Calcula a duração do voo subtraindo a partida da chegada
        long duracaoHoras = java.time.Duration.between(partidaParisZoned, chegadaSaoPauloZoned).toHours();
        long duracaoMinutos = java.time.Duration.between(partidaParisZoned, chegadaSaoPauloZoned).toMinutes() % 60;

        // Exibe o tempo de duração do voo
        System.out.println("O voo durou " + duracaoHoras + " horas e " + duracaoMinutos + " minutos.");

	}

}
