package Data_Hora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DiaAnterior {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Solicita ao usuário a data
	        System.out.println("Digite uma data no formato dd/MM/yyyy:");
	        String dataStr = scanner.nextLine();

	        // Define o formato da data
	        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        LocalDate data = LocalDate.parse(dataStr, formato);

	        // Calcula a terça-feira anterior
	        LocalDate terçaFeiraAnterior = data;

	        // Ajusta a data para a terça-feira anterior
	        while (terçaFeiraAnterior.getDayOfWeek().getValue() != 2) { // 2 corresponde a terça-feira
	            terçaFeiraAnterior = terçaFeiraAnterior.minusDays(1);
	        }

	        // Exibe a data da terça-feira anterior
	        System.out.println("A terça-feira anterior a " + data.format(formato) + " foi: " + terçaFeiraAnterior.format(formato));
	        
	        scanner.close();
	}

}
