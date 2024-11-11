package Data_Hora;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DuraçãoPartida {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);

     // Formato de hora para entrada
     DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

     // Solicita o horário de início da partida
     System.out.println("Digite o horário de início da partida (formato HH:mm):");
     String inicioStr = scanner.nextLine();
     LocalTime inicio = LocalTime.parse(inicioStr, formatoHora);

     // Solicita o horário de término da partida
     System.out.println("Digite o horário de término da partida (formato HH:mm):");
     String fimStr = scanner.nextLine();
     LocalTime fim = LocalTime.parse(fimStr, formatoHora);

     // Calcula a duração da partida
     Duration duracao = Duration.between(inicio, fim);
     long horas = duracao.toHours();
     long minutos = duracao.toMinutes() % 60;

     // Exibe o tempo total da partida
     System.out.println("A partida durou " + horas + " horas e " + minutos + " minutos.");
     scanner.close();
	}
}
