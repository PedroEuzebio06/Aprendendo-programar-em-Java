
public class Circulo implements AreaCalculavel{
	
	private double r;
	private final double pi = 3.14;
	
	public Circulo(double r) {
		this.r = r;
	}
	
	public double calcularArea() {
		return Math.pow(r, 2) * pi;
	}
}
