package guanabara6;

public class Contador {

	public static void main(String[] args) {
		
		int cc = 0;
		while (cc <= 20) {
			cc++;
			if (cc == 7) {
				break;
			}
			System.out.println("Cambalhota " + cc);
		}
	}
}
