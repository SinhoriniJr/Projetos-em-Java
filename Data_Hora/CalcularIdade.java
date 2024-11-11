package Data_Hora;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalcularIdade {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Solicita a data de nascimento ao usuário
	        System.out.println("Digite sua data de nascimento no formato dd/MM/yyyy:");
	        String dataNascimentoStr = scanner.nextLine();

	        // Define o formato da data
	        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formato);
	        
	        // Obtém a data atual
	        LocalDate dataAtual = LocalDate.now();
	        
	        // Calcula o período entre a data de nascimento e a data atual
	        Period idade = Period.between(dataNascimento, dataAtual);
	        
	        // Obtém os anos, meses e dias da idade
	        int anos = idade.getYears();
	        int meses = idade.getMonths();
	        int dias = idade.getDays();
	        
	        // Exibe a idade do usuário em anos, meses e dias
	        System.out.println("Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias.");
	       scanner.close();
	}

}
