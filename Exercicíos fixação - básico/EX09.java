//Juliana recebeu seu salário e precisa pagar duas contas atrasadas. Em razão do atraso,
//ele pagará multa de 2% sobre cada conta. Desenvolva um programa em Java que
//recebe o valor do salário e das duas contas, calcule e apresente quanto sobrará do
//salário de Juliana.

import java.util.Scanner;

public class EX09 {

	public static void main(String[] args) {
		// declare as variaveis
		double vlrSalario, conta1, conta2, restoSalario, Desconto;
		
		// instancionar um objeto da classe Scanner
		Scanner teclado = new Scanner(System.in);
		Desconto= 0.02; // Representa 2%
		
		System.out.println("Digite o valor do salário de Juliana: ");
		vlrSalario = teclado.nextDouble();
		
		System.out.println("Digite o valor da conta 1: ");
		conta1 = teclado.nextDouble();
		
		System.out.println("Digite o valor da conta 2: ");
		conta2 = teclado.nextDouble();
		
		conta1 = conta1 + (1 + Desconto);
		
		conta2 = conta2 + (1 + Desconto);
		
		restoSalario = vlrSalario - (conta1 + conta2);
		
		System.out.println("Sobrará " + restoSalario + " reais do salário de Juliana");
		teclado.close();
	}

}
