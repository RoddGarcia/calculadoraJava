package calculadora;
import java.util.Scanner;

public class Calc {
	
	Scanner userinp = new Scanner(System.in);
	public void sum() {
		System.out.println("Digite o primeiro número");
		String num1 = userinp.nextLine().trim().replace(",", ".");
		System.out.println("Digite o segundo número");
		String num2 = userinp.nextLine().trim().replace(",", ".");
		double total = (Double.parseDouble(num1)+Double.parseDouble(num2));
		System.out.printf("Resultado: %.2f \n", total);
	}
	
	public void sub() {
		System.out.println("Digite o primeiro número");
		String num1 = userinp.nextLine().trim().replace(",", ".");
		System.out.println("Digite o segundo número");
		String num2 = userinp.nextLine().trim().replace(",", ".");
		double total = (Double.parseDouble(num1)-Double.parseDouble(num2));
		System.out.printf("Resultado: %.2f \n", total);
	}
	
	public void multi() {
		System.out.println("Digite o primeiro número");
		String num1 = userinp.nextLine().trim().replace(",", ".");
		System.out.println("Digite o segundo número");
		String num2 = userinp.nextLine().trim().replace(",", ".");
		double total = (Double.parseDouble(num1)*Double.parseDouble(num2));
		System.out.printf("Resultado: %.2f \n", total);
	}
	
	public void div() {
		System.out.println("Digite o primeiro número");
		String num1 = userinp.nextLine().trim().replace(",", ".");
		System.out.println("Digite o segundo número");
		String num2 = userinp.nextLine().trim().replace(",", ".");
		double total = (Double.parseDouble(num1)/Double.parseDouble(num2));
		System.out.printf("Resultado: %.2f \n", total);
	}
	
	public void pot() {
		System.out.println("Digite o número");
		String num1 = userinp.nextLine().trim().replace(",", ".");
		System.out.println("Você deseja elevar o número à qual potencia?");
		double potencia = userinp.nextDouble();
		System.out.println("Resultado: "+(Math.pow(Integer.parseInt(num1), potencia)));
	}
	
	public void fat() {
		int num = 0;
		System.out.println("Digite o número");
		String num1 = userinp.nextLine().trim().replace(",", ".");
		
		for (int i = (Integer.parseInt(num1) - 1); i > 1; i--){
			num = Integer.parseInt(num1) * i;
		}
		
		System.out.println("Resultado: "+num);
	}

	public void bhaskara() {
		System.out.println("Digite o primeiro número");
		String num1 = userinp.nextLine().replace(",", ".");
		System.out.println("Digite o segundo número");
		String num2 = userinp.nextLine().replace(",", ".");
		System.out.println("Digite o terceiro número");
		String num3 = userinp.nextLine().replace(",", ".");
		
		double a = Double.parseDouble(num1);
		double b = Double.parseDouble(num2);
		double c = Double.parseDouble(num3);
		
		double delta = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
		System.out.println("Delta: "+delta);
		
		double bhaskara1 = ( ( (b * -1) + delta ) / (2 * a) );
		double bhaskara2 = ( ( (b * -1) - delta ) / (2 * a) );
		
		System.out.printf("Resultado: %.2f e %.2f \n", bhaskara1, bhaskara2);
	}
	
	public void areas() {
		System.out.println("Selecione o número da forma geométrica que deseja calcular a área:");
		System.out.println("QUADRADO (0), RETÂNGULO(1), TRIÂNGULO(2), CÍRCULO(3), LOSANGO(4), TRAPÉZIO(5)");
		int choice = userinp.nextInt();
		
		switch (choice) {
		default:
			System.out.println("Não entendi. Verifique se digitou o número correto.");
			
		case 0: // quadrado
			System.out.println("Qual o valor do lado?");
			double a = userinp.nextDouble();
			System.out.printf("Área do quadrado: %.2f \n",Math.pow(a, 2));
			
		case 1: // retângulo
			System.out.println("Qual o valor da altura?");
			double hRet = userinp.nextDouble();
			System.out.println("Qual o valor da base?");
			double bRet = userinp.nextDouble();
			double aRet = hRet * bRet;
			System.out.printf("Área do retângulo: %.2f \n",aRet);
			
		case 2: // triângulo
			System.out.println("Qual o valor da altura?");
			double hTri = userinp.nextDouble();
			System.out.println("Qual o valor da base?");
			double bTri = userinp.nextDouble();
			double aTri = (hTri * bTri)/2;
			System.out.printf("Área do triângulo: %.2f \n",aTri);
			
		case 3: // círculo
			System.out.println("Qual o valor do raio?");
			double rCir = userinp.nextDouble();
			double aCir = Math.PI * Math.pow(rCir, 2);
			System.out.printf("Área do círculo: %.2f \n",aCir);
			
		case 4: // losângo
			System.out.println("Qual o valor da diagonal maior?");
			double dMaiLos = userinp.nextDouble();
			System.out.println("Qual o valor da diagonal menor?");
			double dMenLos = userinp.nextDouble();
			double aLos = (dMaiLos * dMenLos)/2;
			System.out.printf("Área do losângo: %.2f \n",aLos);
			
		case 5: // trapézio
			System.out.println("Qual o valor da base maior?");
			double bMaiTra = userinp.nextDouble();
			System.out.println("Qual o valor da base menor?");
			double bMenTra = userinp.nextDouble();
			System.out.println("Qual o valor da altura?");
			double hTra = userinp.nextDouble();
			double aTra = ((bMaiTra + bMenTra) * hTra)/2;
			System.out.printf("Área do trapézio: %.2f \n",aTra);
		
		}
		
	}
}
