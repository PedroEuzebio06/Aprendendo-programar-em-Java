package guanabara4pt1;

import java.util.Scanner;

public class IdadeAtual {

	public static void main(String[] args) {
		
		int anoNasc, idadeAtual;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite seu ano de nascimento:");
		anoNasc = teclado.nextInt();
		idadeAtual = 2026 - anoNasc;
	
		if (idadeAtual > 18) {
			System.out.println("Maior de idade, você possui " + idadeAtual + " anos");
		}else {
			System.out.println("Menor de idade, você possui " + idadeAtual + " anos");
		}
		teclado.close();

	}

}
