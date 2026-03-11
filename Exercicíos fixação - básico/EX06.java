//Faça um programa em Java para receber o valor do quilowatt de energia e a
//quantidade consumida por uma residência em um mês. Com esses dados, o programa
//deve calcular e mostrar:
//• O valor, em reais, a ser pago por essa residência.
//• O valor, em reais, a ser pago com desconto de 15%.

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		// declare as variaveis
		double vlrQuilowatt, qntdConsumida, vlrPago, vlrDesconto, percentualDesconto;
		
		// instanciar um objeto da classe Scanner
		Scanner teclado = new Scanner(System.in);
		percentualDesconto = 0.15; // representa os 15%
		
		System.out.println("Digite o valor do quilowatt de energia: ");
		vlrQuilowatt = teclado.nextDouble();
		
		System.out.println("Digite a quantidade consumida em um mês: ");
		qntdConsumida = teclado.nextDouble();
		
		vlrPago = vlrQuilowatt * qntdConsumida;
		vlrDesconto = vlrPago * (1 - percentualDesconto);
		
		System.out.println("O valor total a ser pago é " + vlrPago + " reais");
		System.out.println("O valor com desconto de 15% a ser pago é: " + vlrDesconto + " reais");
		teclado.close();

	}

}
