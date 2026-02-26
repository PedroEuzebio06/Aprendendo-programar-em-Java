//Faça um programa em Java que receba o custo de um espetáculo teatral e o preço do
//convite desse espetáculo. Esse programa deverá calcular e mostrar a quantidade de
//convites que devem ser vendidos para que, pelo menos, o custo do espetáculo seja
//alcançado.

import java.util.Scanner;

public class EX02 {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
    	// instanciar um objeto da classe scanner
        Scanner teclado = new Scanner(System.in);
        
        //declarar variaveis
		double qntdVend, custoEspetaculo, precoCnvt;
        
        System.out.println("Digite o custo do espetaculo: ");
        custoEspetaculo = teclado.nextDouble();
        
        System.out.println("Digite o valor do ingresso: ");
        precoCnvt = teclado.nextDouble();
        
        qntdVend = Math.ceil(custoEspetaculo / precoCnvt);
        
        System.out.printf("Para cobrir o custo de R$ %.2f, será necessário vender: %.0f convites.%n", 
                custoEspetaculo, qntdVend);

        
    }
}
