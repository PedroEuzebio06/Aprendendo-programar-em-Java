//Desenvolva um programa em Java que recebe o peso de uma pessoa, calcula e mostra:
//• O novo peso, se a pessoa engordar 15% sobre o peso digitado.
//• O novo peso, se a pessoa emagrece 20% sobre o peso digitado.

import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		// declare as variaveis
		double peso, engordar, emagrecer;
		
		// instacionar um objeto da classe Scanner
		Scanner teclado = new Scanner(System.in);
		engordar = 0.15; // representa os 15%
		emagrecer = 0.20; // representa os 20%
		
		System.out.println("Digite seu peso atual: ");
		peso = teclado.nextDouble();
		
		engordar = peso * (1 + engordar);
		emagrecer = peso * (1 - emagrecer);
		
		System.out.println("Caso você engorde 15%, seu novo peso será: " + engordar);
		System.out.println("Caso você emagreça 20%, seu novo peso será: " + emagrecer);
		teclado.close();

	}

}
