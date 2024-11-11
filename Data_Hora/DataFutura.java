package Data_Hora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class DataFutura {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Solicita o número de dias ao usuário
	        System.out.println("Digite um número de dias:");
	        int dias = scanner.nextInt();

	        // Obtém a data atual e adiciona os dias informados
	        LocalDate dataFutura = LocalDate.now().plusDays(dias);

	        // Formata a data futura
	        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        String dataFormatada = dataFutura.format(formato);

	        // Obtém o dia da semana em português
	        String diaSemana = dataFutura.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));

	        // Exibe a mensagem com a data futura e o dia da semana
	        System.out.println("Daqui a " + dias + " dias será dia " + dataFormatada + " (" + diaSemana + ").");
	        scanner.close();
	}

}
