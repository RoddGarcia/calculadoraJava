package calculadora;
import java.util.Scanner;

public class Final {

	public static void main(String[] args) {
		// pegar terminal do user, ler números, qual operação o usuário quer fazer;
		Calc calculo = new Calc();
		Scanner userinp = new Scanner(System.in);
		boolean parar = false;
		
		do {
			System.out.println("\nEsta calculadora realiza cálculos como SOMA, SUBTRAÇÃO, MULTIPLICAÇÃO, DIVISÃO, POTENCIAÇÃO, FATORIAL, BHASKARA e GEOMETRIA");
			
			System.out.println("Qual operação deseja realizar?");
			String choice = userinp.nextLine();
			
			
			if (choice.toUpperCase().trim().equals("SOMA")) {
				
				calculo.sum();
			}
			
			else if (choice.toUpperCase().trim().equals("SUBTRACAO") || 
					choice.toUpperCase().trim().equals("SUBTRAÇÃO")) {
				
				calculo.sub();
			}
			
			else if (choice.toUpperCase().trim().equals("MULTIPLICACAO") || 
					choice.toUpperCase().trim().equals("MULTIPLICAÇÃO")) {
				
				calculo.multi();
			}
			
			else if (choice.toUpperCase().trim().equals("DIVISAO") || 
					choice.toUpperCase().trim().equals("DIVISÃO")) {

				calculo.div();
			}
			
			else if (choice.toUpperCase().trim().equals("POTENCIAÇÃO") || 
					choice.toUpperCase().trim().equals("POTENCIACAO")) {
				
				calculo.pot();
			}
			
			else if (choice.toUpperCase().trim().equals("FATORIAL")) {
				
				calculo.fat();
			}
			
			else if (choice.toUpperCase().trim().equals("BHASKARA")) {

				calculo.bhaskara();
			}
			
			else if (choice.toUpperCase().trim().equals("GEOMETRIA")) {
				
				calculo.areas();
			}
			
			
			System.out.print("Deseja usar novamente a calculadora? ");
			String userChoice = userinp.nextLine();
			if (userChoice.trim().toUpperCase().equals("N") || 
					userChoice.trim().toUpperCase().equals("NÃO") ||
					userChoice.trim().toUpperCase().equals("NAO")) {
				parar = true;
			}
		
		} while (parar == false);
		
		System.out.println("A calculadora foi desligada.");
		System.out.println("Projeto desenvolvido por: Rodrigo Garcia de Carvalho.");
		
		userinp.close();
	}
}