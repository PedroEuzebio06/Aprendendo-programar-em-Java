//Um hotel deseja fazer uma promoção especial de final de semana, concedendo um
//desconto no valor normal da diária. Faça um programa em Java que recebe o valor da
//diária e o percentual de desconto que será concedido, calcule e mostre o valor da
//diária com desconto

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		// instanciar um objeto da classe scanner
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		
		// declarar variaveis
		double valorDiaria, percDesconto, valorDesconto, novoValor;
		
		System.out.println("Digite o valor da diária: ");
		valorDiaria = teclado.nextDouble();
		
		System.out.println("Digite o percentual de desconto: ");
		percDesconto = teclado.nextDouble();
		
		valorDesconto = valorDiaria * (percDesconto / 100);
		novoValor = valorDiaria - valorDesconto;
		
		System.out.println("O novo valor da diária é: " + novoValor);

	}

}
