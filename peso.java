package AAula1teste;
import java.util.Scanner;

public class peso {

	public static void main(String[] args) {

		
		

		Scanner s = new Scanner(System.in);
		
		String peso;
		String altura;
	
		boolean continuar = true;
		
		do {

			System.out.print("QUAL SEU PESO : ");
			peso = s.nextLine();
			
			System.out.print("QUAL SUA ALTURA: ");
			altura = s.nextLine();
			
			double pesoEmQuilograma = Double.parseDouble(peso);
			double alturaEmMetros = Double.parseDouble(altura);
			double imc = pesoEmQuilograma / ( alturaEmMetros * alturaEmMetros);
			String msg = (imc >=20 && imc <=25 )? "Peso Ideal" : "Fora do Peso";
			System.out.println(msg);

			
		}while(continuar);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
