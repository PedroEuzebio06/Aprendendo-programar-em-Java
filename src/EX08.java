//Cada degrau de uma escada tem X de altura. Desenvolva um programa em Java que
//receba essa altura e a altura que o usuário deseja subir. Mostre quantos degraus o
//usuário deverá subir para atingir seu objetivo. Todas as medias estão em metros.

import java.util.Scanner;

public class EX08 {

	public static void main(String[] args) {
		// declare as variaveis
		double alturaDegrau, alturaSubir, qntsDegraus;
		
		// instanciar um objeto da classe Scanner
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual a altura do degrau(m)? ");
		alturaDegrau = teclado.nextDouble();
		
		System.out.println("Qual altura você deseja subir(m)? ");
		alturaSubir = teclado.nextDouble();
		
		qntsDegraus = alturaSubir / alturaDegrau;
		
		System.out.println("Para atingir a altura especulada, você deverá subir " + qntsDegraus + " degraus" );
		teclado.close();
		
	
	
	}

}
