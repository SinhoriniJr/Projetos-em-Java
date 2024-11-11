package Data_Hora;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Fuso_Horario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Define o formato para entrada da data e hora
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Solicita ao usuário a data e hora em horário de Brasília
        System.out.println("Digite a data e hora no horário de Brasília (formato dd/MM/yyyy HH:mm):");
        String dataHoraBrasilStr = scanner.nextLine();

        // Converte a entrada para LocalDateTime e aplica o fuso horário de Brasília
        LocalDateTime dataHoraBrasil = LocalDateTime.parse(dataHoraBrasilStr, formato);
        ZonedDateTime dataHoraBrasilia = dataHoraBrasil.atZone(ZoneId.of("America/Sao_Paulo"));

        // Converte para os fusos horários de Nova York, Paris e Japão
        ZonedDateTime dataHoraNovaYork = dataHoraBrasilia.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime dataHoraParis = dataHoraBrasilia.withZoneSameInstant(ZoneId.of("Europe/Paris"));
        ZonedDateTime dataHoraJapao = dataHoraBrasilia.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

        // Formata a data e hora para cada localidade e exibe no idioma local
        DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Nova York
        String diaSemanaNY = dataHoraNovaYork.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.US);
        System.out.println("Nova York: " + dataHoraNovaYork.format(formatoDataHora) + " (" + diaSemanaNY + ")");

        // Paris
        String diaSemanaParis = dataHoraParis.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.FRANCE);
        System.out.println("Paris: " + dataHoraParis.format(formatoDataHora) + " (" + diaSemanaParis + ")");

        // Japão
        String diaSemanaJapao = dataHoraJapao.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.JAPAN);
        System.out.println("Japão: " + dataHoraJapao.format(formatoDataHora) + " (" + diaSemanaJapao + ")");
        
        scanner.close();
	}

}
