package Data_Hora;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class HoraChegada {

	public static void main(String[] args) {
		
		  // Define a data e hora de partida em São Paulo (horário de Brasília)
        LocalDateTime partidaSaoPaulo = LocalDateTime.of(2024, 11, 11, 19, 0);

        // Aplica o fuso horário de São Paulo
        ZonedDateTime partidaSaoPauloZoned = partidaSaoPaulo.atZone(ZoneId.of("America/Sao_Paulo"));

        // Duração da viagem: 11 horas e 20 minutos
        ZonedDateTime chegadaParisZoned = partidaSaoPauloZoned.plusHours(11).plusMinutes(20).withZoneSameInstant(ZoneId.of("Europe/Paris"));

        // Formato de exibição
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Exibe o horário de chegada em Paris
        System.out.println("O horário de chegada em Paris será: " + chegadaParisZoned.format(formato));
    
        
	}

}
