//Faça um programa em Java que calcule o valor em reais, correspondente aos dólares
//que um turista possui no cofre do hotel. O programa deve receber a quantidade de
//dólares guardados no cofre e a cotação do dólar naquele dia.

import java.util.Scanner;
public class EX05 {

	public static void main(String[] args) {
		// declarar variaveis
		double dolares, cotacaoDolar, vlrReais;
		
		// instanciar um objeto da classe scanner
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor em doláres que possui: ");
		dolares = teclado.nextDouble();
		
		System.out.println("Digite a cotação atual do dólar: ");
		cotacaoDolar = teclado.nextDouble();
		
		vlrReais = dolares * cotacaoDolar;
		
		System.out.printf("Você possui " + vlrReais + " reais");
		teclado.close();

	}

}
