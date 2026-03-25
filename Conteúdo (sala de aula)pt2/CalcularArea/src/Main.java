
public class Main {

	public static void main(String[] args) {
		
		AreaCalculavel q = new Quadrado(5);
		AreaCalculavel r = new Retangulo(10,2);
		AreaCalculavel c = new Circulo(3);
		
		System.out.println("A área do quadrado é: " + q.calcularArea());
		System.out.println("A área do Retangulo é: " + r.calcularArea());
		System.out.println("A área do Circulo é: " + c.calcularArea());
		
		

	}

}
