//Adriana comprou um saco de ração com peso em quilos. Ela possui dois gatos, para os
//quais fornece a quantidade de ração em gramas. A quantidade diária de ração
//fornecida para cada gato é sempre a mesma. Faça um programa em Java que receba
//o peso do saco de ração e a quantidade de ração fornecida para cada gato, calcule e
//mostre quanto restará de ração no saco após cinco dias.


import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o peso do saco de ração(kg): ");
        double pesoSacoKg = teclado.nextDouble();

        System.out.print("Digite a quantidade de ração para cada gato(gramas): ");
        double racaoPorGato = teclado.nextDouble();

        // 1. Converter peso do saco para gramas
        double pesoSacoG = pesoSacoKg * 1000;

        // 2. Calcular consumo total diário (2 gatos)
        double consumoDiarioTotal = racaoPorGato * 2;

        // 3. Calcular o que sobra após 5 dias
        double totalRestante = pesoSacoG - (consumoDiarioTotal * 5);

        // Resultado
        if (totalRestante < 0) {
            System.out.println("A ração acabará antes de 5 dias.");
        } else {
            System.out.printf("Após 5 dias, restarão %.2f gramas no saco.%n", totalRestante);
        }

        teclado.close();
    }
}