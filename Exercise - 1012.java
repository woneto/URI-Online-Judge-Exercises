import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		Calculos calc = new Calculos(entrada.nextDouble(), entrada.nextDouble(), entrada.nextDouble());
		DecimalFormat df = new DecimalFormat("0.000");
		System.out.println("TRIANGULO: " + df.format(calc.triangulo()));
		System.out.println("CIRCULO: " + df.format(calc.circulo()));
		System.out.println("TRAPEZIO: " + df.format(calc.trapezio()));
		System.out.println("QUADRADO: " + df.format(calc.quadrado()));
		System.out.println("RETANGULO: " + df.format(calc.retangulo()));
	}

}

class Calculos {

	private double a;
	private double b;
	private double c;

	public Calculos(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double triangulo(){
		return a * c / 2;
	}
	
	public double circulo(){
		return 3.14159 * Math.pow(c, 2);
	}
	
	public double trapezio(){
		return (a + b) * c / 2;
	}
	
	public double quadrado(){
		return b * b;
	}
	
	public double retangulo(){
		return a * b;
	}
}
