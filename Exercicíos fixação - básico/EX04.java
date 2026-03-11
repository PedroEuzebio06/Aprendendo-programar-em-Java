//Uma loja de informática está vendendo seus produtos em 5 (cinco) prestações sem
//juros. Faça um programa em Java que recebe o valor de uma compra, calcule e mostre
//o valor das prestações.

import java.util.Scanner;
public class EX04 {

	public static void main(String[] args) {
		//declarar variaveis
		double valorCompra, valorPrestacoes;
		int numeroParcelas;
		
		//instanciar um objeto da classe scanner
				Scanner teclado = new Scanner(System.in);
				numeroParcelas = 5; // valor fixo
		
		System.out.println("Digite o valor da compra: ");
		valorCompra = teclado.nextDouble();
		
		valorPrestacoes = valorCompra / numeroParcelas;
		
		System.out.printf("O valor da parcela será: " + valorPrestacoes + " reais sem juros");
		teclado.close();

	}

}
