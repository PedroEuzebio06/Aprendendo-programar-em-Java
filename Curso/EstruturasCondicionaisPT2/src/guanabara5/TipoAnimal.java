package guanabara5;

import java.util.Scanner;

public class TipoAnimal {

	public static void main(String[] args) {
		
		int perna;
		String tipo;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quantas pernas? ");
		perna = teclado.nextInt();
		
		System.out.println("Isso é um(a): ");
		switch (perna) {
		case 1: tipo = "Saci"; break;
		case 2: tipo = "Bípede"; break;
		case 3: tipo = "Tripé"; break;
		case 4: tipo = "Quadrupede"; break;
		case 6: tipo = "Aranha"; break;
		default: tipo = "ET"; break;
		}
		System.out.println(tipo);
		teclado.close();
	}

}
