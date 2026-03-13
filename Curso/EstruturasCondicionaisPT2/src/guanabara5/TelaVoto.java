package guanabara5;

import java.util.Scanner;

public class TelaVoto {

	public static void main(String[] args) {
		// declare as variaveis 
		int anoNasc, idade;
		
		// Instancie um objeto da classe Scanner
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite seu ano de nascimento");
		anoNasc = teclado.nextInt();
		
		idade = 2026 - anoNasc;
		
		if (idade < 16) {
			System.out.println("Você ainda não tem direito ao voto.");
		} else {
			if ((idade >= 16 && idade <18) || (idade >70)) {
				System.out.println("Seu voto é opcional");
			} else {
				System.out.println("Seu voto é obrigatório");
			}
		}
		teclado.close();
	}

}
