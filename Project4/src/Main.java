import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// declarar variaveis
		int numero1, numero2, soma;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro:"));
		
		soma = numero1 + numero2;
		
		JOptionPane.showMessageDialog(null, "Soma = " + soma);

	}

}
