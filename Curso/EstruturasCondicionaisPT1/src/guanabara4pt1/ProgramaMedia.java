package guanabara4pt1;

import java.util.Scanner;

public class ProgramaMedia {

	public static void main(String[] args) {
		
		    try (Scanner teclado = new Scanner(System.in)) {
				float n1, n2, m;
				
				System.out.print("Digite sua nota 1: ");
				n1 = teclado.nextFloat();
				System.out.print("Digite sua nota 2: ");
				n2 = teclado.nextFloat();
				m = (n1 + n2)/2;
				System.out.println("Sua média foi: " + m);
				if (m>6) {
					System.out.println("Parabéns, você foi aprovado!!!");
				}else {
					System.out.println("Você foi reprovado.");
				}
			}

	}

}