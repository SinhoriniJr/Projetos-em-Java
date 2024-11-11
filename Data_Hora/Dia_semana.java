package Data_Hora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Dia_semana {
	public static void main(String[] args) {
	
	 Scanner scanner = new Scanner(System.in);

     // Solicita a data ao usuário
     System.out.println("Digite uma data no formato dd/MM/yyyy:");
     String dataInput = scanner.nextLine();

     // Define o formato da data
     DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     LocalDate data = LocalDate.parse(dataInput, formato);

     // Obtém o dia da semana e exibe em português
     String diaSemana = data.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));

     System.out.println("O dia da semana é: " + diaSemana);
     scanner.close();
	}

}
